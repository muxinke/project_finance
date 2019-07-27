package com.finance.www.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordMemberTenderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordMemberTenderExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andInvestmentTimeIsNull() {
            addCriterion("investment_time is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeIsNotNull() {
            addCriterion("investment_time is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeEqualTo(Date value) {
            addCriterion("investment_time =", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeNotEqualTo(Date value) {
            addCriterion("investment_time <>", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeGreaterThan(Date value) {
            addCriterion("investment_time >", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("investment_time >=", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeLessThan(Date value) {
            addCriterion("investment_time <", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeLessThanOrEqualTo(Date value) {
            addCriterion("investment_time <=", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeIn(List<Date> values) {
            addCriterion("investment_time in", values, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeNotIn(List<Date> values) {
            addCriterion("investment_time not in", values, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeBetween(Date value1, Date value2) {
            addCriterion("investment_time between", value1, value2, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeNotBetween(Date value1, Date value2) {
            addCriterion("investment_time not between", value1, value2, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayIsNull() {
            addCriterion("investment_way is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayIsNotNull() {
            addCriterion("investment_way is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayEqualTo(Integer value) {
            addCriterion("investment_way =", value, "investmentWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayNotEqualTo(Integer value) {
            addCriterion("investment_way <>", value, "investmentWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayGreaterThan(Integer value) {
            addCriterion("investment_way >", value, "investmentWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("investment_way >=", value, "investmentWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayLessThan(Integer value) {
            addCriterion("investment_way <", value, "investmentWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayLessThanOrEqualTo(Integer value) {
            addCriterion("investment_way <=", value, "investmentWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayIn(List<Integer> values) {
            addCriterion("investment_way in", values, "investmentWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayNotIn(List<Integer> values) {
            addCriterion("investment_way not in", values, "investmentWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayBetween(Integer value1, Integer value2) {
            addCriterion("investment_way between", value1, value2, "investmentWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentWayNotBetween(Integer value1, Integer value2) {
            addCriterion("investment_way not between", value1, value2, "investmentWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIsNull() {
            addCriterion("investment_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIsNotNull() {
            addCriterion("investment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountEqualTo(String value) {
            addCriterion("investment_amount =", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotEqualTo(String value) {
            addCriterion("investment_amount <>", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountGreaterThan(String value) {
            addCriterion("investment_amount >", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountGreaterThanOrEqualTo(String value) {
            addCriterion("investment_amount >=", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountLessThan(String value) {
            addCriterion("investment_amount <", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountLessThanOrEqualTo(String value) {
            addCriterion("investment_amount <=", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountLike(String value) {
            addCriterion("investment_amount like", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotLike(String value) {
            addCriterion("investment_amount not like", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIn(List<String> values) {
            addCriterion("investment_amount in", values, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotIn(List<String> values) {
            addCriterion("investment_amount not in", values, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountBetween(String value1, String value2) {
            addCriterion("investment_amount between", value1, value2, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotBetween(String value1, String value2) {
            addCriterion("investment_amount not between", value1, value2, "investmentAmount");
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