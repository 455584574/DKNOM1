package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.BorrowMoney;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface YBorrowMoneyMapper {


    List<BorrowMoney> selectMoneyById(@Param("productInfoId") Integer productInfoId);
}
