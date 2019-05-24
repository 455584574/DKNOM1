package com.qianfeng.springboot.bean;


public class ReceivablesDetails {

  private long receivablesId;
  private long refundId;
  private double receivableCapital;
  private double receivableInterest;
  private double recCapitalInterest;
  private java.sql.Timestamp recTime;
  private String receivablesState;
  private double offCapitalInterest;
  private java.sql.Timestamp offTime;
  private double poundage;


  public long getReceivablesId() {
    return receivablesId;
  }

  public void setReceivablesId(long receivablesId) {
    this.receivablesId = receivablesId;
  }


  public long getRefundId() {
    return refundId;
  }

  public void setRefundId(long refundId) {
    this.refundId = refundId;
  }


  public double getReceivableCapital() {
    return receivableCapital;
  }

  public void setReceivableCapital(double receivableCapital) {
    this.receivableCapital = receivableCapital;
  }


  public double getReceivableInterest() {
    return receivableInterest;
  }

  public void setReceivableInterest(double receivableInterest) {
    this.receivableInterest = receivableInterest;
  }


  public double getRecCapitalInterest() {
    return recCapitalInterest;
  }

  public void setRecCapitalInterest(double recCapitalInterest) {
    this.recCapitalInterest = recCapitalInterest;
  }


  public java.sql.Timestamp getRecTime() {
    return recTime;
  }

  public void setRecTime(java.sql.Timestamp recTime) {
    this.recTime = recTime;
  }


  public String getReceivablesState() {
    return receivablesState;
  }

  public void setReceivablesState(String receivablesState) {
    this.receivablesState = receivablesState;
  }


  public double getOffCapitalInterest() {
    return offCapitalInterest;
  }

  public void setOffCapitalInterest(double offCapitalInterest) {
    this.offCapitalInterest = offCapitalInterest;
  }


  public java.sql.Timestamp getOffTime() {
    return offTime;
  }

  public void setOffTime(java.sql.Timestamp offTime) {
    this.offTime = offTime;
  }


  public double getPoundage() {
    return poundage;
  }

  public void setPoundage(double poundage) {
    this.poundage = poundage;
  }

}
