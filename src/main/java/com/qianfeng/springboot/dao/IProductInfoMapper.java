package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface IProductInfoMapper {

    List<ProductInfo> selectProductInfoById(@Param("productId") Integer productId);
}
