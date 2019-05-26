package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.bean.BorrowMoney;
import com.qianfeng.springboot.service.IBorrowMoneyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@ResponseBody
@CrossOrigin
@RestController
@RequestMapping("/borrow")
public class LBorrowMoneyController {
    @Resource
    private IBorrowMoneyService iBorrowMoneyService;

    @RequestMapping(value = "/money/{id}",method = RequestMethod.GET)
    public List<BorrowMoney> queryBorrowInfo(@PathVariable("id") Integer id){
        List<BorrowMoney> borrowMonies = iBorrowMoneyService.queryBorrowInfo(id);
        return borrowMonies;

    }

}
