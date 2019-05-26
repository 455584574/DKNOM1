package com.qianfeng.springboot.vo;


import com.qianfeng.springboot.bean.BidDetail;
import com.qianfeng.springboot.bean.UserDetails;

public class TbUser {

  private long userId;
  private String userAccount;
  private String userPassword;
  private String userNickname;
  private String userCellphone;
  private String userEmail;
  private long availableBalance;
  private long frozenCapital;

  private BidDetail bidDetail;
  private UserDetails userDetails;



  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public String getUserNickname() {
    return userNickname;
  }

  public void setUserNickname(String userNickname) {
    this.userNickname = userNickname;
  }

  public String getUserCellphone() {
    return userCellphone;
  }

  public void setUserCellphone(String userCellphone) {
    this.userCellphone = userCellphone;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
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

  public BidDetail getBidDetail() {
    return bidDetail;
  }

  public void setBidDetail(BidDetail bidDetail) {
    this.bidDetail = bidDetail;
  }

  public UserDetails getUserDetails() {
    return userDetails;
  }

  public void setUserDetails(UserDetails userDetails) {
    this.userDetails = userDetails;
  }
}
