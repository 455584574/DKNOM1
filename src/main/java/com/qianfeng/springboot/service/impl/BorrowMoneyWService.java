package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.BorrowMoney;
import com.qianfeng.springboot.dao.IBorrowerMoneyWDAO;
import com.qianfeng.springboot.service.IBorrowMoneyWService;
import com.qianfeng.springboot.vo.BorrowerAllVO;
import com.qianfeng.springboot.vo.BorrowerVO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BorrowMoneyWService implements IBorrowMoneyWService {

    @Resource
    private IBorrowerMoneyWDAO iBorrowerMoneyWDAO;

    @Override
    public List<BorrowMoney> chckerAllBorrower(Integer index) throws Exception {
        if(index>=0){
            List<BorrowMoney> borrowMonies = iBorrowerMoneyWDAO.chckerAllBorrower(index);
            return borrowMonies;
        }
        return null;
    }

    @Override
    public List<BorrowerVO> selectBorrowerVOW(Integer index) throws Exception {
        if(index>=0){
            List<BorrowerVO> borrowerVOS = iBorrowerMoneyWDAO.selectBorrowerVOW(index);
            return borrowerVOS;
        }
        return null;
    }

    @Override
    public List<BorrowerAllVO> selectAllW(String number) throws Exception {
        List<BorrowerAllVO> borrowerAllVOS = iBorrowerMoneyWDAO.selectAllW(number);
        return borrowerAllVOS;
    }
}
