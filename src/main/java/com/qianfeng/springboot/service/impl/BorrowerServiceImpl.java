package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.Borrower;
import com.qianfeng.springboot.dao.IBorrowerMapper;
import com.qianfeng.springboot.service.IBorrowerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BorrowerServiceImpl implements IBorrowerService{

    @Resource
    private IBorrowerMapper iBorrowerMapper;

    @Override
    public List<Borrower> queryBorrowById(Integer borrowerId) {
        List<Borrower> borrowerList = iBorrowerMapper.queryBorrowById(borrowerId);
        return borrowerList;
    }

//    @Override
//    public List<Borrower> queryInfo(Integer borId) {
//        List<Borrower> borrowerList = iBorrowerMapper.queryInfo(borId);
//        return borrowerList;
//    }
}
