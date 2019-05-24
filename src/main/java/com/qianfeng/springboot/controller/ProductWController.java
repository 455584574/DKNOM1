package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.bean.Product;
import com.qianfeng.springboot.service.impl.ProductWService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/WProduct")
public class ProductWController {

    @Resource
    private ProductWService productWService;

//遍历无忧宝（跳转）
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Product queryByIdFromProduct(@PathVariable("id") Integer id){
        List<Product> products = null;
        try {
            products = productWService.queryByIdFromProduct(id);
            Product JsonVOlist = products.get(0);
            return JsonVOlist;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
