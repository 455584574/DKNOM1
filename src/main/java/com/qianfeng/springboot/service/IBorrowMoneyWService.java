package com.qianfeng.springboot.service;

import com.qianfeng.springboot.bean.BorrowMoney;
import com.qianfeng.springboot.vo.BorrowerAllVO;
import com.qianfeng.springboot.vo.BorrowerVO;

import java.util.List;

public interface IBorrowMoneyWService {
    List<BorrowMoney> chckerAllBorrower(Integer index)throws Exception;
    List<BorrowerVO> selectBorrowerVOW(Integer index)throws Exception;
    List<BorrowerAllVO> selectAllW(String number)throws Exception;
}
