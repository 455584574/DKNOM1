package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.dao.TradingRecordMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@ResponseBody
@RequestMapping("/trad")
public class LTradingRecordController {
    @Resource
    private TradingRecordMapper tradingRecordMapper;

    @RequestMapping("/")
    public void increaseMoney(String transactionNum){
        tradingRecordMapper.increaseMoney(transactionNum);
    }
}
