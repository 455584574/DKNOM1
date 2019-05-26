package com.qianfeng.springboot.vo;


import com.qianfeng.springboot.bean.ProductInfo;

import java.util.Date;

public class BorrowMoney {

  private long borrowMoneyId;
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
  private Date validTime;
  private String lifeOfLoan;
  private Date maxBid;
  private Date finalRepaymentDate;
  private String borrowMoneyState;
  private long achievePercent;
  private Date releaseTime;
  private Date repaymentStartTime;
  private Date repaymenFinalTime;

  private ProductInfo productInfo;

  public ProductInfo getProductInfo() {
    return productInfo;
  }

  public void setProductInfo(ProductInfo productInfo) {
    this.productInfo = productInfo;
  }

  public long getBorrowMoneyId() {
    return borrowMoneyId;
  }

  public void setBorrowMoneyId(long borrowMoneyId) {
    this.borrowMoneyId = borrowMoneyId;
  }

  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

  public long getBorrowerId() {
    return borrowerId;
  }

  public void setBorrowerId(long borrowerId) {
    this.borrowerId = borrowerId;
  }

  public long getBorrowMoneySum() {
    return borrowMoneySum;
  }

  public void setBorrowMoneySum(long borrowMoneySum) {
    this.borrowMoneySum = borrowMoneySum;
  }

  public long getBorrowMoneyServe() {
    return borrowMoneyServe;
  }

  public void setBorrowMoneyServe(long borrowMoneyServe) {
    this.borrowMoneyServe = borrowMoneyServe;
  }

  public long getFundsReceived() {
    return fundsReceived;
  }

  public void setFundsReceived(long fundsReceived) {
    this.fundsReceived = fundsReceived;
  }

  public double getBorrowMoneyRepayment() {
    return borrowMoneyRepayment;
  }

  public void setBorrowMoneyRepayment(double borrowMoneyRepayment) {
    this.borrowMoneyRepayment = borrowMoneyRepayment;
  }

  public double getReceiptCapital() {
    return receiptCapital;
  }

  public void setReceiptCapital(double receiptCapital) {
    this.receiptCapital = receiptCapital;
  }

  public double getReceiptInterest() {
    return receiptInterest;
  }

  public void setReceiptInterest(double receiptInterest) {
    this.receiptInterest = receiptInterest;
  }

  public double getBidSun() {
    return bidSun;
  }

  public void setBidSun(double bidSun) {
    this.bidSun = bidSun;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public long getMinTenderedSum() {
    return minTenderedSum;
  }

  public void setMinTenderedSum(long minTenderedSum) {
    this.minTenderedSum = minTenderedSum;
  }

  public Date getValidTime() {
    return validTime;
  }

  public void setValidTime(Date validTime) {
    this.validTime = validTime;
  }

  public String getLifeOfLoan() {
    return lifeOfLoan;
  }

  public void setLifeOfLoan(String lifeOfLoan) {
    this.lifeOfLoan = lifeOfLoan;
  }

  public Date getMaxBid() {
    return maxBid;
  }

  public void setMaxBid(Date maxBid) {
    this.maxBid = maxBid;
  }

  public Date getFinalRepaymentDate() {
    return finalRepaymentDate;
  }

  public void setFinalRepaymentDate(Date finalRepaymentDate) {
    this.finalRepaymentDate = finalRepaymentDate;
  }

  public String getBorrowMoneyState() {
    return borrowMoneyState;
  }

  public void setBorrowMoneyState(String borrowMoneyState) {
    this.borrowMoneyState = borrowMoneyState;
  }

  public long getAchievePercent() {
    return achievePercent;
  }

  public void setAchievePercent(long achievePercent) {
    this.achievePercent = achievePercent;
  }

  public Date getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
  }

  public Date getRepaymentStartTime() {
    return repaymentStartTime;
  }

  public void setRepaymentStartTime(Date repaymentStartTime) {
    this.repaymentStartTime = repaymentStartTime;
  }

  public Date getRepaymenFinalTime() {
    return repaymenFinalTime;
  }

  public void setRepaymenFinalTime(Date repaymenFinalTime) {
    this.repaymenFinalTime = repaymenFinalTime;
  }
}
