package com.qianfeng.springboot.service;

import com.qianfeng.springboot.bean.BorrowMoney;

import java.util.List;

public interface IBorrowMoneyService {
    List<BorrowMoney> queryBorrowInfo(Integer id) ;
}
