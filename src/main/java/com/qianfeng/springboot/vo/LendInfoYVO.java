package com.qianfeng.springboot.vo;

public class LendInfoYVO {


    private String userNickname;
    private float bidMoney;
    private String bidTime;

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public float getBidMoney() {
        return bidMoney;
    }

    public void setBidMoney(float bidMoney) {
        this.bidMoney = bidMoney;
    }

    public String getBidTime() {
        return bidTime;
    }

    public void setBidTime(String bidTime) {
        this.bidTime = bidTime;
    }
}
