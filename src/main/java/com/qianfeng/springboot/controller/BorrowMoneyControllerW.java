package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.bean.BorrowMoney;
import com.qianfeng.springboot.service.impl.BorrowMoneyWService;
import com.qianfeng.springboot.vo.BorrowerAllVO;
import com.qianfeng.springboot.vo.BorrowerVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/WBorrow")
public class BorrowMoneyControllerW {

    @Resource
    private BorrowMoneyWService borrowMoneyWService;

    //借款人员展示（产品栏）
    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public List<BorrowMoney> chckerAllBorrower(@PathVariable("page") Integer page){
        int index = (page-1)*10;
        List<BorrowMoney> borrowMonies = null;
        try {
            borrowMonies = borrowMoneyWService.chckerAllBorrower(index);
            return borrowMonies;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //借款人员展示（产品栏）
    @RequestMapping(value = "/vo/{page}",method = RequestMethod.GET)
    public List<BorrowerVO> selectBorrowerVOW(@PathVariable("page") Integer page){
        try {
            int index = (page-1)*10;
            List<BorrowerVO> borrowerVOS = null;
            borrowerVOS = borrowMoneyWService.selectBorrowerVOW(index);
            return borrowerVOS;
        } catch (Exception e) {
            e.printStackTrace();
        }
       return null;
    }

    //项目详情页面数据
    @RequestMapping(value = "/wu/{number}",method = RequestMethod.GET)
    public BorrowerAllVO selectAllW(@PathVariable("number") String number){
        try {
            List<BorrowerAllVO> borrowerAllVOS = borrowMoneyWService.selectAllW(number);
            BorrowerAllVO borrowerAllVO = borrowerAllVOS.get(0);
            return borrowerAllVO;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
