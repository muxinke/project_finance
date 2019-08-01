package com.finance.www.pojo;

public class BankLimitmoney {
    private Integer bankId;

    private String bankName;

    private Long limitMoney;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Long getLimitMoney() {
        return limitMoney;
    }

    public void setLimitMoney(Long limitMoney) {
        this.limitMoney = limitMoney;
    }
}