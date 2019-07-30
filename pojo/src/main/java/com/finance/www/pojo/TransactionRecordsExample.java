package com.finance.www.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionRecordsExample() {
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

        public Criteria andJytypeIsNull() {
            addCriterion("jytype is null");
            return (Criteria) this;
        }

        public Criteria andJytypeIsNotNull() {
            addCriterion("jytype is not null");
            return (Criteria) this;
        }

        public Criteria andJytypeEqualTo(Integer value) {
            addCriterion("jytype =", value, "jytype");
            return (Criteria) this;
        }

        public Criteria andJytypeNotEqualTo(Integer value) {
            addCriterion("jytype <>", value, "jytype");
            return (Criteria) this;
        }

        public Criteria andJytypeGreaterThan(Integer value) {
            addCriterion("jytype >", value, "jytype");
            return (Criteria) this;
        }

        public Criteria andJytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("jytype >=", value, "jytype");
            return (Criteria) this;
        }

        public Criteria andJytypeLessThan(Integer value) {
            addCriterion("jytype <", value, "jytype");
            return (Criteria) this;
        }

        public Criteria andJytypeLessThanOrEqualTo(Integer value) {
            addCriterion("jytype <=", value, "jytype");
            return (Criteria) this;
        }

        public Criteria andJytypeIn(List<Integer> values) {
            addCriterion("jytype in", values, "jytype");
            return (Criteria) this;
        }

        public Criteria andJytypeNotIn(List<Integer> values) {
            addCriterion("jytype not in", values, "jytype");
            return (Criteria) this;
        }

        public Criteria andJytypeBetween(Integer value1, Integer value2) {
            addCriterion("jytype between", value1, value2, "jytype");
            return (Criteria) this;
        }

        public Criteria andJytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("jytype not between", value1, value2, "jytype");
            return (Criteria) this;
        }

        public Criteria andJineIsNull() {
            addCriterion("jine is null");
            return (Criteria) this;
        }

        public Criteria andJineIsNotNull() {
            addCriterion("jine is not null");
            return (Criteria) this;
        }

        public Criteria andJineEqualTo(String value) {
            addCriterion("jine =", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineNotEqualTo(String value) {
            addCriterion("jine <>", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineGreaterThan(String value) {
            addCriterion("jine >", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineGreaterThanOrEqualTo(String value) {
            addCriterion("jine >=", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineLessThan(String value) {
            addCriterion("jine <", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineLessThanOrEqualTo(String value) {
            addCriterion("jine <=", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineLike(String value) {
            addCriterion("jine like", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineNotLike(String value) {
            addCriterion("jine not like", value, "jine");
            return (Criteria) this;
        }

        public Criteria andJineIn(List<String> values) {
            addCriterion("jine in", values, "jine");
            return (Criteria) this;
        }

        public Criteria andJineNotIn(List<String> values) {
            addCriterion("jine not in", values, "jine");
            return (Criteria) this;
        }

        public Criteria andJineBetween(String value1, String value2) {
            addCriterion("jine between", value1, value2, "jine");
            return (Criteria) this;
        }

        public Criteria andJineNotBetween(String value1, String value2) {
            addCriterion("jine not between", value1, value2, "jine");
            return (Criteria) this;
        }

        public Criteria andDealingPartyIsNull() {
            addCriterion("dealing_party is null");
            return (Criteria) this;
        }

        public Criteria andDealingPartyIsNotNull() {
            addCriterion("dealing_party is not null");
            return (Criteria) this;
        }

        public Criteria andDealingPartyEqualTo(String value) {
            addCriterion("dealing_party =", value, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyNotEqualTo(String value) {
            addCriterion("dealing_party <>", value, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyGreaterThan(String value) {
            addCriterion("dealing_party >", value, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyGreaterThanOrEqualTo(String value) {
            addCriterion("dealing_party >=", value, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyLessThan(String value) {
            addCriterion("dealing_party <", value, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyLessThanOrEqualTo(String value) {
            addCriterion("dealing_party <=", value, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyLike(String value) {
            addCriterion("dealing_party like", value, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyNotLike(String value) {
            addCriterion("dealing_party not like", value, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyIn(List<String> values) {
            addCriterion("dealing_party in", values, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyNotIn(List<String> values) {
            addCriterion("dealing_party not in", values, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyBetween(String value1, String value2) {
            addCriterion("dealing_party between", value1, value2, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andDealingPartyNotBetween(String value1, String value2) {
            addCriterion("dealing_party not between", value1, value2, "dealingParty");
            return (Criteria) this;
        }

        public Criteria andJiluTimeIsNull() {
            addCriterion("jilu_time is null");
            return (Criteria) this;
        }

        public Criteria andJiluTimeIsNotNull() {
            addCriterion("jilu_time is not null");
            return (Criteria) this;
        }

        public Criteria andJiluTimeEqualTo(Date value) {
            addCriterion("jilu_time =", value, "jiluTime");
            return (Criteria) this;
        }

        public Criteria andJiluTimeNotEqualTo(Date value) {
            addCriterion("jilu_time <>", value, "jiluTime");
            return (Criteria) this;
        }

        public Criteria andJiluTimeGreaterThan(Date value) {
            addCriterion("jilu_time >", value, "jiluTime");
            return (Criteria) this;
        }

        public Criteria andJiluTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jilu_time >=", value, "jiluTime");
            return (Criteria) this;
        }

        public Criteria andJiluTimeLessThan(Date value) {
            addCriterion("jilu_time <", value, "jiluTime");
            return (Criteria) this;
        }

        public Criteria andJiluTimeLessThanOrEqualTo(Date value) {
            addCriterion("jilu_time <=", value, "jiluTime");
            return (Criteria) this;
        }

        public Criteria andJiluTimeIn(List<Date> values) {
            addCriterion("jilu_time in", values, "jiluTime");
            return (Criteria) this;
        }

        public Criteria andJiluTimeNotIn(List<Date> values) {
            addCriterion("jilu_time not in", values, "jiluTime");
            return (Criteria) this;
        }

        public Criteria andJiluTimeBetween(Date value1, Date value2) {
            addCriterion("jilu_time between", value1, value2, "jiluTime");
            return (Criteria) this;
        }

        public Criteria andJiluTimeNotBetween(Date value1, Date value2) {
            addCriterion("jilu_time not between", value1, value2, "jiluTime");
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