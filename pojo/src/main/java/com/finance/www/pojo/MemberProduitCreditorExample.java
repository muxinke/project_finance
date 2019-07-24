package com.finance.www.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberProduitCreditorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberProduitCreditorExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andProduitIdIsNull() {
            addCriterion("produit_id is null");
            return (Criteria) this;
        }

        public Criteria andProduitIdIsNotNull() {
            addCriterion("produit_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduitIdEqualTo(Integer value) {
            addCriterion("produit_id =", value, "produitId");
            return (Criteria) this;
        }

        public Criteria andProduitIdNotEqualTo(Integer value) {
            addCriterion("produit_id <>", value, "produitId");
            return (Criteria) this;
        }

        public Criteria andProduitIdGreaterThan(Integer value) {
            addCriterion("produit_id >", value, "produitId");
            return (Criteria) this;
        }

        public Criteria andProduitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("produit_id >=", value, "produitId");
            return (Criteria) this;
        }

        public Criteria andProduitIdLessThan(Integer value) {
            addCriterion("produit_id <", value, "produitId");
            return (Criteria) this;
        }

        public Criteria andProduitIdLessThanOrEqualTo(Integer value) {
            addCriterion("produit_id <=", value, "produitId");
            return (Criteria) this;
        }

        public Criteria andProduitIdIn(List<Integer> values) {
            addCriterion("produit_id in", values, "produitId");
            return (Criteria) this;
        }

        public Criteria andProduitIdNotIn(List<Integer> values) {
            addCriterion("produit_id not in", values, "produitId");
            return (Criteria) this;
        }

        public Criteria andProduitIdBetween(Integer value1, Integer value2) {
            addCriterion("produit_id between", value1, value2, "produitId");
            return (Criteria) this;
        }

        public Criteria andProduitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("produit_id not between", value1, value2, "produitId");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsIsNull() {
            addCriterion("debtor_particulars is null");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsIsNotNull() {
            addCriterion("debtor_particulars is not null");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsEqualTo(String value) {
            addCriterion("debtor_particulars =", value, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsNotEqualTo(String value) {
            addCriterion("debtor_particulars <>", value, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsGreaterThan(String value) {
            addCriterion("debtor_particulars >", value, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsGreaterThanOrEqualTo(String value) {
            addCriterion("debtor_particulars >=", value, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsLessThan(String value) {
            addCriterion("debtor_particulars <", value, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsLessThanOrEqualTo(String value) {
            addCriterion("debtor_particulars <=", value, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsLike(String value) {
            addCriterion("debtor_particulars like", value, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsNotLike(String value) {
            addCriterion("debtor_particulars not like", value, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsIn(List<String> values) {
            addCriterion("debtor_particulars in", values, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsNotIn(List<String> values) {
            addCriterion("debtor_particulars not in", values, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsBetween(String value1, String value2) {
            addCriterion("debtor_particulars between", value1, value2, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andDebtorParticularsNotBetween(String value1, String value2) {
            addCriterion("debtor_particulars not between", value1, value2, "debtorParticulars");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsIsNull() {
            addCriterion("guarantor_details is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsIsNotNull() {
            addCriterion("guarantor_details is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsEqualTo(String value) {
            addCriterion("guarantor_details =", value, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsNotEqualTo(String value) {
            addCriterion("guarantor_details <>", value, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsGreaterThan(String value) {
            addCriterion("guarantor_details >", value, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("guarantor_details >=", value, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsLessThan(String value) {
            addCriterion("guarantor_details <", value, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsLessThanOrEqualTo(String value) {
            addCriterion("guarantor_details <=", value, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsLike(String value) {
            addCriterion("guarantor_details like", value, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsNotLike(String value) {
            addCriterion("guarantor_details not like", value, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsIn(List<String> values) {
            addCriterion("guarantor_details in", values, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsNotIn(List<String> values) {
            addCriterion("guarantor_details not in", values, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsBetween(String value1, String value2) {
            addCriterion("guarantor_details between", value1, value2, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andGuarantorDetailsNotBetween(String value1, String value2) {
            addCriterion("guarantor_details not between", value1, value2, "guarantorDetails");
            return (Criteria) this;
        }

        public Criteria andLoansUsedIsNull() {
            addCriterion("loans_used is null");
            return (Criteria) this;
        }

        public Criteria andLoansUsedIsNotNull() {
            addCriterion("loans_used is not null");
            return (Criteria) this;
        }

        public Criteria andLoansUsedEqualTo(String value) {
            addCriterion("loans_used =", value, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedNotEqualTo(String value) {
            addCriterion("loans_used <>", value, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedGreaterThan(String value) {
            addCriterion("loans_used >", value, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedGreaterThanOrEqualTo(String value) {
            addCriterion("loans_used >=", value, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedLessThan(String value) {
            addCriterion("loans_used <", value, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedLessThanOrEqualTo(String value) {
            addCriterion("loans_used <=", value, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedLike(String value) {
            addCriterion("loans_used like", value, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedNotLike(String value) {
            addCriterion("loans_used not like", value, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedIn(List<String> values) {
            addCriterion("loans_used in", values, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedNotIn(List<String> values) {
            addCriterion("loans_used not in", values, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedBetween(String value1, String value2) {
            addCriterion("loans_used between", value1, value2, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andLoansUsedNotBetween(String value1, String value2) {
            addCriterion("loans_used not between", value1, value2, "loansUsed");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentIsNull() {
            addCriterion("Source_repayment is null");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentIsNotNull() {
            addCriterion("Source_repayment is not null");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentEqualTo(String value) {
            addCriterion("Source_repayment =", value, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentNotEqualTo(String value) {
            addCriterion("Source_repayment <>", value, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentGreaterThan(String value) {
            addCriterion("Source_repayment >", value, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("Source_repayment >=", value, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentLessThan(String value) {
            addCriterion("Source_repayment <", value, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentLessThanOrEqualTo(String value) {
            addCriterion("Source_repayment <=", value, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentLike(String value) {
            addCriterion("Source_repayment like", value, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentNotLike(String value) {
            addCriterion("Source_repayment not like", value, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentIn(List<String> values) {
            addCriterion("Source_repayment in", values, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentNotIn(List<String> values) {
            addCriterion("Source_repayment not in", values, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentBetween(String value1, String value2) {
            addCriterion("Source_repayment between", value1, value2, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andSourceRepaymentNotBetween(String value1, String value2) {
            addCriterion("Source_repayment not between", value1, value2, "sourceRepayment");
            return (Criteria) this;
        }

        public Criteria andRiskControlIsNull() {
            addCriterion("risk_control is null");
            return (Criteria) this;
        }

        public Criteria andRiskControlIsNotNull() {
            addCriterion("risk_control is not null");
            return (Criteria) this;
        }

        public Criteria andRiskControlEqualTo(String value) {
            addCriterion("risk_control =", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlNotEqualTo(String value) {
            addCriterion("risk_control <>", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlGreaterThan(String value) {
            addCriterion("risk_control >", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlGreaterThanOrEqualTo(String value) {
            addCriterion("risk_control >=", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlLessThan(String value) {
            addCriterion("risk_control <", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlLessThanOrEqualTo(String value) {
            addCriterion("risk_control <=", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlLike(String value) {
            addCriterion("risk_control like", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlNotLike(String value) {
            addCriterion("risk_control not like", value, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlIn(List<String> values) {
            addCriterion("risk_control in", values, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlNotIn(List<String> values) {
            addCriterion("risk_control not in", values, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlBetween(String value1, String value2) {
            addCriterion("risk_control between", value1, value2, "riskControl");
            return (Criteria) this;
        }

        public Criteria andRiskControlNotBetween(String value1, String value2) {
            addCriterion("risk_control not between", value1, value2, "riskControl");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionIsNull() {
            addCriterion("final_opinion is null");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionIsNotNull() {
            addCriterion("final_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionEqualTo(String value) {
            addCriterion("final_opinion =", value, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionNotEqualTo(String value) {
            addCriterion("final_opinion <>", value, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionGreaterThan(String value) {
            addCriterion("final_opinion >", value, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("final_opinion >=", value, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionLessThan(String value) {
            addCriterion("final_opinion <", value, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionLessThanOrEqualTo(String value) {
            addCriterion("final_opinion <=", value, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionLike(String value) {
            addCriterion("final_opinion like", value, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionNotLike(String value) {
            addCriterion("final_opinion not like", value, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionIn(List<String> values) {
            addCriterion("final_opinion in", values, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionNotIn(List<String> values) {
            addCriterion("final_opinion not in", values, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionBetween(String value1, String value2) {
            addCriterion("final_opinion between", value1, value2, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andFinalOpinionNotBetween(String value1, String value2) {
            addCriterion("final_opinion not between", value1, value2, "finalOpinion");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}