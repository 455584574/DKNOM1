package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.Product;
import com.qianfeng.springboot.dao.IProductWDAO;
import com.qianfeng.springboot.service.IProductWService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductWService implements IProductWService {

    @Resource
    private IProductWDAO iProductWDAO;

    @Override
    public List<Product> queryByIdFromProduct(Integer id) throws Exception {
        return iProductWDAO.queryByIdFromProduct(id);
    }
}
