package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.ProductInfo;
import com.qianfeng.springboot.dao.IProductInfoMapper;
import com.qianfeng.springboot.service.IProductInfoService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductInfoServiceImpl implements IProductInfoService {
    //注入
    @Resource
    private IProductInfoMapper iProductInfoMapper;

    @Override
    public List<ProductInfo> selectProductInfoById(Integer productId) {
        List<ProductInfo> infoList = iProductInfoMapper.selectProductInfoById(productId);
        return infoList;
    }


}
