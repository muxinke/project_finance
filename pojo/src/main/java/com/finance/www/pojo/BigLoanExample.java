package com.finance.www.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BigLoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BigLoanExample() {
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andXingzhiIsNull() {
            addCriterion("xingzhi is null");
            return (Criteria) this;
        }

        public Criteria andXingzhiIsNotNull() {
            addCriterion("xingzhi is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhiEqualTo(Integer value) {
            addCriterion("xingzhi =", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiNotEqualTo(Integer value) {
            addCriterion("xingzhi <>", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiGreaterThan(Integer value) {
            addCriterion("xingzhi >", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiGreaterThanOrEqualTo(Integer value) {
            addCriterion("xingzhi >=", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiLessThan(Integer value) {
            addCriterion("xingzhi <", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiLessThanOrEqualTo(Integer value) {
            addCriterion("xingzhi <=", value, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiIn(List<Integer> values) {
            addCriterion("xingzhi in", values, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiNotIn(List<Integer> values) {
            addCriterion("xingzhi not in", values, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiBetween(Integer value1, Integer value2) {
            addCriterion("xingzhi between", value1, value2, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andXingzhiNotBetween(Integer value1, Integer value2) {
            addCriterion("xingzhi not between", value1, value2, "xingzhi");
            return (Criteria) this;
        }

        public Criteria andHowlongIsNull() {
            addCriterion("howlong is null");
            return (Criteria) this;
        }

        public Criteria andHowlongIsNotNull() {
            addCriterion("howlong is not null");
            return (Criteria) this;
        }

        public Criteria andHowlongEqualTo(Integer value) {
            addCriterion("howlong =", value, "howlong");
            return (Criteria) this;
        }

        public Criteria andHowlongNotEqualTo(Integer value) {
            addCriterion("howlong <>", value, "howlong");
            return (Criteria) this;
        }

        public Criteria andHowlongGreaterThan(Integer value) {
            addCriterion("howlong >", value, "howlong");
            return (Criteria) this;
        }

        public Criteria andHowlongGreaterThanOrEqualTo(Integer value) {
            addCriterion("howlong >=", value, "howlong");
            return (Criteria) this;
        }

        public Criteria andHowlongLessThan(Integer value) {
            addCriterion("howlong <", value, "howlong");
            return (Criteria) this;
        }

        public Criteria andHowlongLessThanOrEqualTo(Integer value) {
            addCriterion("howlong <=", value, "howlong");
            return (Criteria) this;
        }

        public Criteria andHowlongIn(List<Integer> values) {
            addCriterion("howlong in", values, "howlong");
            return (Criteria) this;
        }

        public Criteria andHowlongNotIn(List<Integer> values) {
            addCriterion("howlong not in", values, "howlong");
            return (Criteria) this;
        }

        public Criteria andHowlongBetween(Integer value1, Integer value2) {
            addCriterion("howlong between", value1, value2, "howlong");
            return (Criteria) this;
        }

        public Criteria andHowlongNotBetween(Integer value1, Integer value2) {
            addCriterion("howlong not between", value1, value2, "howlong");
            return (Criteria) this;
        }

        public Criteria andPaymethodIsNull() {
            addCriterion("paymethod is null");
            return (Criteria) this;
        }

        public Criteria andPaymethodIsNotNull() {
            addCriterion("paymethod is not null");
            return (Criteria) this;
        }

        public Criteria andPaymethodEqualTo(Integer value) {
            addCriterion("paymethod =", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotEqualTo(Integer value) {
            addCriterion("paymethod <>", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodGreaterThan(Integer value) {
            addCriterion("paymethod >", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymethod >=", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLessThan(Integer value) {
            addCriterion("paymethod <", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLessThanOrEqualTo(Integer value) {
            addCriterion("paymethod <=", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodIn(List<Integer> values) {
            addCriterion("paymethod in", values, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotIn(List<Integer> values) {
            addCriterion("paymethod not in", values, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodBetween(Integer value1, Integer value2) {
            addCriterion("paymethod between", value1, value2, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotBetween(Integer value1, Integer value2) {
            addCriterion("paymethod not between", value1, value2, "paymethod");
            return (Criteria) this;
        }

        public Criteria andIdcardoneIsNull() {
            addCriterion("idcardone is null");
            return (Criteria) this;
        }

        public Criteria andIdcardoneIsNotNull() {
            addCriterion("idcardone is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardoneEqualTo(String value) {
            addCriterion("idcardone =", value, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneNotEqualTo(String value) {
            addCriterion("idcardone <>", value, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneGreaterThan(String value) {
            addCriterion("idcardone >", value, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneGreaterThanOrEqualTo(String value) {
            addCriterion("idcardone >=", value, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneLessThan(String value) {
            addCriterion("idcardone <", value, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneLessThanOrEqualTo(String value) {
            addCriterion("idcardone <=", value, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneLike(String value) {
            addCriterion("idcardone like", value, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneNotLike(String value) {
            addCriterion("idcardone not like", value, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneIn(List<String> values) {
            addCriterion("idcardone in", values, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneNotIn(List<String> values) {
            addCriterion("idcardone not in", values, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneBetween(String value1, String value2) {
            addCriterion("idcardone between", value1, value2, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardoneNotBetween(String value1, String value2) {
            addCriterion("idcardone not between", value1, value2, "idcardone");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoIsNull() {
            addCriterion("idcardtwo is null");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoIsNotNull() {
            addCriterion("idcardtwo is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoEqualTo(String value) {
            addCriterion("idcardtwo =", value, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoNotEqualTo(String value) {
            addCriterion("idcardtwo <>", value, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoGreaterThan(String value) {
            addCriterion("idcardtwo >", value, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoGreaterThanOrEqualTo(String value) {
            addCriterion("idcardtwo >=", value, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoLessThan(String value) {
            addCriterion("idcardtwo <", value, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoLessThanOrEqualTo(String value) {
            addCriterion("idcardtwo <=", value, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoLike(String value) {
            addCriterion("idcardtwo like", value, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoNotLike(String value) {
            addCriterion("idcardtwo not like", value, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoIn(List<String> values) {
            addCriterion("idcardtwo in", values, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoNotIn(List<String> values) {
            addCriterion("idcardtwo not in", values, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoBetween(String value1, String value2) {
            addCriterion("idcardtwo between", value1, value2, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andIdcardtwoNotBetween(String value1, String value2) {
            addCriterion("idcardtwo not between", value1, value2, "idcardtwo");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNull() {
            addCriterion("bankcard is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("bankcard is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(String value) {
            addCriterion("bankcard =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(String value) {
            addCriterion("bankcard <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(String value) {
            addCriterion("bankcard >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(String value) {
            addCriterion("bankcard <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(String value) {
            addCriterion("bankcard <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLike(String value) {
            addCriterion("bankcard like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotLike(String value) {
            addCriterion("bankcard not like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<String> values) {
            addCriterion("bankcard in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<String> values) {
            addCriterion("bankcard not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(String value1, String value2) {
            addCriterion("bankcard between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(String value1, String value2) {
            addCriterion("bankcard not between", value1, value2, "bankcard");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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