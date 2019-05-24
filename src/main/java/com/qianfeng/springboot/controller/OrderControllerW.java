package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.service.impl.OrderWService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/orderW")
public class OrderControllerW {

    @Resource
    private OrderWService orderWService;
    private String status="无忧宝";

    //添加订单
    @RequestMapping(value = "/{id}/{money}/{allMoney}",method = RequestMethod.GET)
    public void addOrderW(@PathVariable("id") Integer id,@PathVariable("money") Integer money,@PathVariable("allMoney") Double allMoney){
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            String testDate=df.format(new Date());//格式化当前日期
            orderWService.addOrderW(id,money,testDate,status,allMoney);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
