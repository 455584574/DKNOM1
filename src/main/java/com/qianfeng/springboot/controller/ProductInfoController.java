package com.qianfeng.springboot.controller;


import com.qianfeng.springboot.bean.ProductInfo;
import com.qianfeng.springboot.service.IProductInfoService;
import com.qianfeng.springboot.vo.ProductInfoYVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/productInfo")
public class ProductInfoController {

    @Autowired
    private IProductInfoService productInfoServiceImpl;

    /**
     * 定存宝的借款详情显示
     * @param productId  产品类型ID
     * @return 返回定存宝借款详情集合
     */
    @RequestMapping(value = "/list/{productId}",method = RequestMethod.GET)
    public List<ProductInfoYVO> selectProductInfoById(@PathVariable("productId") Integer productId){
        List<ProductInfoYVO> productInfoList = productInfoServiceImpl.selectProductInfoById(productId);
        return productInfoList;
    }

    @RequestMapping(value = "/{productInfoId}",method = RequestMethod.GET)
    public ProductInfoYVO lend(@PathVariable("productInfoId")Integer productInfoId){

        ProductInfoYVO productInfo = productInfoServiceImpl.selectProductInfoByINfoId(productInfoId);
        return productInfo;
    }
}
