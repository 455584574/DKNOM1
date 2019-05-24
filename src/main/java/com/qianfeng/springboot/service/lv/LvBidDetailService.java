package com.qianfeng.springboot.service.lv;

import com.qianfeng.springboot.bean.BidDetail;

import java.util.List;

public interface LvBidDetailService {
    List<BidDetail> findById(String number);
    Integer save(String number, Integer userId, Integer money,
                 String productId, Double bid, String creditor, Integer max);
}
