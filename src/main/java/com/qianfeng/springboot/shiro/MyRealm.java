package com.qianfeng.springboot.shiro;

import com.qianfeng.springboot.bean.TbUser;
import com.qianfeng.springboot.dao.YTbUserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Component
public class MyRealm extends AuthorizingRealm {

    @Resource
    private YTbUserMapper tbUserMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        char[] chars = usernamePasswordToken.getPassword();
        String password = new String(chars);
        TbUser tbUsers = tbUserMapper.selectUserByAccount(username).get(0);
        if (tbUsers == null){
            throw new UnknownAccountException();
        }
        if (!tbUsers.getUserPassword().equals(password)){
            throw new IncorrectCredentialsException();
        }
       SecurityUtils.getSubject().getSession().setAttribute("user1",tbUsers);
        System.out.println(SecurityUtils.getSubject().getSession()+"---------before");
        TbUser user = (TbUser) SecurityUtils.getSubject().getSession().getAttribute("user1");
        System.out.println(SecurityUtils.getSubject().getSession()+"---------after");


        return new SimpleAuthenticationInfo(username,password,"myRealm");
    }
}
