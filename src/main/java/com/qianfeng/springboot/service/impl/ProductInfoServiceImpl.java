package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.dao.YProductInfoMapper;
import com.qianfeng.springboot.service.IProductInfoService;
import com.qianfeng.springboot.vo.ProductInfoYVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Service
public class ProductInfoServiceImpl implements IProductInfoService {

    @Resource
    private YProductInfoMapper productInfoMapper;


    /**
     * 根据产品Id查询投标产品
     * @param productId
     * @return
     */
    @Override
    public List<ProductInfoYVO> selectProductInfoById(Integer productId) {
        List<ProductInfoYVO> productInfoList = productInfoMapper.selectProductInfoById(productId);
        return productInfoList;
    }

    /**
     * 根据投标详情Id查询
     * @param productInfoId
     * @return
     */
    @Override
    public ProductInfoYVO selectProductInfoByINfoId(Integer productInfoId) {
        List<ProductInfoYVO> productInfoList = productInfoMapper.selectProductInfoByInfoId(productInfoId);
        ProductInfoYVO productInfoYVO = productInfoList.get(0);
        long viability = productInfoYVO.getViability();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
        productInfoYVO.setStartTime(format.format(c.getTime()));

        c.add(Calendar.DAY_OF_MONTH, (int) (viability*30+1));
        productInfoYVO.setEndTime(format.format(c.getTime()));

        return productInfoYVO;
    }
}
