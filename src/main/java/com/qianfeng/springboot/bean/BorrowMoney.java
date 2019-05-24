package com.qianfeng.springboot.bean;

import lombok.Data;

@Data
public class BorrowMoney {

  private long borrowMoneyId;
  private String borrowNumber;
  private long productId;
  private long borrowerId;
  private long borrowMoneySum;
  private long borrowMoneyServe;
  private long fundsReceived;
  private double borrowMoneyRepayment;
  private double receiptCapital;
  private double receiptInterest;
  private double bidSun;
  private double annualInterestRate;
  private String paymentMethod;
  private long minTenderedSum;
  private String validTime;
  private Long lifeOfLoan;
  private String maxBid;
  private String finalRepaymentDate;
  private String borrowMoneyState;
  private String achievePercent;
  private String releaseTime;
  private String repaymentStartTime;
  private String repaymenFinalTime;
}
