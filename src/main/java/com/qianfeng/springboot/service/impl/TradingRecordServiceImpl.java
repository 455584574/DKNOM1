package com.qianfeng.springboot.service.impl;


import com.qianfeng.springboot.bean.TradingRecord;
import com.qianfeng.springboot.dao.BidDetailMapper;
import com.qianfeng.springboot.dao.ITbUserMapper;
import com.qianfeng.springboot.dao.TradingRecordMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TradingRecordServiceImpl {
    @Resource
    private TradingRecordMapper tradingRecordMapper;

    @Resource
    private BidDetailMapper bidDetailMapper;

    @Resource
    private ITbUserMapper iTbUserMapper;


    @Transactional
    public long treansef(long money , String transactionNum ){
        TradingRecord tradingRecord = new TradingRecord();
        long frozenCapital = tradingRecord.getFrozenCapital();
        long availableBalance = tradingRecord.getAvailableBalance();
        if (availableBalance+frozenCapital==availableBalance){
         return money;
        }
        return frozenCapital;
    }



}
