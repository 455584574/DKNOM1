package com.qianfeng.springboot.bean;


public class BidDetail {

  private String bidId;
  private long userId;
  private String borrowMoneyId;
  private String borrowNumber;
  private long bidMoney;
  private java.sql.Timestamp bidTime;
  private String bidStatusbidStatus;
  private String bidStatus;
  private long grossInterest;


  public String getBorrowNumber() {
    return borrowNumber;
  }

  public void setBorrowNumber(String borrowNumber) {
    this.borrowNumber = borrowNumber;
  }

  public String getBidId() {
    return bidId;
  }

  public void setBidId(String bidId) {
    this.bidId = bidId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getBorrowMoneyId() {
    return borrowMoneyId;
  }

  public void setBorrowMoneyId(String borrowMoneyId) {
    this.borrowMoneyId = borrowMoneyId;
  }


  public long getBidMoney() {
    return bidMoney;
  }

  public void setBidMoney(long bidMoney) {
    this.bidMoney = bidMoney;
  }


  public java.sql.Timestamp getBidTime() {
    return bidTime;
  }

  public void setBidTime(java.sql.Timestamp bidTime) {
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


  public long getGrossInterest() {
    return grossInterest;
  }

  public void setGrossInterest(long grossInterest) {
    this.grossInterest = grossInterest;
  }

}
