package com.finance.www.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberTrarecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberTrarecordsExample() {
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

        public Criteria andDealFlowSnIsNull() {
            addCriterion("deal_flow_sn is null");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnIsNotNull() {
            addCriterion("deal_flow_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnEqualTo(String value) {
            addCriterion("deal_flow_sn =", value, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnNotEqualTo(String value) {
            addCriterion("deal_flow_sn <>", value, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnGreaterThan(String value) {
            addCriterion("deal_flow_sn >", value, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnGreaterThanOrEqualTo(String value) {
            addCriterion("deal_flow_sn >=", value, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnLessThan(String value) {
            addCriterion("deal_flow_sn <", value, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnLessThanOrEqualTo(String value) {
            addCriterion("deal_flow_sn <=", value, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnLike(String value) {
            addCriterion("deal_flow_sn like", value, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnNotLike(String value) {
            addCriterion("deal_flow_sn not like", value, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnIn(List<String> values) {
            addCriterion("deal_flow_sn in", values, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnNotIn(List<String> values) {
            addCriterion("deal_flow_sn not in", values, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnBetween(String value1, String value2) {
            addCriterion("deal_flow_sn between", value1, value2, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andDealFlowSnNotBetween(String value1, String value2) {
            addCriterion("deal_flow_sn not between", value1, value2, "dealFlowSn");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteIsNull() {
            addCriterion("commerce_note is null");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteIsNotNull() {
            addCriterion("commerce_note is not null");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteEqualTo(String value) {
            addCriterion("commerce_note =", value, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteNotEqualTo(String value) {
            addCriterion("commerce_note <>", value, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteGreaterThan(String value) {
            addCriterion("commerce_note >", value, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteGreaterThanOrEqualTo(String value) {
            addCriterion("commerce_note >=", value, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteLessThan(String value) {
            addCriterion("commerce_note <", value, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteLessThanOrEqualTo(String value) {
            addCriterion("commerce_note <=", value, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteLike(String value) {
            addCriterion("commerce_note like", value, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteNotLike(String value) {
            addCriterion("commerce_note not like", value, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteIn(List<String> values) {
            addCriterion("commerce_note in", values, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteNotIn(List<String> values) {
            addCriterion("commerce_note not in", values, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteBetween(String value1, String value2) {
            addCriterion("commerce_note between", value1, value2, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCommerceNoteNotBetween(String value1, String value2) {
            addCriterion("commerce_note not between", value1, value2, "commerceNote");
            return (Criteria) this;
        }

        public Criteria andCounterpartyIsNull() {
            addCriterion("counterparty is null");
            return (Criteria) this;
        }

        public Criteria andCounterpartyIsNotNull() {
            addCriterion("counterparty is not null");
            return (Criteria) this;
        }

        public Criteria andCounterpartyEqualTo(String value) {
            addCriterion("counterparty =", value, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyNotEqualTo(String value) {
            addCriterion("counterparty <>", value, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyGreaterThan(String value) {
            addCriterion("counterparty >", value, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyGreaterThanOrEqualTo(String value) {
            addCriterion("counterparty >=", value, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyLessThan(String value) {
            addCriterion("counterparty <", value, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyLessThanOrEqualTo(String value) {
            addCriterion("counterparty <=", value, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyLike(String value) {
            addCriterion("counterparty like", value, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyNotLike(String value) {
            addCriterion("counterparty not like", value, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyIn(List<String> values) {
            addCriterion("counterparty in", values, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyNotIn(List<String> values) {
            addCriterion("counterparty not in", values, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyBetween(String value1, String value2) {
            addCriterion("counterparty between", value1, value2, "counterparty");
            return (Criteria) this;
        }

        public Criteria andCounterpartyNotBetween(String value1, String value2) {
            addCriterion("counterparty not between", value1, value2, "counterparty");
            return (Criteria) this;
        }

        public Criteria andOperationAmountIsNull() {
            addCriterion("operation_amount is null");
            return (Criteria) this;
        }

        public Criteria andOperationAmountIsNotNull() {
            addCriterion("operation_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOperationAmountEqualTo(String value) {
            addCriterion("operation_amount =", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountNotEqualTo(String value) {
            addCriterion("operation_amount <>", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountGreaterThan(String value) {
            addCriterion("operation_amount >", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountGreaterThanOrEqualTo(String value) {
            addCriterion("operation_amount >=", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountLessThan(String value) {
            addCriterion("operation_amount <", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountLessThanOrEqualTo(String value) {
            addCriterion("operation_amount <=", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountLike(String value) {
            addCriterion("operation_amount like", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountNotLike(String value) {
            addCriterion("operation_amount not like", value, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountIn(List<String> values) {
            addCriterion("operation_amount in", values, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountNotIn(List<String> values) {
            addCriterion("operation_amount not in", values, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountBetween(String value1, String value2) {
            addCriterion("operation_amount between", value1, value2, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andOperationAmountNotBetween(String value1, String value2) {
            addCriterion("operation_amount not between", value1, value2, "operationAmount");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
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