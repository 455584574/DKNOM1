package com.qianfeng.springboot.vo;

public class DCBLendYVO {

    private String borrowerName;
    private String productName;
    private float rateReturn;
    private Integer viability;

    public Integer getViability() {
        return viability;
    }

    public void setViability(Integer viability) {
        this.viability = viability;
    }

    public float getRateReturn() {
        return rateReturn;
    }

    public void setRateReturn(float rateReturn) {
        this.rateReturn = rateReturn;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
