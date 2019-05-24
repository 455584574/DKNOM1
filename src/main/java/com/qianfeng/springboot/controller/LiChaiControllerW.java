package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.service.impl.YWServiceImolW;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin //跨域标签
@RestController
@RequestMapping("/WLiChai")
public class LiChaiControllerW {

    @Resource
    private YWServiceImolW ywServiceImolW;

    @RequestMapping(value = "/{loanMoney}/{id}",method = RequestMethod.GET)
    public String Adds(@PathVariable("loanMoney") Integer loanMoney,@PathVariable("id") Integer id){
        try {
            ywServiceImolW.yewu(loanMoney,id);
            return "理财成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
