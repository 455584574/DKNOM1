package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.bean.ProductInfo;
import com.qianfeng.springboot.service.IProductInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/prList")
public class LProductInfoController {
    @Resource
    private IProductInfoService iProductInfoService;


    @RequestMapping(value = "/pr/{productId}/{index}",method = RequestMethod.GET)
    public List<ProductInfo> selectProductInfoById(@PathVariable("productId") Integer productId) throws Exception {
        List<ProductInfo> productInfoList = iProductInfoService.selectProductInfoById(productId);
        return productInfoList;
    }

}
