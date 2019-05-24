package com.qianfeng.springboot.dao.lv;

import com.qianfeng.springboot.bean.BorrowMoney;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface LvBorrowMoneyDao {
    /**
     * @param id  产品ID  1、无忧宝 2、月息通 3、定存宝
     * @return
     */
    List<BorrowMoney> findBy(@Param("id") Integer id);

    /**
     *
     * @param borrowNumber 借款流水号
     * @param productId 产品id
     * @return
     */
    BorrowMoney findById(@Param("borrowNumber") String borrowNumber,
                         @Param("productId") Integer productId);
    void updataMoney(@Param("borrowNumber") String borrowNumber,
                     @Param("time") String time, @Param("sum") Integer sum);
}
