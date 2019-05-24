package com.qianfeng.springboot.dao.lv;

import com.qianfeng.springboot.bean.TradingRecord;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
@MapperScan
public interface LvTradingRecordDao {
    void save(TradingRecord tradingRecord);
}
