package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.BidDetail;
import com.qianfeng.springboot.bean.BorrowMoney;
import com.qianfeng.springboot.bean.TbUser;
import com.qianfeng.springboot.bean.TradingRecord;
import com.qianfeng.springboot.dao.*;
import com.qianfeng.springboot.service.IDCBLendYService;
import com.qianfeng.springboot.vo.DCBLendYVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class DCBLendYServiceImpl implements IDCBLendYService {

    @Resource
    private DCBLendYVOMapper dcbLendYVOMapper;
    @Resource
    private YTbUserMapper tbUserMapper;
    @Resource
    private YTradingRecordMapper tradingRecordMapper;
    @Resource
    private YBidDetailMapper bidDetailMapper;
    @Resource
    private YBorrowMoneyMapper borrowMoneyMapper;
    @Autowired
    private StringRedisTemplate redisTemplate;



    @Transactional
    @Override
    public void DBCLend(Integer productInfoId, Integer money, Integer userId) throws Exception {
        //Object user1 = session.getAttribute("user");
//        TbUser user = (TbUser) SecurityUtils.getSubject().getSession().getAttribute("user1");
//        System.out.println(SecurityUtils.getSubject().getSession()+"---------end");
//        int userId = (int) user.getUserId();

//双重检测锁机制
        int sum1 = 0;
        if (redisTemplate.hasKey("DCB" + productInfoId)) {
            String Strsum = redisTemplate.boundValueOps("DCB" + productInfoId).get();
            sum1 = Integer.parseInt(Strsum);
        } else {
            synchronized (this) {
                String s = redisTemplate.boundValueOps("DCB" + productInfoId).get();
                if (s != null) {
                    sum1 = Integer.parseInt(s);
                    System.out.println("-----------------访问缓存");
                }
                if (s == null) {
                    List<BorrowMoney> borrowMoneyList = borrowMoneyMapper.selectMoneyById(productInfoId);
                    System.out.println("--------------------访问数据库");
                    //Integer sum2 = 0;//借款总金额
                    for (BorrowMoney x : borrowMoneyList) {
                        sum1 += (int) x.getBorrowMoneySum();
                    }
                    redisTemplate.boundValueOps("DCB" + productInfoId).set(sum1 + "");
                    System.out.println("-------------------写入缓存");
                }
            }
        }

        redisTemplate.execute(new SessionCallback<Object>() {


            @Override
            public Object execute(RedisOperations redisOperations) throws DataAccessException {

                String key = "DCB"+productInfoId;
                redisOperations.watch(key);
                Object o = redisOperations.boundValueOps(key).get();
                int sum1 = Integer.parseInt(o.toString()) ;
                sum1-=money;
                redisOperations.multi();
                if (sum1>=0){
                    redisOperations.boundValueOps(key).set(sum1+"");
                }
                List list = redisOperations.exec();
                if (list == null || list.isEmpty()){
                    System.out.println("执行失败");
                }else{
                    System.out.println("执行成功");
                    if (sum1>=money){
                        //int money2 = Integer.parseInt(redisTemplate.boundValueOps("DCB"+productInfoId).get());
                        TbUser user = tbUserMapper.selectUserInfoById(userId).get(0);
                        if (user.getAvailableBalance()>=money && money<=300000){
                            DCBLendYVO dcbLendYVO = dcbLendYVOMapper.selectDCBInfo(productInfoId).get(0);
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss");
                            String time = dateFormat.format(new Date());
                            //添加数据到资金流向表
                            TradingRecord tradingRecord = new TradingRecord();
                            tradingRecord.setUserId(userId);
                            String borrowNumber = "DCB"+userId+ dateFormat2.format(new Date());
                            tradingRecord.setTransactionNum(borrowNumber);
                            tradingRecord.setTransactionName(user.getUserNickname());
                            tradingRecord.setTransactionType(dcbLendYVO.getProductName());
                            tradingRecord.setTransactionPrice(money);
                            tradingRecord.setAvailableBalance(user.getAvailableBalance()-money);
                            tradingRecord.setFrozenCapital(money);
                            float v = (float) (money + (money * dcbLendYVO.getRateReturn() * (dcbLendYVO.getViability() / 12.0)));
                            System.out.println(v);
                            tradingRecord.setCollectMoney(v);
                            tradingRecord.setTime(time);
                            tradingRecordMapper.saveTradingResord(tradingRecord);
                            //修改用户的可用余额和冻结金额
                            user.setAvailableBalance(user.getAvailableBalance()-money);
                            user.setFrozenCapital(user.getFrozenCapital()+money);
                            tbUserMapper.updateMoneyById(user);
                            //添加数据到投标明细表
                            BidDetail bidDetail = new BidDetail();
                            bidDetail.setUserId(userId);
                            bidDetail.setBorrowNumber(borrowNumber);
                            bidDetail.setBidTime(time);
                            bidDetail.setBidMoney(money);
                            bidDetail.setBidStatusbidStatus(dcbLendYVO.getProductName());
                            bidDetail.setBidStatus("收款中");
                            float f = (v-money);
                            bidDetail.setGrossInterest(f);
                            bidDetail.setProductInfoId(productInfoId);
                            bidDetailMapper.saveBidDetail(bidDetail);
                        }

                    }
                }

//                synchronized (this){
//                String s = redisTemplate.boundValueOps(key).get();
//                int money1 = Integer.parseInt(s);

//                }

                return key;

            }


        });

    }

}
