package com.finance.www.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberReceivableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberReceivableExample() {
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

        public Criteria andAccountsReceivableDateIsNull() {
            addCriterion("accounts_receivable_date is null");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateIsNotNull() {
            addCriterion("accounts_receivable_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateEqualTo(Date value) {
            addCriterion("accounts_receivable_date =", value, "accountsReceivableDate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateNotEqualTo(Date value) {
            addCriterion("accounts_receivable_date <>", value, "accountsReceivableDate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateGreaterThan(Date value) {
            addCriterion("accounts_receivable_date >", value, "accountsReceivableDate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateGreaterThanOrEqualTo(Date value) {
            addCriterion("accounts_receivable_date >=", value, "accountsReceivableDate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateLessThan(Date value) {
            addCriterion("accounts_receivable_date <", value, "accountsReceivableDate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateLessThanOrEqualTo(Date value) {
            addCriterion("accounts_receivable_date <=", value, "accountsReceivableDate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateIn(List<Date> values) {
            addCriterion("accounts_receivable_date in", values, "accountsReceivableDate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateNotIn(List<Date> values) {
            addCriterion("accounts_receivable_date not in", values, "accountsReceivableDate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateBetween(Date value1, Date value2) {
            addCriterion("accounts_receivable_date between", value1, value2, "accountsReceivableDate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableDateNotBetween(Date value1, Date value2) {
            addCriterion("accounts_receivable_date not between", value1, value2, "accountsReceivableDate");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalIsNull() {
            addCriterion("Current_total is null");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalIsNotNull() {
            addCriterion("Current_total is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalEqualTo(String value) {
            addCriterion("Current_total =", value, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalNotEqualTo(String value) {
            addCriterion("Current_total <>", value, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalGreaterThan(String value) {
            addCriterion("Current_total >", value, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalGreaterThanOrEqualTo(String value) {
            addCriterion("Current_total >=", value, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalLessThan(String value) {
            addCriterion("Current_total <", value, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalLessThanOrEqualTo(String value) {
            addCriterion("Current_total <=", value, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalLike(String value) {
            addCriterion("Current_total like", value, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalNotLike(String value) {
            addCriterion("Current_total not like", value, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalIn(List<String> values) {
            addCriterion("Current_total in", values, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalNotIn(List<String> values) {
            addCriterion("Current_total not in", values, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalBetween(String value1, String value2) {
            addCriterion("Current_total between", value1, value2, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCurrentTotalNotBetween(String value1, String value2) {
            addCriterion("Current_total not between", value1, value2, "currentTotal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalIsNull() {
            addCriterion("collected_principal is null");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalIsNotNull() {
            addCriterion("collected_principal is not null");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalEqualTo(String value) {
            addCriterion("collected_principal =", value, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalNotEqualTo(String value) {
            addCriterion("collected_principal <>", value, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalGreaterThan(String value) {
            addCriterion("collected_principal >", value, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("collected_principal >=", value, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalLessThan(String value) {
            addCriterion("collected_principal <", value, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalLessThanOrEqualTo(String value) {
            addCriterion("collected_principal <=", value, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalLike(String value) {
            addCriterion("collected_principal like", value, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalNotLike(String value) {
            addCriterion("collected_principal not like", value, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalIn(List<String> values) {
            addCriterion("collected_principal in", values, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalNotIn(List<String> values) {
            addCriterion("collected_principal not in", values, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalBetween(String value1, String value2) {
            addCriterion("collected_principal between", value1, value2, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectedPrincipalNotBetween(String value1, String value2) {
            addCriterion("collected_principal not between", value1, value2, "collectedPrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestIsNull() {
            addCriterion("collecting_interest is null");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestIsNotNull() {
            addCriterion("collecting_interest is not null");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestEqualTo(String value) {
            addCriterion("collecting_interest =", value, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestNotEqualTo(String value) {
            addCriterion("collecting_interest <>", value, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestGreaterThan(String value) {
            addCriterion("collecting_interest >", value, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestGreaterThanOrEqualTo(String value) {
            addCriterion("collecting_interest >=", value, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestLessThan(String value) {
            addCriterion("collecting_interest <", value, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestLessThanOrEqualTo(String value) {
            addCriterion("collecting_interest <=", value, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestLike(String value) {
            addCriterion("collecting_interest like", value, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestNotLike(String value) {
            addCriterion("collecting_interest not like", value, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestIn(List<String> values) {
            addCriterion("collecting_interest in", values, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestNotIn(List<String> values) {
            addCriterion("collecting_interest not in", values, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestBetween(String value1, String value2) {
            addCriterion("collecting_interest between", value1, value2, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingInterestNotBetween(String value1, String value2) {
            addCriterion("collecting_interest not between", value1, value2, "collectingInterest");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalIsNull() {
            addCriterion("collecting_total is null");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalIsNotNull() {
            addCriterion("collecting_total is not null");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalEqualTo(String value) {
            addCriterion("collecting_total =", value, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalNotEqualTo(String value) {
            addCriterion("collecting_total <>", value, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalGreaterThan(String value) {
            addCriterion("collecting_total >", value, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalGreaterThanOrEqualTo(String value) {
            addCriterion("collecting_total >=", value, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalLessThan(String value) {
            addCriterion("collecting_total <", value, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalLessThanOrEqualTo(String value) {
            addCriterion("collecting_total <=", value, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalLike(String value) {
            addCriterion("collecting_total like", value, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalNotLike(String value) {
            addCriterion("collecting_total not like", value, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalIn(List<String> values) {
            addCriterion("collecting_total in", values, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalNotIn(List<String> values) {
            addCriterion("collecting_total not in", values, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalBetween(String value1, String value2) {
            addCriterion("collecting_total between", value1, value2, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andCollectingTotalNotBetween(String value1, String value2) {
            addCriterion("collecting_total not between", value1, value2, "collectingTotal");
            return (Criteria) this;
        }

        public Criteria andManagementFeeIsNull() {
            addCriterion("management_fee is null");
            return (Criteria) this;
        }

        public Criteria andManagementFeeIsNotNull() {
            addCriterion("management_fee is not null");
            return (Criteria) this;
        }

        public Criteria andManagementFeeEqualTo(String value) {
            addCriterion("management_fee =", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeNotEqualTo(String value) {
            addCriterion("management_fee <>", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeGreaterThan(String value) {
            addCriterion("management_fee >", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeGreaterThanOrEqualTo(String value) {
            addCriterion("management_fee >=", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeLessThan(String value) {
            addCriterion("management_fee <", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeLessThanOrEqualTo(String value) {
            addCriterion("management_fee <=", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeLike(String value) {
            addCriterion("management_fee like", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeNotLike(String value) {
            addCriterion("management_fee not like", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeIn(List<String> values) {
            addCriterion("management_fee in", values, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeNotIn(List<String> values) {
            addCriterion("management_fee not in", values, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeBetween(String value1, String value2) {
            addCriterion("management_fee between", value1, value2, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeNotBetween(String value1, String value2) {
            addCriterion("management_fee not between", value1, value2, "managementFee");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalIsNull() {
            addCriterion("should_principal is null");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalIsNotNull() {
            addCriterion("should_principal is not null");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalEqualTo(String value) {
            addCriterion("should_principal =", value, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalNotEqualTo(String value) {
            addCriterion("should_principal <>", value, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalGreaterThan(String value) {
            addCriterion("should_principal >", value, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("should_principal >=", value, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalLessThan(String value) {
            addCriterion("should_principal <", value, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalLessThanOrEqualTo(String value) {
            addCriterion("should_principal <=", value, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalLike(String value) {
            addCriterion("should_principal like", value, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalNotLike(String value) {
            addCriterion("should_principal not like", value, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalIn(List<String> values) {
            addCriterion("should_principal in", values, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalNotIn(List<String> values) {
            addCriterion("should_principal not in", values, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalBetween(String value1, String value2) {
            addCriterion("should_principal between", value1, value2, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldPrincipalNotBetween(String value1, String value2) {
            addCriterion("should_principal not between", value1, value2, "shouldPrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountIsNull() {
            addCriterion("receivable_account is null");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountIsNotNull() {
            addCriterion("receivable_account is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountEqualTo(String value) {
            addCriterion("receivable_account =", value, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountNotEqualTo(String value) {
            addCriterion("receivable_account <>", value, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountGreaterThan(String value) {
            addCriterion("receivable_account >", value, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountGreaterThanOrEqualTo(String value) {
            addCriterion("receivable_account >=", value, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountLessThan(String value) {
            addCriterion("receivable_account <", value, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountLessThanOrEqualTo(String value) {
            addCriterion("receivable_account <=", value, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountLike(String value) {
            addCriterion("receivable_account like", value, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountNotLike(String value) {
            addCriterion("receivable_account not like", value, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountIn(List<String> values) {
            addCriterion("receivable_account in", values, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountNotIn(List<String> values) {
            addCriterion("receivable_account not in", values, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountBetween(String value1, String value2) {
            addCriterion("receivable_account between", value1, value2, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountNotBetween(String value1, String value2) {
            addCriterion("receivable_account not between", value1, value2, "receivableAccount");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestIsNull() {
            addCriterion("paid_principal_interest is null");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestIsNotNull() {
            addCriterion("paid_principal_interest is not null");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestEqualTo(String value) {
            addCriterion("paid_principal_interest =", value, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestNotEqualTo(String value) {
            addCriterion("paid_principal_interest <>", value, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestGreaterThan(String value) {
            addCriterion("paid_principal_interest >", value, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestGreaterThanOrEqualTo(String value) {
            addCriterion("paid_principal_interest >=", value, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestLessThan(String value) {
            addCriterion("paid_principal_interest <", value, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestLessThanOrEqualTo(String value) {
            addCriterion("paid_principal_interest <=", value, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestLike(String value) {
            addCriterion("paid_principal_interest like", value, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestNotLike(String value) {
            addCriterion("paid_principal_interest not like", value, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestIn(List<String> values) {
            addCriterion("paid_principal_interest in", values, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestNotIn(List<String> values) {
            addCriterion("paid_principal_interest not in", values, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestBetween(String value1, String value2) {
            addCriterion("paid_principal_interest between", value1, value2, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalInterestNotBetween(String value1, String value2) {
            addCriterion("paid_principal_interest not between", value1, value2, "paidPrincipalInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestIsNull() {
            addCriterion("paid_interest is null");
            return (Criteria) this;
        }

        public Criteria andPaidInterestIsNotNull() {
            addCriterion("paid_interest is not null");
            return (Criteria) this;
        }

        public Criteria andPaidInterestEqualTo(String value) {
            addCriterion("paid_interest =", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestNotEqualTo(String value) {
            addCriterion("paid_interest <>", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestGreaterThan(String value) {
            addCriterion("paid_interest >", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestGreaterThanOrEqualTo(String value) {
            addCriterion("paid_interest >=", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestLessThan(String value) {
            addCriterion("paid_interest <", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestLessThanOrEqualTo(String value) {
            addCriterion("paid_interest <=", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestLike(String value) {
            addCriterion("paid_interest like", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestNotLike(String value) {
            addCriterion("paid_interest not like", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestIn(List<String> values) {
            addCriterion("paid_interest in", values, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestNotIn(List<String> values) {
            addCriterion("paid_interest not in", values, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestBetween(String value1, String value2) {
            addCriterion("paid_interest between", value1, value2, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestNotBetween(String value1, String value2) {
            addCriterion("paid_interest not between", value1, value2, "paidInterest");
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