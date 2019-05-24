package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.TbUser;
import com.qianfeng.springboot.dao.YTbUserMapper;
import com.qianfeng.springboot.service.IUserYService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserYServiceImpl implements IUserYService {


    @Resource
    private YTbUserMapper tbUserMapper;

    @Override
    public int login(String username, String password) throws Exception{

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        subject.login(token);
        List<TbUser> tbUsers = tbUserMapper.selectUserByAccount(username);
        TbUser tbUser = tbUsers.get(0);
        int userId = (int) tbUser.getUserId();
        return userId;
    }
}
