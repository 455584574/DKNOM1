package com.qianfeng.springboot.service.lv.Imp;

import com.qianfeng.springboot.bean.Borrower;
import com.qianfeng.springboot.dao.lv.LvBorrowDao;
import com.qianfeng.springboot.service.lv.LvBorrowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LvBorrowImp implements LvBorrowService {
    @Resource
    private LvBorrowDao borrowDao;
    @Override
    public Borrower findById(Integer id) {
        if(id!=null&&id>0){
            Borrower borrower = borrowDao.findById(id);
            if(borrower!=null){
                String[] split = borrower.getBorrowerName().toString().split("");
                String name=split[0]+"**";
                String[] numbers = borrower.getBorrowerNumber().toString().split("");
                String number=numbers[0]+numbers[1]+"***************"+numbers[16]+numbers[17];
                borrower.setBorrowerName(name);
                borrower.setBorrowerNumber(number);
                return borrower;
            }else {
                return  null;
            }
        }
        return null;
    }
}
