package com.qianfeng.springboot.service.lv.Imp;

import com.google.gson.Gson;
import com.qianfeng.springboot.bean.BorrowMoney;
import com.qianfeng.springboot.dao.lv.LvBorrowMoneyDao;
import com.qianfeng.springboot.service.lv.LvBorrowMoneyService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class LvBorrowMoneyImp implements LvBorrowMoneyService {
    @Resource
    private LvBorrowMoneyDao lvBorrowMoneyDao;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Override
    /**
     * 根据产品id查询列表
     */
    public List<BorrowMoney> findBy(Integer productId) {
        List<BorrowMoney> moneyList = lvBorrowMoneyDao.findBy(productId);
        if(moneyList!=null&&moneyList.size()>0){
            return moneyList;
        }else {
            return  null;
        }
    }

    @Override
    /**
     * 根据订单号查询商品
     */
    public BorrowMoney findById(String borrowNumber, Integer productId)throws Exception {
        Gson gson = new Gson();
        BorrowMoney borrowMoney=null;
        String a=borrowNumber+"rece";
        //检测传值是否为空
        if(productId!=null&&borrowNumber!=null&&!borrowNumber.trim().equals("null")){
            //检测是缓存中否有这个key
            if(chekd(borrowNumber)){
                String s = stringRedisTemplate.boundValueOps(borrowNumber).get();
                borrowMoney=gson.fromJson(s,BorrowMoney.class);
                return borrowMoney;
            }else {
                synchronized (this){
                    //再次检测是缓存中否有这个key
                    if(stringRedisTemplate.hasKey(borrowNumber)){
                        String s = stringRedisTemplate.boundValueOps(borrowNumber).get();
                        borrowMoney=gson.fromJson(s,BorrowMoney.class);
                        return borrowMoney;
                    }else {
                        //查询数据
                        borrowMoney = lvBorrowMoneyDao.findById(borrowNumber, productId);
                        String toJson = gson.toJson(borrowMoney);
                        if(borrowMoney==null){
                            //当值不存在时，设置一个过期时间存到缓存
                            stringRedisTemplate.opsForValue().set(borrowNumber,toJson,180000,TimeUnit.SECONDS);
                        }else {
                            //当借款状态为“1”时表示还款中，此时查询给过期时间，为“0”时表示在借款中，不设置过期时间
                            if("1".equals(borrowMoney.getBorrowMoneyState())){
                                stringRedisTemplate.opsForValue().set(borrowNumber,toJson,1800000,TimeUnit.SECONDS);
                                stringRedisTemplate.opsForValue().set(a,"0",1800000,TimeUnit.SECONDS);
                            }else {
                                //将价借款剩余金额存入redis缓存中
                                double receiptCapital = borrowMoney.getReceiptCapital()-borrowMoney.getFundsReceived();
                                stringRedisTemplate.boundValueOps(a).set(String.valueOf(receiptCapital));
                                //将json存入redis缓存中
                                stringRedisTemplate.boundValueOps(borrowNumber).set(toJson);
                            }
                        }
                    }
                }
            }
        }
        return borrowMoney;
    }
    //检测缓存中是否有这个key
    public Boolean chekd(String borrowNumber){
        Boolean aBoolean = stringRedisTemplate.hasKey(borrowNumber);
        return aBoolean;
    }
    public Double receiFind(String borrowNumber){
        String receiId=borrowNumber+"rece";
        String s = stringRedisTemplate.boundValueOps(receiId).get();
        Double money=Double.valueOf(s);
//        System.out.println(money);
        return money;
    }

}
