package com.qianfeng.springboot.bean;


public class UserDetails {

  private long detailId;
  private long userId;
  private String userName;
  private String userCard;
  private long userBalance;
  private long userSum;
  private  double frozenCapital;

  public double getFrozenCapital() {
    return frozenCapital;
  }

  public void setFrozenCapital(double frozenCapital) {
    this.frozenCapital = frozenCapital;
  }

  public long getDetailId() {
    return detailId;
  }

  public void setDetailId(long detailId) {
    this.detailId = detailId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserCard() {
    return userCard;
  }

  public void setUserCard(String userCard) {
    this.userCard = userCard;
  }


  public long getUserBalance() {
    return userBalance;
  }

  public void setUserBalance(long userBalance) {
    this.userBalance = userBalance;
  }


  public long getUserSum() {
    return userSum;
  }

  public void setUserSum(long userSum) {
    this.userSum = userSum;
  }

}
