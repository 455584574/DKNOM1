package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ITbUserMapper {

    List<TbUser> queryMoney(@Param("userId") Integer userId);

    void queryUserId(Integer user);

}
