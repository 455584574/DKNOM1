package com.qianfeng.springboot.bean;


public class AssignmentDebt {

  private long assignmentId;
  private long userId;
  private long borrowMoneyId;
  private java.sql.Timestamp transferTime;
  private long recycleId;


  public long getAssignmentId() {
    return assignmentId;
  }

  public void setAssignmentId(long assignmentId) {
    this.assignmentId = assignmentId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getBorrowMoneyId() {
    return borrowMoneyId;
  }

  public void setBorrowMoneyId(long borrowMoneyId) {
    this.borrowMoneyId = borrowMoneyId;
  }


  public java.sql.Timestamp getTransferTime() {
    return transferTime;
  }

  public void setTransferTime(java.sql.Timestamp transferTime) {
    this.transferTime = transferTime;
  }


  public long getRecycleId() {
    return recycleId;
  }

  public void setRecycleId(long recycleId) {
    this.recycleId = recycleId;
  }

}
