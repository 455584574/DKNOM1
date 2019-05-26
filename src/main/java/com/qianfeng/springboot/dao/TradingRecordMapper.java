package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.TradingRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TradingRecordMapper {

    void increaseMoney(@Param("num")String transactionNum);

    void empty(@Param("num") String transactionNum);

    TradingRecord findByTable(String TradingRecord);

    List<TradingRecord> queryBiao();

}
