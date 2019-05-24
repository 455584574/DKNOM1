package com.qianfeng.springboot.service.lv.Imp;

import com.qianfeng.springboot.bean.utill.Interest;
import com.qianfeng.springboot.bean.utill.InterestDetails;
import com.qianfeng.springboot.service.lv.ICalculatorService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorImp implements ICalculatorService {
    /**
     * 月息宝套餐1 ：等额本息
     * 计算公式：借款金额为X，利率为 Y，借款期限为 Z 月，
     *         每月应还本息的计算公式为：X×[Y/12×(1+Y/12) ^ Z]÷{[(1+Y/12) ^ Z]-1}
     * @param money 输入的总投标金额
     * @param months 输入的期望回报年利率
     * @param rate  输入的出借时长（月）
     * @return
     */
    public Interest monthly1(double money,double months,double rate){
        double a=(1+months/12);
        //计算出月本息
        double yx=money*(months/12*Math.pow(a,rate))/(Math.pow(a,rate)-1);
        //计算出本息
        double bx=yx*rate;
        //计算出利息
        double lx=bx-money;
        
        BigDecimal y=new BigDecimal(yx);
        BigDecimal b=new BigDecimal(bx);
        BigDecimal l=new BigDecimal(lx);
        //取整
        double mensem=y.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        double total = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        double extra = l.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        //第一期本金
        double sbj=mensem-money*(months/12);
        BigDecimal one=new BigDecimal(sbj);
        double oneBj = one.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        //计算每月的本金和利息放至集合中
        //已还本金
//        double yh=0.0;
        List<InterestDetails> details=new ArrayList<>();
        for(int i=1;i<=rate;i++){
            InterestDetails interestDetails = new InterestDetails();
            //每期本金
            double bj=oneBj*Math.pow((1+months/12),(i-1));
            BigDecimal qbj=new BigDecimal(bj);
            double mbj = qbj.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            //每期利息
            double mlx=mensem-mbj;
            BigDecimal mqlx=new BigDecimal(mlx);
            double ilx = mqlx.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            //每期剩余本金
            double sybj=money-mbj;
            BigDecimal bsybj=new BigDecimal(sybj);
            double ybj = bsybj.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            //每期剩余利息
            double sylx=extra-ilx;
            BigDecimal bsylx=new BigDecimal(sylx);
            double ylx = bsylx.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            interestDetails.setPayMonthly(mbj);
            interestDetails.setExpense(ilx);
            interestDetails.setResidue(ybj);
            interestDetails.setSurplus(ylx);
            details.add(interestDetails);
        }
        Interest interest=new Interest(total,extra,mensem,details);
        if(interest!=null){
            return interest;
        }
      return null;
    }

//    public Interest monthly2(double money,double months,double rate){
//        return null;
//    }

    /**
     * 借款金额为X，利率为 Y，借款期限为 Z 月，每月应还本息的计算公式为：
     * 首期应付金额 = X× Y×首期实际占用天数 /365 +X×Y/12×(1+Y/12)^(还款月序号-1)÷[(1+Y/12)^ Z -1]
     * 剩余每月应付金额=X×[Y/12×（1+Y/12）^ Z ]/[(1+Y/12)^ Z -1]
     *
     * @param money 输入的总投标金额
     * @param months 输入的期望回报年利率
     * @param rate 输入的出借时长（月）
     * @return
     */
//    public Interest deposit(double money,double months,double rate){
//        return null;
//    }
}
