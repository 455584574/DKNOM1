package com.qianfeng.springboot.dao.lv;

import com.qianfeng.springboot.bean.Borrower;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
@MapperScan
public interface LvBorrowDao {
    Borrower findById(Integer id);
}
