package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.BorrowMoney;
import com.qianfeng.springboot.dao.IBorrowMoneyMapper;
import com.qianfeng.springboot.dao.ITbUserMapper;
import com.qianfeng.springboot.service.IBorrowMoneyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BorrowMoneyServiceImpl implements IBorrowMoneyService {
    @Resource
    private IBorrowMoneyMapper iBorrowMoneyMapper;

    @Resource
    private ITbUserMapper iTbUserMapper;
    @Override
    public List<BorrowMoney> queryBorrowInfo(Integer id) {
        List<BorrowMoney> borrowMoneyList = iBorrowMoneyMapper.queryBorrowInfo(id);
        return borrowMoneyList;
    }

}
