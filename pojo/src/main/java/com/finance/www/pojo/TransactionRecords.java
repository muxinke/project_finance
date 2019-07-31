package com.finance.www.pojo;

import java.util.Date;

public class TransactionRecords {
    private Integer id;

    private Integer jytype;

    private String jine;

    private String dealingParty;

    private Date jiluTime;

    private Integer memberId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJytype() {
        return jytype;
    }

    public void setJytype(Integer jytype) {
        this.jytype = jytype;
    }

    public String getJine() {
        return jine;
    }

    public void setJine(String jine) {
        this.jine = jine == null ? null : jine.trim();
    }

    public String getDealingParty() {
        return dealingParty;
    }

    public void setDealingParty(String dealingParty) {
        this.dealingParty = dealingParty == null ? null : dealingParty.trim();
    }

    public Date getJiluTime() {
        return jiluTime;
    }

    public void setJiluTime(Date jiluTime) {
        this.jiluTime = jiluTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
}