package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.vo.BorrowInfoYVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface YBorrowInfoVOMapper {

    List<BorrowInfoYVO> selectBorrowInfoYVOById(@Param("productInfoId") Integer productInfoId, @Param("index") Integer index);

}
