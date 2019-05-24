package com.qianfeng.springboot.controller.Lv;

import com.qianfeng.springboot.bean.Borrower;
import com.qianfeng.springboot.service.lv.LvBorrowService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/borrow")
@CrossOrigin
public class LvBorrowController {
    @Resource
    private LvBorrowService borrowService;
    @RequestMapping("/ById/{id}")
    public Borrower findById(@PathVariable("id") Integer id){
        Borrower borrower = borrowService.findById(id);
        return borrower;
    }
}
