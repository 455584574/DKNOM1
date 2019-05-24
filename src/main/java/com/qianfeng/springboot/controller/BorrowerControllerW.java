package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.bean.Borrower;
import com.qianfeng.springboot.service.impl.BorrowerWServicer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin //跨域标签
@RestController
@RequestMapping("/WBorrower")
public class BorrowerControllerW {

    @Autowired
    private BorrowerWServicer borrowerWServicer;

    //借款人详情（跳转详情页面）
    @RequestMapping(value = "/{number}",method = RequestMethod.GET)
    public Borrower queryByNameFromBorrower(@PathVariable("number") Integer number){
        List<Borrower> borrowers = null;
        try {
            borrowers = borrowerWServicer.queryByNameFromBorrower(number);
            Borrower borrower = borrowers.get(0);
            return borrower;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
