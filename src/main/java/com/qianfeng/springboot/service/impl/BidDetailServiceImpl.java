package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.TbUser;
import com.qianfeng.springboot.dao.BidDetailMapper;

import com.qianfeng.springboot.dao.ITbUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BidDetailServiceImpl {
    @Resource
    private BidDetailMapper bidDetailMapper;

    @Resource
    private ITbUserMapper iTbUserMapper;


    public void  updateBid(Integer userId){
        bidDetailMapper.updateBid(userId);
    }

}
