package com.qianfeng.springboot.dao.lv;

import com.qianfeng.springboot.bean.BidDetail;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface LvBidDetailDao {
    List<BidDetail> findById(@Param("number") String number);
    void save(BidDetail bidDetail);
}
