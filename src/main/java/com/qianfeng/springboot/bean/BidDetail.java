package com.qianfeng.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BidDetail {
  private String bidId;
  private long userId;
  private long creditorId;
  private String borrowMoneyId;
  private long bidMoney;
  private String bidTime;
  private String Status;
  private String bidStatus;
  private Double grossInterest;
  private UserDetails user;
  private UserDetails creditor;
}
