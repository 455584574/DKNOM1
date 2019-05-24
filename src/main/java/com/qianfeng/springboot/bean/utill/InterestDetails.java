package com.qianfeng.springboot.bean.utill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterestDetails {
    //月付本金
    private Double payMonthly;
    //月付利息
    private Double expense;
    //剩余本金
    private Double residue;
    //剩余利息
    private Double surplus;
}
