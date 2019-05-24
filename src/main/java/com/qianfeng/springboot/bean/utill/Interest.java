package com.qianfeng.springboot.bean.utill;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Interest {
    //本息合计
    private Double amount;
    //总利息利息
    private Double interest;
    //每月还款总本息
    private Double  refund;
    //每个月还款本金，每个月还款利息
    private List<InterestDetails> details;

}
