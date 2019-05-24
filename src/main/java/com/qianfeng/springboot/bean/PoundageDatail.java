package com.qianfeng.springboot.bean;


public class PoundageDatail {

  private long poundaId;
  private long poundageMoney;
  private String poundageType;
  private String remark;
  private String poundageNum;
  private java.sql.Timestamp time;
  private String state;


  public long getPoundaId() {
    return poundaId;
  }

  public void setPoundaId(long poundaId) {
    this.poundaId = poundaId;
  }


  public long getPoundageMoney() {
    return poundageMoney;
  }

  public void setPoundageMoney(long poundageMoney) {
    this.poundageMoney = poundageMoney;
  }


  public String getPoundageType() {
    return poundageType;
  }

  public void setPoundageType(String poundageType) {
    this.poundageType = poundageType;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getPoundageNum() {
    return poundageNum;
  }

  public void setPoundageNum(String poundageNum) {
    this.poundageNum = poundageNum;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

}
