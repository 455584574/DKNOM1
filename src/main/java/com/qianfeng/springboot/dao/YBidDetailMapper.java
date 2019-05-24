package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.BidDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface YBidDetailMapper {

    /**
     * 根据投标详情id查询投标明细表
     * @param borrowMoneyId
     * @return
     */
    List<BidDetail> selectBidDetailByBorrowMoneyId(@Param("borrowMoneyId") Integer borrowMoneyId);


    /**
     * 向投标明细表里添加数据
     */
    void saveBidDetail(@Param("bidDetail") BidDetail bidDetail);
}
