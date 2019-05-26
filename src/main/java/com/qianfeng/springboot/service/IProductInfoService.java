package com.qianfeng.springboot.service;

import com.qianfeng.springboot.bean.ProductInfo;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface IProductInfoService {

    List<ProductInfo> selectProductInfoById(Integer productId);

}
