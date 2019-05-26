package com.qianfeng.springboot.service;

import com.qianfeng.springboot.bean.Borrower;


import java.util.List;

public interface IBorrowerService {
    List<Borrower> queryBorrowById( Integer borrowerId ) ;

//    List<Borrower> queryInfo (Integer borId) ;
}
