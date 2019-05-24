package com.qianfeng.springboot.dao;

import com.qianfeng.springboot.vo.LendInfoYVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LendInfoYVOMapper {

    List<LendInfoYVO> selectLendInfoVO();
}
