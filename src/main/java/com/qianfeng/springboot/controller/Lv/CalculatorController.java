package com.qianfeng.springboot.controller.Lv;

import com.qianfeng.springboot.bean.utill.Interest;
import com.qianfeng.springboot.service.lv.ICalculatorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Calculator")
@CrossOrigin
/**
 * 计算器接口
 */
public class CalculatorController {
    @Resource
    private ICalculatorService iCalculatorService;
    @RequestMapping("/jisuan")
    public Interest monthly( int id,int setMeal,
                            double money,double months,
                            double rate){
        if(id==2){
            if(setMeal==1){
                Interest interest = iCalculatorService.monthly1(money, months, rate);
                return interest;
            }else {
                return null;
            }
        }else {
            return null;
        }
    }
}
