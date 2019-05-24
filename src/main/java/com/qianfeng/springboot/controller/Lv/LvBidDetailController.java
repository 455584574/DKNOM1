package com.qianfeng.springboot.controller.Lv;

import com.qianfeng.springboot.bean.BidDetail;
import com.qianfeng.springboot.service.lv.LvBidDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/record")
public class LvBidDetailController {
    @Resource
    private LvBidDetailService bidDetailService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 根据投标产品的订单号查询记录
     * @param number 借款订单号
     * @return
     */
    @RequestMapping("/YXT/{number}")
    public List<BidDetail> findBy(@PathVariable("number") String number){
        List<BidDetail> list = bidDetailService.findById(number);
        return list;
    }
//    @RequestMapping("/bidder/{number}/{userId}/{money}")
//    public Integer bid(@PathVariable("number")String number,@PathVariable("userId")Integer userId,@PathVariable("money")String money){
//        return null;
//    }

    /**
     *
     * @param number 订单号
     * @param userId 用户id
     * @param money  投标金额
     * @param productId 产品id
     * @param bid  总利息
     * @param creditor  借款人姓名
//     * @param yzm 验证码
     * @return @PathVariable("yzm")String yzm,/{yzm}+
     */
    @RequestMapping("/save/{number}/{userId}/{money}/{productId}/{bid}/{creditor}/{max}")
    public Integer sav(@PathVariable("number")String number,@PathVariable("userId") Integer userId,
                    @PathVariable("money")Integer money,@PathVariable("productId")String productId,
                    @PathVariable("bid")Double bid,@PathVariable("creditor")String creditor,
                       @PathVariable("max")Integer max){
        String key="captcha"+userId;
        String s = stringRedisTemplate.boundValueOps(key).get();
        Integer save = bidDetailService.save(number, userId, money, productId, bid, creditor,max);
        return save;
//        if(s.equals(yzm)){
//
//        }else {
//            return 3;
//        }

    }
}
