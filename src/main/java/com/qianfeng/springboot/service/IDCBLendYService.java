package com.qianfeng.springboot.service;

import javax.servlet.http.HttpSession;

public interface IDCBLendYService {


    void DBCLend(Integer productInfoId, Integer money, Integer userId) throws Exception;

}
