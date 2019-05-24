package com.qianfeng.springboot.service.lv;

import com.qianfeng.springboot.bean.BorrowMoney;

import java.util.List;

public interface LvBorrowMoneyService {
    List<BorrowMoney> findBy(Integer productId);
    BorrowMoney findById(String borrowNumber, Integer productId)throws Exception;
    Double receiFind(String borrowNumber);
}
