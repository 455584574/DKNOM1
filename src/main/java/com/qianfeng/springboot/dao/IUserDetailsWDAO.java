package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.UserDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IUserDetailsWDAO {
    void changeMoneyW(@Param("loanMoney") Integer loanMoney,@Param("id") Integer id);

    /*修改可用余额，冻结资金*/
    void changeWMoney(@Param("userBalance") Integer userBalance,@Param("frozenCapital") Double frozenCapital,@Param("id") Integer id);

    /*查询用户资金资料*/
    List<UserDetails> selectWId(@Param("id") Integer id);
}
