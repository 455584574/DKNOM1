package com.qianfeng.springboot.controller;


import com.qianfeng.springboot.service.IDCBLendYService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/lend")
public class DCBLendController {

    @Autowired
    private IDCBLendYService dcbLendYService;

    @RequestMapping(method = RequestMethod.GET)
    public String DCBLend(Integer productInfoId,Integer money,Integer userId){

        try {
            dcbLendYService.DBCLend(productInfoId,money,userId);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "no";
    }

}
