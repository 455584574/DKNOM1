package com.qianfeng.springboot.dao.lv;

import com.qianfeng.springboot.bean.UserDetails;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
@MapperScan
public interface LvUserDetailsDao {
    UserDetails findById(@Param("id") Integer userId);
    void update(@Param("userBalance") Long userBalance, @Param("id") Integer id);
}
