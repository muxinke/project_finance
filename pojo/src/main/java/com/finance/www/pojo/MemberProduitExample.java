package com.finance.www.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberProduitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberProduitExample() {
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

        public Criteria andPredictIncomeIsNull() {
            addCriterion("predict_income is null");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeIsNotNull() {
            addCriterion("predict_income is not null");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeEqualTo(String value) {
            addCriterion("predict_income =", value, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeNotEqualTo(String value) {
            addCriterion("predict_income <>", value, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeGreaterThan(String value) {
            addCriterion("predict_income >", value, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("predict_income >=", value, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeLessThan(String value) {
            addCriterion("predict_income <", value, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeLessThanOrEqualTo(String value) {
            addCriterion("predict_income <=", value, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeLike(String value) {
            addCriterion("predict_income like", value, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeNotLike(String value) {
            addCriterion("predict_income not like", value, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeIn(List<String> values) {
            addCriterion("predict_income in", values, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeNotIn(List<String> values) {
            addCriterion("predict_income not in", values, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeBetween(String value1, String value2) {
            addCriterion("predict_income between", value1, value2, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andPredictIncomeNotBetween(String value1, String value2) {
            addCriterion("predict_income not between", value1, value2, "predictIncome");
            return (Criteria) this;
        }

        public Criteria andTenderDateIsNull() {
            addCriterion("tender_date is null");
            return (Criteria) this;
        }

        public Criteria andTenderDateIsNotNull() {
            addCriterion("tender_date is not null");
            return (Criteria) this;
        }

        public Criteria andTenderDateEqualTo(Date value) {
            addCriterion("tender_date =", value, "tenderDate");
            return (Criteria) this;
        }

        public Criteria andTenderDateNotEqualTo(Date value) {
            addCriterion("tender_date <>", value, "tenderDate");
            return (Criteria) this;
        }

        public Criteria andTenderDateGreaterThan(Date value) {
            addCriterion("tender_date >", value, "tenderDate");
            return (Criteria) this;
        }

        public Criteria andTenderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tender_date >=", value, "tenderDate");
            return (Criteria) this;
        }

        public Criteria andTenderDateLessThan(Date value) {
            addCriterion("tender_date <", value, "tenderDate");
            return (Criteria) this;
        }

        public Criteria andTenderDateLessThanOrEqualTo(Date value) {
            addCriterion("tender_date <=", value, "tenderDate");
            return (Criteria) this;
        }

        public Criteria andTenderDateIn(List<Date> values) {
            addCriterion("tender_date in", values, "tenderDate");
            return (Criteria) this;
        }

        public Criteria andTenderDateNotIn(List<Date> values) {
            addCriterion("tender_date not in", values, "tenderDate");
            return (Criteria) this;
        }

        public Criteria andTenderDateBetween(Date value1, Date value2) {
            addCriterion("tender_date between", value1, value2, "tenderDate");
            return (Criteria) this;
        }

        public Criteria andTenderDateNotBetween(Date value1, Date value2) {
            addCriterion("tender_date not between", value1, value2, "tenderDate");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andReceivableIsNull() {
            addCriterion("receivable is null");
            return (Criteria) this;
        }

        public Criteria andReceivableIsNotNull() {
            addCriterion("receivable is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableEqualTo(String value) {
            addCriterion("receivable =", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotEqualTo(String value) {
            addCriterion("receivable <>", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableGreaterThan(String value) {
            addCriterion("receivable >", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableGreaterThanOrEqualTo(String value) {
            addCriterion("receivable >=", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableLessThan(String value) {
            addCriterion("receivable <", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableLessThanOrEqualTo(String value) {
            addCriterion("receivable <=", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableLike(String value) {
            addCriterion("receivable like", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotLike(String value) {
            addCriterion("receivable not like", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableIn(List<String> values) {
            addCriterion("receivable in", values, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotIn(List<String> values) {
            addCriterion("receivable not in", values, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableBetween(String value1, String value2) {
            addCriterion("receivable between", value1, value2, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotBetween(String value1, String value2) {
            addCriterion("receivable not between", value1, value2, "receivable");
            return (Criteria) this;
        }

        public Criteria andIsStateIsNull() {
            addCriterion("is_state is null");
            return (Criteria) this;
        }

        public Criteria andIsStateIsNotNull() {
            addCriterion("is_state is not null");
            return (Criteria) this;
        }

        public Criteria andIsStateEqualTo(Integer value) {
            addCriterion("is_state =", value, "isState");
            return (Criteria) this;
        }

        public Criteria andIsStateNotEqualTo(Integer value) {
            addCriterion("is_state <>", value, "isState");
            return (Criteria) this;
        }

        public Criteria andIsStateGreaterThan(Integer value) {
            addCriterion("is_state >", value, "isState");
            return (Criteria) this;
        }

        public Criteria andIsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_state >=", value, "isState");
            return (Criteria) this;
        }

        public Criteria andIsStateLessThan(Integer value) {
            addCriterion("is_state <", value, "isState");
            return (Criteria) this;
        }

        public Criteria andIsStateLessThanOrEqualTo(Integer value) {
            addCriterion("is_state <=", value, "isState");
            return (Criteria) this;
        }

        public Criteria andIsStateIn(List<Integer> values) {
            addCriterion("is_state in", values, "isState");
            return (Criteria) this;
        }

        public Criteria andIsStateNotIn(List<Integer> values) {
            addCriterion("is_state not in", values, "isState");
            return (Criteria) this;
        }

        public Criteria andIsStateBetween(Integer value1, Integer value2) {
            addCriterion("is_state between", value1, value2, "isState");
            return (Criteria) this;
        }

        public Criteria andIsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("is_state not between", value1, value2, "isState");
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