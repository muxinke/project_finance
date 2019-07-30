package com.finance.www.pojo;

import java.util.Date;

public class BigLoan {
    private Integer id;

    private Integer memberId;

    private Long amount;

    private Integer xingzhi;

    private Integer howlong;

    private Integer paymethod;

    private String idcardone;

    private String idcardtwo;

    private String bankcard;

    private Date createTime;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Integer getXingzhi() {
        return xingzhi;
    }

    public void setXingzhi(Integer xingzhi) {
        this.xingzhi = xingzhi;
    }

    public Integer getHowlong() {
        return howlong;
    }

    public void setHowlong(Integer howlong) {
        this.howlong = howlong;
    }

    public Integer getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(Integer paymethod) {
        this.paymethod = paymethod;
    }

    public String getIdcardone() {
        return idcardone;
    }

    public void setIdcardone(String idcardone) {
        this.idcardone = idcardone == null ? null : idcardone.trim();
    }

    public String getIdcardtwo() {
        return idcardtwo;
    }

    public void setIdcardtwo(String idcardtwo) {
        this.idcardtwo = idcardtwo == null ? null : idcardtwo.trim();
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}