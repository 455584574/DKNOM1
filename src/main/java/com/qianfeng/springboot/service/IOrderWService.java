package com.qianfeng.springboot.service;

public interface IOrderWService {
    void addOrderW(Integer id,Integer money,String time,String status,Double allMoney)throws Exception;
}
