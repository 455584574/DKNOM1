package com.qianfeng.springboot.vo;

public class BorrowInfoYVO {

    private int borrowMoneyId;
    private String borrowNumber;
    private int borrowerId;
    private String borrowerName;
    private String borrowerNumber;
    private int viability;
    private int borrowMoneySum;

    public int getBorrowMoneyId(){
        return borrowMoneyId;
    }
    public void setBorrowMoneyId(int borrowMoneyId) {
        this.borrowMoneyId = borrowMoneyId;
    }

    public String getBorrowNumber() {
        return borrowNumber;
    }

    public void setBorrowNumber(String borrowNumber) {
        this.borrowNumber = borrowNumber;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBorrowerNumber() {
        return borrowerNumber;
    }

    public void setBorrowerNumber(String borrowerNumber) {
        this.borrowerNumber = borrowerNumber;
    }

    public int getViability() {
        return viability;
    }

    public void setViability(int viability) {
        this.viability = viability;
    }

    public int getBorrowMoneySum() {
        return borrowMoneySum;
    }

    public void setBorrowMoneySum(int borrowMoneySum) {
        this.borrowMoneySum = borrowMoneySum;
    }
}
