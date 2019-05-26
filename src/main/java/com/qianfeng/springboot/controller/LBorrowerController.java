package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.bean.Borrower;
import com.qianfeng.springboot.service.IBorrowerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/borrower")
public class LBorrowerController {
    @Resource
    private IBorrowerService iBorrowerService;

    @RequestMapping(value = "/list/{borrowerId}",method = RequestMethod.GET)
    public List<Borrower> queryBorrowById(@PathVariable("borrowerId") Integer borrowerId ){
        List<Borrower> borrowById = iBorrowerService.queryBorrowById(borrowerId);
        return borrowById;
    }

//    @RequestMapping(value = "/info/{borId}",method = RequestMethod.GET)
//    public List<Borrower> queryInfo(@PathVariable("borId") Integer borId){
//        List<Borrower> infoList = iBorrowerService.queryInfo(borId);
//        return infoList;
//    }

}
