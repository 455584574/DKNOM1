package com.qianfeng.springboot.bean;


public class TradingRecord {

  private long transactionId;
  private long userId;
  private String transactionNum;
  private String transactionName;
  private String transactionType;
  private long transactionPrice;
  private long availableBalance;
  private long frozenCapital;
  private long collectMoney;
  private java.sql.Timestamp time;
  private String remark;


  public long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(long transactionId) {
    this.transactionId = transactionId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getTransactionNum() {
    return transactionNum;
  }

  public void setTransactionNum(String transactionNum) {
    this.transactionNum = transactionNum;
  }


  public String getTransactionName() {
    return transactionName;
  }

  public void setTransactionName(String transactionName) {
    this.transactionName = transactionName;
  }


  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public long getTransactionPrice() {
    return transactionPrice;
  }

  public void setTransactionPrice(long transactionPrice) {
    this.transactionPrice = transactionPrice;
  }


  public long getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(long availableBalance) {
    this.availableBalance = availableBalance;
  }


  public long getFrozenCapital() {
    return frozenCapital;
  }

  public void setFrozenCapital(long frozenCapital) {
    this.frozenCapital = frozenCapital;
  }


  public long getCollectMoney() {
    return collectMoney;
  }

  public void setCollectMoney(long collectMoney) {
    this.collectMoney = collectMoney;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
