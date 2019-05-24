package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.TradingRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface YTradingRecordMapper {

    void saveTradingResord(@Param("tradingResord") TradingRecord tradingResord);
}
