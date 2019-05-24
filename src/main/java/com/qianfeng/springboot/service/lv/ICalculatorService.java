package com.qianfeng.springboot.service.lv;

import com.qianfeng.springboot.bean.utill.Interest;

public interface ICalculatorService {
    Interest monthly1(double money, double months, double rate);
}
