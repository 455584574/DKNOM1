package com.qianfeng.springboot.service;

import com.qianfeng.springboot.bean.TbUser;
import com.qianfeng.springboot.vo.VO;

import java.util.List;

public interface ITbUserWServcie {
    List<TbUser> selectWName(VO vo) throws Exception;
   void  insetWUser(VO vo) throws Exception;
}
