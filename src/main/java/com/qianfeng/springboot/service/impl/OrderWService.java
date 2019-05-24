package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.dao.IOrder;
import com.qianfeng.springboot.service.IOrderWService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderWService implements IOrderWService {

    @Resource
    private IOrder iOrder;

    @Override
    public void addOrderW(Integer id, Integer money, String time, String status, Double allMoney) throws Exception {
        iOrder.addOrderW(id,money,time,status,allMoney);
    }
}
