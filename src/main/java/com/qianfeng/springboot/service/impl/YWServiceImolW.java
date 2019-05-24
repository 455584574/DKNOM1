package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.UserDetails;
import com.qianfeng.springboot.dao.IBidDetailDAO;
import com.qianfeng.springboot.dao.ITradingRecordWDAO;
import com.qianfeng.springboot.dao.IUserDetailsWDAO;
import com.qianfeng.springboot.service.IYWServiceW;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class YWServiceImolW implements IYWServiceW {
    private String bss="无忧宝";
    @Resource
    private IUserDetailsWDAO details;

    @Resource
    private IBidDetailDAO iBidDetailDAO;

    @Resource
    private ITradingRecordWDAO recordWDAO;

    @Override
    public void yewu(Integer loanMoney, Integer id)throws Exception {
        List<UserDetails> userDetails = details.selectWId(id);
        UserDetails userDetails1 = userDetails.get(0);
        String userName = userDetails1.getUserName();
        //可用余额
        Integer userBalance = ((int) userDetails1.getUserBalance())-loanMoney;
        Integer userSum =(int) userDetails1.getUserSum();
        //冻结资金
        double frozenCapital = userDetails1.getFrozenCapital()+(int)loanMoney;
        details.changeWMoney(userBalance,frozenCapital,id);
       //添加明细数据
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String Date=df.format(new Date());//格式化当前日期
        double grI = loanMoney * 0.055;
        Double loanMoney1 = (double)loanMoney;
        iBidDetailDAO.selectWB(id,loanMoney1,Date,bss,grI);
        //
        Random rand = new Random();
        int i = rand.nextInt(10000000);
        String number = Date + "i";
        double money = grI + loanMoney;
        recordWDAO.insertWZJ(id,number,userName,
                bss,loanMoney,userBalance,loanMoney,money,Date);
    }
}
