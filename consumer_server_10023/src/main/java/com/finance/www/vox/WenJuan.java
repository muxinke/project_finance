package com.finance.www.vo;

import lombok.Data;

/**
 * Created by Administrator on 2019/7/24.
 */
public class WenJuan {
    private int age;
    private int work;
    private int income;
    private int nomoney;
    private int guarantee;
    private int debt;
    private int loantime;

    public WenJuan() {
    }

    public WenJuan(int age, int work, int income, int nomoney, int guarantee, int debt, int loantime) {
        this.age = age;
        this.work = work;
        this.income = income;
        this.nomoney = nomoney;
        this.guarantee = guarantee;
        this.debt = debt;
        this.loantime = loantime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getNomoney() {
        return nomoney;
    }

    public void setNomoney(int nomoney) {
        this.nomoney = nomoney;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int getLoantime() {
        return loantime;
    }

    public void setLoantime(int loantime) {
        this.loantime = loantime;
    }
}
