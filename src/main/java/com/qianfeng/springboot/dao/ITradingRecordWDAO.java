package com.qianfeng.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ITradingRecordWDAO {
    void changeTradingRecordW(@Param("loanMoney") Integer loanMoney,@Param("id") Integer id);

    /*添加数据*/
    void insertWZJ(@Param("id") Integer id,
                   @Param("traNumber") String traNumber,
                   @Param("traName") String traName,
                   @Param("traType") String traType,
                   @Param("traPrice") Integer traPrice,
                   @Param("avaBalance") Integer avaBalance,
                   @Param("froCapital") Integer froCapital,
                   @Param("colMoney") Double colMoney,
                   @Param("Time") String Time);
}
