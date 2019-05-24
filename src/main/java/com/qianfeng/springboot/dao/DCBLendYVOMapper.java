package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.vo.DCBLendYVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DCBLendYVOMapper {

    List<DCBLendYVO> selectDCBInfo(@Param("productInfoId")Integer productInfoId);
}
