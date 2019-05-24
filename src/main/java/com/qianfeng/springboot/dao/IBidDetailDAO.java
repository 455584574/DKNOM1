package com.qianfeng.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IBidDetailDAO {
    /*添加明细数据*/
    //可以将对象传过来 在mapper.xml中对象点属性
    void selectWB(@Param("id") Integer id,@Param("money") double money,
                  @Param("bTime") String bTime,@Param("bss") String bss,@Param("grI") double grI);
}
