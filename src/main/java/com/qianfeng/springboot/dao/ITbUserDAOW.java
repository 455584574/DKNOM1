package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.TbUser;
import com.qianfeng.springboot.vo.VO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface  ITbUserDAOW {
    void insertWUser(@Param("vo") VO vo);
    List<TbUser> selectWName(@Param("vo") VO vo);

}
