package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IProductWDAO {
    List<Product> queryByIdFromProduct(@Param("id") Integer id);
}
