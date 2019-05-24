package com.qianfeng.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradingRecord {
  private long transactionId;
  private long userId;
  private String transactionNum;
  private String transactionName;
  private String transactionType;
  private long transactionPrice;
  private long availableBalance;
  private long frozenCapital;
  private Double collectMoney;
  private String time;
  private String remark;
}
