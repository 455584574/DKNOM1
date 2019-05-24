package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.service.impl.LoanMoneyWService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/Wloan")
public class LoanMoneyControllerW {

    @Resource
    private LoanMoneyWService loanMoneyWService;


    //修改用户的可用余额、冷却资金、影响资金（出借金额计算）
    @RequestMapping(value = "/{loanMoney}/{id}",method = RequestMethod.GET)
    public void changeMoneyW(@PathVariable("loanMoney") Integer loanMoney,@PathVariable("id") Integer id){
        try {
            loanMoneyWService.changeMoneyAll(loanMoney,id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
