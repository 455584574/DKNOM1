package com.qianfeng.springboot.service;

import com.qianfeng.springboot.bean.Borrower;

import java.util.List;

public interface IBorrowerWServicer {
    List<Borrower> queryByNameFromBorrower(Integer number)throws Exception;
}
