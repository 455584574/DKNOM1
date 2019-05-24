package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface YTbUserMapper {

    List<TbUser> selectUserInfoById(@Param("userId") Integer userId);

    void updateMoneyById(@Param("user")TbUser user);

    List<TbUser> selectUserByAccount(@Param("userAccount") String userAccount);
}
