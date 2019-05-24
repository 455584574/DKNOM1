package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.vo.ProductInfoYVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface YProductInfoMapper {

    List<ProductInfoYVO> selectProductInfoById(@Param("productId") Integer productId);


    List<ProductInfoYVO> selectProductInfoByInfoId(@Param("productInfoId") Integer productInfoId);


}
