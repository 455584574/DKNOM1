package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.dao.ITradingRecordWDAO;
import com.qianfeng.springboot.dao.IUserDetailsWDAO;
import com.qianfeng.springboot.service.ILoanMoneyWService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoanMoneyWService implements ILoanMoneyWService {

    @Resource
    private IUserDetailsWDAO iUserDetailsWDAO;

    @Resource
    private ITradingRecordWDAO iTradingRecordWDAO;

    @Override
    public void changeMoneyAll(Integer loanMoney, Integer id) throws Exception {
        iUserDetailsWDAO.changeMoneyW(loanMoney,id);
        iTradingRecordWDAO.changeTradingRecordW(loanMoney,id);
    }
}
