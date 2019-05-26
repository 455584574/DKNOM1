package com.qianfeng.springboot.bean;


public class ProductInfo {

  private long productInfoId;
  private String infoName;
  private double rateReturn;
  private long viability;
  private long productId;
  private long borrowerId;


  public long getProductInfoId() {
    return productInfoId;
  }

  public void setProductInfoId(long productInfoId) {
    this.productInfoId = productInfoId;
  }

  public String getInfoName() {
    return infoName;
  }

  public void setInfoName(String infoName) {
    this.infoName = infoName;
  }

  public double getRateReturn() {
    return rateReturn;
  }

  public void setRateReturn(double rateReturn) {
    this.rateReturn = rateReturn;
  }

  public long getViability() {
    return viability;
  }

  public void setViability(long viability) {
    this.viability = viability;
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
}
