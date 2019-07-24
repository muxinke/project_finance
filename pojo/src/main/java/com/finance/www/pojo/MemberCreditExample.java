package com.finance.www.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberCreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberCreditExample() {
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

        public Criteria andNumberSuccessIsNull() {
            addCriterion("number_success is null");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessIsNotNull() {
            addCriterion("number_success is not null");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessEqualTo(Integer value) {
            addCriterion("number_success =", value, "numberSuccess");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessNotEqualTo(Integer value) {
            addCriterion("number_success <>", value, "numberSuccess");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessGreaterThan(Integer value) {
            addCriterion("number_success >", value, "numberSuccess");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_success >=", value, "numberSuccess");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessLessThan(Integer value) {
            addCriterion("number_success <", value, "numberSuccess");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("number_success <=", value, "numberSuccess");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessIn(List<Integer> values) {
            addCriterion("number_success in", values, "numberSuccess");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessNotIn(List<Integer> values) {
            addCriterion("number_success not in", values, "numberSuccess");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessBetween(Integer value1, Integer value2) {
            addCriterion("number_success between", value1, value2, "numberSuccess");
            return (Criteria) this;
        }

        public Criteria andNumberSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("number_success not between", value1, value2, "numberSuccess");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberIsNull() {
            addCriterion("flow_standard_number is null");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberIsNotNull() {
            addCriterion("flow_standard_number is not null");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberEqualTo(Integer value) {
            addCriterion("flow_standard_number =", value, "flowStandardNumber");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberNotEqualTo(Integer value) {
            addCriterion("flow_standard_number <>", value, "flowStandardNumber");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberGreaterThan(Integer value) {
            addCriterion("flow_standard_number >", value, "flowStandardNumber");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_standard_number >=", value, "flowStandardNumber");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberLessThan(Integer value) {
            addCriterion("flow_standard_number <", value, "flowStandardNumber");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberLessThanOrEqualTo(Integer value) {
            addCriterion("flow_standard_number <=", value, "flowStandardNumber");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberIn(List<Integer> values) {
            addCriterion("flow_standard_number in", values, "flowStandardNumber");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberNotIn(List<Integer> values) {
            addCriterion("flow_standard_number not in", values, "flowStandardNumber");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberBetween(Integer value1, Integer value2) {
            addCriterion("flow_standard_number between", value1, value2, "flowStandardNumber");
            return (Criteria) this;
        }

        public Criteria andFlowStandardNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_standard_number not between", value1, value2, "flowStandardNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberIsNull() {
            addCriterion("success_payment_number is null");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberIsNotNull() {
            addCriterion("success_payment_number is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberEqualTo(Integer value) {
            addCriterion("success_payment_number =", value, "successPaymentNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberNotEqualTo(Integer value) {
            addCriterion("success_payment_number <>", value, "successPaymentNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberGreaterThan(Integer value) {
            addCriterion("success_payment_number >", value, "successPaymentNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("success_payment_number >=", value, "successPaymentNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberLessThan(Integer value) {
            addCriterion("success_payment_number <", value, "successPaymentNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("success_payment_number <=", value, "successPaymentNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberIn(List<Integer> values) {
            addCriterion("success_payment_number in", values, "successPaymentNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberNotIn(List<Integer> values) {
            addCriterion("success_payment_number not in", values, "successPaymentNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberBetween(Integer value1, Integer value2) {
            addCriterion("success_payment_number between", value1, value2, "successPaymentNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessPaymentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("success_payment_number not between", value1, value2, "successPaymentNumber");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueIsNull() {
            addCriterion("days_overdue is null");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueIsNotNull() {
            addCriterion("days_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueEqualTo(Integer value) {
            addCriterion("days_overdue =", value, "daysOverdue");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueNotEqualTo(Integer value) {
            addCriterion("days_overdue <>", value, "daysOverdue");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueGreaterThan(Integer value) {
            addCriterion("days_overdue >", value, "daysOverdue");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueGreaterThanOrEqualTo(Integer value) {
            addCriterion("days_overdue >=", value, "daysOverdue");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueLessThan(Integer value) {
            addCriterion("days_overdue <", value, "daysOverdue");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueLessThanOrEqualTo(Integer value) {
            addCriterion("days_overdue <=", value, "daysOverdue");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueIn(List<Integer> values) {
            addCriterion("days_overdue in", values, "daysOverdue");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueNotIn(List<Integer> values) {
            addCriterion("days_overdue not in", values, "daysOverdue");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueBetween(Integer value1, Integer value2) {
            addCriterion("days_overdue between", value1, value2, "daysOverdue");
            return (Criteria) this;
        }

        public Criteria andDaysOverdueNotBetween(Integer value1, Integer value2) {
            addCriterion("days_overdue not between", value1, value2, "daysOverdue");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberIsNull() {
            addCriterion("overdue_bills_number is null");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberIsNotNull() {
            addCriterion("overdue_bills_number is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberEqualTo(Integer value) {
            addCriterion("overdue_bills_number =", value, "overdueBillsNumber");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberNotEqualTo(Integer value) {
            addCriterion("overdue_bills_number <>", value, "overdueBillsNumber");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberGreaterThan(Integer value) {
            addCriterion("overdue_bills_number >", value, "overdueBillsNumber");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_bills_number >=", value, "overdueBillsNumber");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberLessThan(Integer value) {
            addCriterion("overdue_bills_number <", value, "overdueBillsNumber");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_bills_number <=", value, "overdueBillsNumber");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberIn(List<Integer> values) {
            addCriterion("overdue_bills_number in", values, "overdueBillsNumber");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberNotIn(List<Integer> values) {
            addCriterion("overdue_bills_number not in", values, "overdueBillsNumber");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberBetween(Integer value1, Integer value2) {
            addCriterion("overdue_bills_number between", value1, value2, "overdueBillsNumber");
            return (Criteria) this;
        }

        public Criteria andOverdueBillsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_bills_number not between", value1, value2, "overdueBillsNumber");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberIsNull() {
            addCriterion("prepayment_periods_number is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberIsNotNull() {
            addCriterion("prepayment_periods_number is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberEqualTo(Integer value) {
            addCriterion("prepayment_periods_number =", value, "prepaymentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberNotEqualTo(Integer value) {
            addCriterion("prepayment_periods_number <>", value, "prepaymentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberGreaterThan(Integer value) {
            addCriterion("prepayment_periods_number >", value, "prepaymentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("prepayment_periods_number >=", value, "prepaymentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberLessThan(Integer value) {
            addCriterion("prepayment_periods_number <", value, "prepaymentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("prepayment_periods_number <=", value, "prepaymentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberIn(List<Integer> values) {
            addCriterion("prepayment_periods_number in", values, "prepaymentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberNotIn(List<Integer> values) {
            addCriterion("prepayment_periods_number not in", values, "prepaymentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("prepayment_periods_number between", value1, value2, "prepaymentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andPrepaymentPeriodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("prepayment_periods_number not between", value1, value2, "prepaymentPeriodsNumber");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueIsNull() {
            addCriterion("More_30days_overdue is null");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueIsNotNull() {
            addCriterion("More_30days_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueEqualTo(Integer value) {
            addCriterion("More_30days_overdue =", value, "more30daysOverdue");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueNotEqualTo(Integer value) {
            addCriterion("More_30days_overdue <>", value, "more30daysOverdue");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueGreaterThan(Integer value) {
            addCriterion("More_30days_overdue >", value, "more30daysOverdue");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueGreaterThanOrEqualTo(Integer value) {
            addCriterion("More_30days_overdue >=", value, "more30daysOverdue");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueLessThan(Integer value) {
            addCriterion("More_30days_overdue <", value, "more30daysOverdue");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueLessThanOrEqualTo(Integer value) {
            addCriterion("More_30days_overdue <=", value, "more30daysOverdue");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueIn(List<Integer> values) {
            addCriterion("More_30days_overdue in", values, "more30daysOverdue");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueNotIn(List<Integer> values) {
            addCriterion("More_30days_overdue not in", values, "more30daysOverdue");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueBetween(Integer value1, Integer value2) {
            addCriterion("More_30days_overdue between", value1, value2, "more30daysOverdue");
            return (Criteria) this;
        }

        public Criteria andMore30daysOverdueNotBetween(Integer value1, Integer value2) {
            addCriterion("More_30days_overdue not between", value1, value2, "more30daysOverdue");
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