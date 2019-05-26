package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.bean.TbUser;
import com.qianfeng.springboot.dao.ITbUserMapper;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@ResponseBody
@CrossOrigin
@RestController
@RequestMapping("/user")
public class LITbUserController {
    @Resource
    private ITbUserMapper iTbUserMapper;

    @RequestMapping(value = "/money/{userId}",method = RequestMethod.GET)
    public List<TbUser> queryMoney(@PathVariable("userId") Integer userId){
        List<TbUser> users = iTbUserMapper.queryMoney(userId);
        return users;
    }


}
