package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.BidDetail;
import com.qianfeng.springboot.bean.ProductInfo;
import com.qianfeng.springboot.dao.YBidDetailMapper;
import com.qianfeng.springboot.dao.YProductInfoMapper;
import com.qianfeng.springboot.service.IBidDetailYService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BidDetailYServiceImpl implements IBidDetailYService {
    @Resource
    private YBidDetailMapper bidDetailMapper;
    @Resource
    private YProductInfoMapper productInfoMapper;

    /**
     * 用户使用定存宝是将用户的出借金额及其他数据存入数据库
     * @param
     */
    @Override
    public void saveBidDetail(Integer productInfoId) throws Exception{



//        bidDetailMapper.saveBidDetail(bidDetail);
    }
}
