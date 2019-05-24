package com.qianfeng.springboot.service;

import com.qianfeng.springboot.bean.Product;

import java.util.List;

public interface IProductWService {
    List<Product> queryByIdFromProduct(Integer id)throws Exception;
}
