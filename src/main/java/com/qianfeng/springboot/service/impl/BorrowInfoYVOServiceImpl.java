package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.dao.LendInfoYVOMapper;
import com.qianfeng.springboot.dao.YBorrowInfoVOMapper;
import com.qianfeng.springboot.service.IBorrowInfoYVOService;
import com.qianfeng.springboot.vo.BorrowInfoYVO;
import com.qianfeng.springboot.vo.LendInfoYVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BorrowInfoYVOServiceImpl implements IBorrowInfoYVOService {

    @Resource
    private YBorrowInfoVOMapper borrowInfoVOMapper;

    @Resource
    private LendInfoYVOMapper lendInfoYVOMapper;

    @Override
    public List<BorrowInfoYVO> selectBorrowInfoYVOById(Integer productInfoId, Integer page) {

        List<BorrowInfoYVO> borrowInfoYVOS = borrowInfoVOMapper.selectBorrowInfoYVOById(productInfoId, (page - 1) * 10);

        return borrowInfoYVOS;
    }

    @Override
    public List<LendInfoYVO> selectLendInfoVO() {
        List<LendInfoYVO> lendInfoYVOS = lendInfoYVOMapper.selectLendInfoVO();
        return lendInfoYVOS;
    }
}
