package com.qianfeng.springboot.controller;


import com.qianfeng.springboot.service.IBorrowInfoYVOService;
import com.qianfeng.springboot.vo.BorrowInfoYVO;
import com.qianfeng.springboot.vo.LendInfoYVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/borrowInfo")
public class BorrowInfoYVOController {

    @Autowired
    private IBorrowInfoYVOService borrowInfoYVOService;



    @RequestMapping(value = "/bidList/{productInfoId}/{pageSize}",method = RequestMethod.GET)
    public List<BorrowInfoYVO> selectInfoById(@PathVariable("productInfoId") Integer productInfoId,@PathVariable("pageSize") Integer page){

        List<BorrowInfoYVO> borrowInfoYVOList = borrowInfoYVOService.selectBorrowInfoYVOById(productInfoId, page);
        return borrowInfoYVOList;
    }

    @RequestMapping(value = "/lendList",method = RequestMethod.GET)
    public List<LendInfoYVO> selectLendInfo(){
        List<LendInfoYVO> lendInfoYVOList = borrowInfoYVOService.selectLendInfoVO();

        return lendInfoYVOList;
    }
}
