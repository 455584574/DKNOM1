package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.Borrower;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IBorrowerMapper {
    List<Borrower> queryBorrowById(@Param("borrowerId") Integer borrowerId );

//    List<Borrower> queryInfo(@Param("borId") Integer borId);
}
