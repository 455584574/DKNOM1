package com.qianfeng.springboot.service;

import com.qianfeng.springboot.vo.BorrowInfoYVO;
import com.qianfeng.springboot.vo.LendInfoYVO;

import java.util.List;

public interface IBorrowInfoYVOService {


    List<BorrowInfoYVO> selectBorrowInfoYVOById(Integer productInfoId,Integer page);

    List<LendInfoYVO> selectLendInfoVO();
}
