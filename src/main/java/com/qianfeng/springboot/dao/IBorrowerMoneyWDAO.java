package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.bean.BorrowMoney;
import com.qianfeng.springboot.vo.BorrowerAllVO;
import com.qianfeng.springboot.vo.BorrowerVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IBorrowerMoneyWDAO {
    List<BorrowMoney> chckerAllBorrower(@Param("index") Integer index);
    List<BorrowerVO> selectBorrowerVOW(@Param("index") Integer index);
    List<BorrowerAllVO> selectAllW(@Param("number") String number);
}
