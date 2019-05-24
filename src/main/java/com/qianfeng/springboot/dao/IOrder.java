package com.qianfeng.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IOrder {
    void addOrderW(@Param("id") Integer id,@Param("money") Integer money,@Param("time") String time,@Param("status") String status,@Param("allMoney") Double allMoney);
}
