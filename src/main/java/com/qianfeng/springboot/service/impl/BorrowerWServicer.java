package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.Borrower;
import com.qianfeng.springboot.dao.IBorrowerWDAO;
import com.qianfeng.springboot.service.IBorrowerWServicer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BorrowerWServicer implements IBorrowerWServicer {

    @Resource
    private IBorrowerWDAO iBorrowerWDAO;

    @Override
    public List<Borrower> queryByNameFromBorrower(Integer number) throws Exception {
        List<Borrower> borrowers = iBorrowerWDAO.queryByNameFromBorrower(number);
        return borrowers;
    }
}
