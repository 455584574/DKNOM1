package com.qianfeng.springboot.vo;

public class BorrowerVO{
    private long borrowerId;
    private String borrowNumber;
    private String borrowerName;
    private String borrowerNumber;
    private long lifeOfLoan;

    public long getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(long borrowerId) {
        this.borrowerId = borrowerId;
    }

    private long borrowMoneySum;

    public String getBorrowNumber() {
        return borrowNumber;
    }

    public void setBorrowNumber(String borrowNumber) {
        this.borrowNumber = borrowNumber;
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

    public long getLifeOfLoan() {
        return lifeOfLoan;
    }

    public void setLifeOfLoan(long lifeOfLoan) {
        this.lifeOfLoan = lifeOfLoan;
    }

    public long getBorrowMoneySum() {
        return borrowMoneySum;
    }

    public void setBorrowMoneySum(long borrowMoneySum) {
        this.borrowMoneySum = borrowMoneySum;
    }
}
