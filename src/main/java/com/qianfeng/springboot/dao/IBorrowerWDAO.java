package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.Borrower;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IBorrowerWDAO {
    List<Borrower> queryByNameFromBorrower(@Param("number") Integer number);
}
