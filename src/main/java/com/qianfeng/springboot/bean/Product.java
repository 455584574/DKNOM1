package com.qianfeng.springboot.bean;


public class Product {

  private long productId;
  private String productName;
  private long productThreshold;
  private long productThresholdMax;
  private long productLock;
  private double productMinInterest;
  private double productMaxInterest;


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public long getProductThreshold() {
    return productThreshold;
  }

  public void setProductThreshold(long productThreshold) {
    this.productThreshold = productThreshold;
  }

  public long getProductThresholdMax() {
    return productThresholdMax;
  }

  public void setProductThresholdMax(long productThresholdMax) {
    this.productThresholdMax = productThresholdMax;
  }

  public long getProductLock() {
    return productLock;
  }

  public void setProductLock(long productLock) {
    this.productLock = productLock;
  }

  public double getProductMinInterest() {
    return productMinInterest;
  }

  public void setProductMinInterest(double productMinInterest) {
    this.productMinInterest = productMinInterest;
  }

  public double getProductMaxInterest() {
    return productMaxInterest;
  }

  public void setProductMaxInterest(double productMaxInterest) {
    this.productMaxInterest = productMaxInterest;
  }
}
