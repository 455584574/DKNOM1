package com.qianfeng.springboot.controller.Lv;

import com.qianfeng.springboot.bean.BorrowMoney;
import com.qianfeng.springboot.service.lv.LvBorrowMoneyService;
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
@RequestMapping("/YX")
public class LvBorrowMoneyController {
    @Resource
    private LvBorrowMoneyService lvBorrowMoneyService;
    @RequestMapping("/findBy/{productId}")
    public List<BorrowMoney> findBy(@PathVariable("productId") Integer productId){
        List<BorrowMoney> list = lvBorrowMoneyService.findBy(productId);
        return list;
    }
    @RequestMapping("/ById/{borrowNumber}/{productId}")
    public BorrowMoney findById(@PathVariable("borrowNumber")String borrowNumber,@PathVariable("productId")Integer productId){
        BorrowMoney borrowMoney = null;
        try {
            borrowMoney = lvBorrowMoneyService.findById(borrowNumber, productId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return borrowMoney;
    }
    @RequestMapping("/recei/{borrowNumber}")
    public Double receiFind(@PathVariable("borrowNumber")String borrowNumber){
        Double integer = lvBorrowMoneyService.receiFind(borrowNumber);
        return integer;
    }
    @RequestMapping("/updata/{borrowNumber}/{time}/{sum}/{moneys}")
    public Integer updata(@PathVariable("borrowNumber") String borrowNumber, @PathVariable("time")String time,
                          @PathVariable("sum")Integer sum,@PathVariable("moneys")Integer moneys){
        return  null;
    }
}
