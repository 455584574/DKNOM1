package com.qianfeng.springboot.service;

import com.qianfeng.springboot.vo.ProductInfoYVO;

import java.util.List;

public interface IProductInfoService {

    List<ProductInfoYVO> selectProductInfoById(Integer productId);

    ProductInfoYVO selectProductInfoByINfoId(Integer productInfoId);
}
