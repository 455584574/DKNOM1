package com.qianfeng.springboot.configuration;


import com.qianfeng.springboot.shiro.MyRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

@Configuration
public class SpringConfiguration {

    /**
     * 整合shiro
     */
    @Bean
    public ShiroFilterFactoryBean provideShiroFilter(MyRealm myRealm){
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
         securityManager.setRealm(myRealm);
         factoryBean.setSecurityManager(securityManager);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        //linkedHashMap.put("/user/login","anon");
//        linkedHashMap.put("/**","authc");
        factoryBean.setFilterChainDefinitionMap(linkedHashMap);
        // book/query=authc

        return factoryBean;
    }
}
