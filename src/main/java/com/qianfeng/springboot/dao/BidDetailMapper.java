package com.qianfeng.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BidDetailMapper {

    void updateBid(@Param("userId") Integer userId);
}
