package com.finance.www.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberInfoExample() {
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

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andDateBirthIsNull() {
            addCriterion("date_birth is null");
            return (Criteria) this;
        }

        public Criteria andDateBirthIsNotNull() {
            addCriterion("date_birth is not null");
            return (Criteria) this;
        }

        public Criteria andDateBirthEqualTo(Date value) {
            addCriterion("date_birth =", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthNotEqualTo(Date value) {
            addCriterion("date_birth <>", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthGreaterThan(Date value) {
            addCriterion("date_birth >", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("date_birth >=", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthLessThan(Date value) {
            addCriterion("date_birth <", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthLessThanOrEqualTo(Date value) {
            addCriterion("date_birth <=", value, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthIn(List<Date> values) {
            addCriterion("date_birth in", values, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthNotIn(List<Date> values) {
            addCriterion("date_birth not in", values, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthBetween(Date value1, Date value2) {
            addCriterion("date_birth between", value1, value2, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andDateBirthNotBetween(Date value1, Date value2) {
            addCriterion("date_birth not between", value1, value2, "dateBirth");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingIsNull() {
            addCriterion("record_schooling is null");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingIsNotNull() {
            addCriterion("record_schooling is not null");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingEqualTo(String value) {
            addCriterion("record_schooling =", value, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingNotEqualTo(String value) {
            addCriterion("record_schooling <>", value, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingGreaterThan(String value) {
            addCriterion("record_schooling >", value, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingGreaterThanOrEqualTo(String value) {
            addCriterion("record_schooling >=", value, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingLessThan(String value) {
            addCriterion("record_schooling <", value, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingLessThanOrEqualTo(String value) {
            addCriterion("record_schooling <=", value, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingLike(String value) {
            addCriterion("record_schooling like", value, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingNotLike(String value) {
            addCriterion("record_schooling not like", value, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingIn(List<String> values) {
            addCriterion("record_schooling in", values, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingNotIn(List<String> values) {
            addCriterion("record_schooling not in", values, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingBetween(String value1, String value2) {
            addCriterion("record_schooling between", value1, value2, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andRecordSchoolingNotBetween(String value1, String value2) {
            addCriterion("record_schooling not between", value1, value2, "recordSchooling");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIsNull() {
            addCriterion("marriage_status is null");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIsNotNull() {
            addCriterion("marriage_status is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusEqualTo(Integer value) {
            addCriterion("marriage_status =", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotEqualTo(Integer value) {
            addCriterion("marriage_status <>", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusGreaterThan(Integer value) {
            addCriterion("marriage_status >", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("marriage_status >=", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLessThan(Integer value) {
            addCriterion("marriage_status <", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusLessThanOrEqualTo(Integer value) {
            addCriterion("marriage_status <=", value, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusIn(List<Integer> values) {
            addCriterion("marriage_status in", values, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotIn(List<Integer> values) {
            addCriterion("marriage_status not in", values, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusBetween(Integer value1, Integer value2) {
            addCriterion("marriage_status between", value1, value2, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andMarriageStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("marriage_status not between", value1, value2, "marriageStatus");
            return (Criteria) this;
        }

        public Criteria andHousingInfoIsNull() {
            addCriterion("housing_info is null");
            return (Criteria) this;
        }

        public Criteria andHousingInfoIsNotNull() {
            addCriterion("housing_info is not null");
            return (Criteria) this;
        }

        public Criteria andHousingInfoEqualTo(String value) {
            addCriterion("housing_info =", value, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoNotEqualTo(String value) {
            addCriterion("housing_info <>", value, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoGreaterThan(String value) {
            addCriterion("housing_info >", value, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoGreaterThanOrEqualTo(String value) {
            addCriterion("housing_info >=", value, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoLessThan(String value) {
            addCriterion("housing_info <", value, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoLessThanOrEqualTo(String value) {
            addCriterion("housing_info <=", value, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoLike(String value) {
            addCriterion("housing_info like", value, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoNotLike(String value) {
            addCriterion("housing_info not like", value, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoIn(List<String> values) {
            addCriterion("housing_info in", values, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoNotIn(List<String> values) {
            addCriterion("housing_info not in", values, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoBetween(String value1, String value2) {
            addCriterion("housing_info between", value1, value2, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andHousingInfoNotBetween(String value1, String value2) {
            addCriterion("housing_info not between", value1, value2, "housingInfo");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeIsNull() {
            addCriterion("monthly_income is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeIsNotNull() {
            addCriterion("monthly_income is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeEqualTo(String value) {
            addCriterion("monthly_income =", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeNotEqualTo(String value) {
            addCriterion("monthly_income <>", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeGreaterThan(String value) {
            addCriterion("monthly_income >", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("monthly_income >=", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeLessThan(String value) {
            addCriterion("monthly_income <", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeLessThanOrEqualTo(String value) {
            addCriterion("monthly_income <=", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeLike(String value) {
            addCriterion("monthly_income like", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeNotLike(String value) {
            addCriterion("monthly_income not like", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeIn(List<String> values) {
            addCriterion("monthly_income in", values, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeNotIn(List<String> values) {
            addCriterion("monthly_income not in", values, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeBetween(String value1, String value2) {
            addCriterion("monthly_income between", value1, value2, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeNotBetween(String value1, String value2) {
            addCriterion("monthly_income not between", value1, value2, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordIsNull() {
            addCriterion("is_transaction_password is null");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordIsNotNull() {
            addCriterion("is_transaction_password is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordEqualTo(Integer value) {
            addCriterion("is_transaction_password =", value, "isTransactionPassword");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordNotEqualTo(Integer value) {
            addCriterion("is_transaction_password <>", value, "isTransactionPassword");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordGreaterThan(Integer value) {
            addCriterion("is_transaction_password >", value, "isTransactionPassword");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_transaction_password >=", value, "isTransactionPassword");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordLessThan(Integer value) {
            addCriterion("is_transaction_password <", value, "isTransactionPassword");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordLessThanOrEqualTo(Integer value) {
            addCriterion("is_transaction_password <=", value, "isTransactionPassword");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordIn(List<Integer> values) {
            addCriterion("is_transaction_password in", values, "isTransactionPassword");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordNotIn(List<Integer> values) {
            addCriterion("is_transaction_password not in", values, "isTransactionPassword");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordBetween(Integer value1, Integer value2) {
            addCriterion("is_transaction_password between", value1, value2, "isTransactionPassword");
            return (Criteria) this;
        }

        public Criteria andIsTransactionPasswordNotBetween(Integer value1, Integer value2) {
            addCriterion("is_transaction_password not between", value1, value2, "isTransactionPassword");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordIsNull() {
            addCriterion("is_login_password is null");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordIsNotNull() {
            addCriterion("is_login_password is not null");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordEqualTo(Integer value) {
            addCriterion("is_login_password =", value, "isLoginPassword");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordNotEqualTo(Integer value) {
            addCriterion("is_login_password <>", value, "isLoginPassword");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordGreaterThan(Integer value) {
            addCriterion("is_login_password >", value, "isLoginPassword");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_login_password >=", value, "isLoginPassword");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordLessThan(Integer value) {
            addCriterion("is_login_password <", value, "isLoginPassword");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordLessThanOrEqualTo(Integer value) {
            addCriterion("is_login_password <=", value, "isLoginPassword");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordIn(List<Integer> values) {
            addCriterion("is_login_password in", values, "isLoginPassword");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordNotIn(List<Integer> values) {
            addCriterion("is_login_password not in", values, "isLoginPassword");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordBetween(Integer value1, Integer value2) {
            addCriterion("is_login_password between", value1, value2, "isLoginPassword");
            return (Criteria) this;
        }

        public Criteria andIsLoginPasswordNotBetween(Integer value1, Integer value2) {
            addCriterion("is_login_password not between", value1, value2, "isLoginPassword");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardIsNull() {
            addCriterion("is_tied_card is null");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardIsNotNull() {
            addCriterion("is_tied_card is not null");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardEqualTo(Integer value) {
            addCriterion("is_tied_card =", value, "isTiedCard");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardNotEqualTo(Integer value) {
            addCriterion("is_tied_card <>", value, "isTiedCard");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardGreaterThan(Integer value) {
            addCriterion("is_tied_card >", value, "isTiedCard");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_tied_card >=", value, "isTiedCard");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardLessThan(Integer value) {
            addCriterion("is_tied_card <", value, "isTiedCard");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardLessThanOrEqualTo(Integer value) {
            addCriterion("is_tied_card <=", value, "isTiedCard");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardIn(List<Integer> values) {
            addCriterion("is_tied_card in", values, "isTiedCard");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardNotIn(List<Integer> values) {
            addCriterion("is_tied_card not in", values, "isTiedCard");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardBetween(Integer value1, Integer value2) {
            addCriterion("is_tied_card between", value1, value2, "isTiedCard");
            return (Criteria) this;
        }

        public Criteria andIsTiedCardNotBetween(Integer value1, Integer value2) {
            addCriterion("is_tied_card not between", value1, value2, "isTiedCard");
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