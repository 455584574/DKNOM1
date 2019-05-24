package com.qianfeng.springboot.service.lv.Imp;

import com.qianfeng.springboot.bean.BidDetail;
import com.qianfeng.springboot.bean.TradingRecord;
import com.qianfeng.springboot.bean.UserDetails;
import com.qianfeng.springboot.dao.lv.LvBidDetailDao;
import com.qianfeng.springboot.dao.lv.LvBorrowMoneyDao;
import com.qianfeng.springboot.dao.lv.LvTradingRecordDao;
import com.qianfeng.springboot.dao.lv.LvUserDetailsDao;
import com.qianfeng.springboot.service.lv.LvBidDetailService;
import com.qianfeng.springboot.service.lv.LvBorrowMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class LvBidDetailImp implements LvBidDetailService {
    @Resource
    private LvBidDetailDao bidDetailDao;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private LvUserDetailsDao lvUserDetailsDao;
    @Resource
    private LvTradingRecordDao lvTradingRecordDao;
    @Resource
    private LvBorrowMoneyDao lvBorrowMoneyDao;
    @Override
    public List<BidDetail> findById(String number) {
        if(number!=null){
            List<BidDetail> bidDetails = bidDetailDao.findById(number);
            if(bidDetails!=null&&bidDetails.size()>0){
                return bidDetails;
            }else {
                return null;
            }
        }
        return null;
    }

    /**
     * 用户进行投标
     * @param number 产品订单号
     * @param userId 用户id
     * @param money  投资金额
     * @param productId 产品id
     * @param bid 总利息
     */
    @Override
    public Integer save(String number, Integer userId, Integer money,
                     String productId,Double bid,String creditor,Integer max) {
        //缓存中的key
        String key=number+"rece";
        //取出缓存中的剩余筹款金额
        String s = stringRedisTemplate.boundValueOps(key).get();
        //剩余筹款金额
        Double jinE=Double.valueOf(s);
        //用户输入金额
        Double value = Double.valueOf(money);
        //获取当前用户余额
        UserDetails user = lvUserDetailsDao.findById(userId);
        Long balance = user.getUserBalance();
        //获取当前时间
        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sj=dateFormat.format(date);
        if(jinE-money==0){
            //开启事务支持
            stringRedisTemplate.setEnableTransactionSupport(true);
            //锁定剩余借款金额的key
            stringRedisTemplate.watch(key);
            //锁定此条记录
            stringRedisTemplate.watch(number);
            //开启事务
            stringRedisTemplate.multi();
            //删除key
            stringRedisTemplate.delete(key);
            //删除key
            stringRedisTemplate.delete(number);
            lvBorrowMoneyDao.updataMoney(number,sj,max);
            List<Object> exec = stringRedisTemplate.exec();
            if (exec == null || exec.isEmpty()) {
                System.out.println("执行失败");
                return 2;
            } else {
                System.out.println("执行成功");
            }
        }else {
            if(jinE>value && value<balance){
                //获取当前时间

                /**
                 *由于 enableTransactionSupport 属性的默认值是 false，
                 * 导致了每一个 RedisConnection 都是重新获取的。
                 * 所以，我们刚刚执行的 MULTI 和 EXEC 这两个命令不在同一个 Connection 中
                 */
                //开启事务支持
                stringRedisTemplate.setEnableTransactionSupport(true);
                //上锁
                stringRedisTemplate.watch(s);
                //开启事务
                stringRedisTemplate.multi();
                //修改缓存
                stringRedisTemplate.boundValueOps(key).set(String.valueOf(jinE - value));
                String product=null;
                switch (productId){
                    case "1":product="无忧宝";
                        break;
                    case "2":product="月息通";
                        break;
                    case "3":product="定存宝";
                        break;
                }
                //修改用户资金
                lvUserDetailsDao.update((balance-money),userId);
                System.out.println(balance-money);
                //添加用户投标记录
                BidDetail bidDetail = new BidDetail(null,userId,userId,number,money,sj,product,"收款中",bid,null,null);
                bidDetailDao.save(bidDetail);
                TradingRecord tradingRecord=new TradingRecord(-1,userId,number,creditor,product,money,balance-money,money,bid,sj,null);
                lvTradingRecordDao.save(tradingRecord);
                //提交事务
                List<Object> exec = stringRedisTemplate.exec();
                //判断是否提交成功
                if (exec == null || exec.isEmpty()) {
                    System.out.println("执行失败");
                    return 2;
                } else {
                    System.out.println("执行成功");
                    return 1;
                }
            }else {
                return 0;
            }
        }
        return 3;
    }
}
