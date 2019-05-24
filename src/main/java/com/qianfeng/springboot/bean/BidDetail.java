package com.qianfeng.springboot.bean;


public class BidDetail {

  private long bidId;
  private long userId;
  private long creditorId;
  private String borrowNumber;
  private double bidMoney;
  private String bidTime;
  private String bidStatusbidStatus;
  private String bidStatus;
  private double grossInterest;
  private long productInfoId;


  public long getBidId() {
    return bidId;
  }

  public void setBidId(long bidId) {
    this.bidId = bidId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getCreditorId() {
    return creditorId;
  }

  public void setCreditorId(long creditorId) {
    this.creditorId = creditorId;
  }


  public String getBorrowNumber() {
    return borrowNumber;
  }

  public void setBorrowNumber(String borrowNumber) {
    this.borrowNumber = borrowNumber;
  }


  public double getBidMoney() {
    return bidMoney;
  }

  public void setBidMoney(double bidMoney) {
    this.bidMoney = bidMoney;
  }


  public String getBidTime() {
    return bidTime;
  }

  public void setBidTime(String bidTime) {
    this.bidTime = bidTime;
  }


  public String getBidStatusbidStatus() {
    return bidStatusbidStatus;
  }

  public void setBidStatusbidStatus(String bidStatusbidStatus) {
    this.bidStatusbidStatus = bidStatusbidStatus;
  }


  public String getBidStatus() {
    return bidStatus;
  }

  public void setBidStatus(String bidStatus) {
    this.bidStatus = bidStatus;
  }


  public double getGrossInterest() {
    return grossInterest;
  }

  public void setGrossInterest(double grossInterest) {
    this.grossInterest = grossInterest;
  }


  public long getProductInfoId() {
    return productInfoId;
  }

  public void setProductInfoId(long productInfoId) {
    this.productInfoId = productInfoId;
  }

}
