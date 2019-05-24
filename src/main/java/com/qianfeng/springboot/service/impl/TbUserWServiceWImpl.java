package com.qianfeng.springboot.service.impl;

import com.qianfeng.springboot.bean.TbUser;
import com.qianfeng.springboot.dao.ITbUserDAOW;
import com.qianfeng.springboot.service.ITbUserWServcie;
import com.qianfeng.springboot.vo.VO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TbUserWServiceWImpl implements ITbUserWServcie {

    @Resource
    private ITbUserDAOW userDAOW;

    @Override
    public List<TbUser> selectWName(VO vo) throws Exception {
        List<TbUser> tbUsers = userDAOW.selectWName(vo);
        return tbUsers;
    }

    @Override
    public void insetWUser(VO vo)throws Exception {
        userDAOW.insertWUser(vo);
    }
}
