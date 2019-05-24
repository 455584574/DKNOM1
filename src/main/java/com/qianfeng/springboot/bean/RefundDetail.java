package com.qianfeng.springboot.bean;


public class RefundDetail {

  private long refundId;
  private long borrowerId;
  private double refundInterest;
  private double refundCapital;
  private java.sql.Timestamp refundTime;
  private String state;
  private java.sql.Timestamp realTime;
  private double realCapiInterest;


  public long getRefundId() {
    return refundId;
  }

  public void setRefundId(long refundId) {
    this.refundId = refundId;
  }


  public long getBorrowerId() {
    return borrowerId;
  }

  public void setBorrowerId(long borrowerId) {
    this.borrowerId = borrowerId;
  }


  public double getRefundInterest() {
    return refundInterest;
  }

  public void setRefundInterest(double refundInterest) {
    this.refundInterest = refundInterest;
  }


  public double getRefundCapital() {
    return refundCapital;
  }

  public void setRefundCapital(double refundCapital) {
    this.refundCapital = refundCapital;
  }


  public java.sql.Timestamp getRefundTime() {
    return refundTime;
  }

  public void setRefundTime(java.sql.Timestamp refundTime) {
    this.refundTime = refundTime;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public java.sql.Timestamp getRealTime() {
    return realTime;
  }

  public void setRealTime(java.sql.Timestamp realTime) {
    this.realTime = realTime;
  }


  public double getRealCapiInterest() {
    return realCapiInterest;
  }

  public void setRealCapiInterest(double realCapiInterest) {
    this.realCapiInterest = realCapiInterest;
  }

}
