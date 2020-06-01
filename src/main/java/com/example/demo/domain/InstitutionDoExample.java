package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class InstitutionDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstitutionDoExample() {
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

        public Criteria andInstitutionNumberIsNull() {
            addCriterion("institution_number is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberIsNotNull() {
            addCriterion("institution_number is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberEqualTo(Integer value) {
            addCriterion("institution_number =", value, "institutionNumber");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberNotEqualTo(Integer value) {
            addCriterion("institution_number <>", value, "institutionNumber");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberGreaterThan(Integer value) {
            addCriterion("institution_number >", value, "institutionNumber");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("institution_number >=", value, "institutionNumber");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberLessThan(Integer value) {
            addCriterion("institution_number <", value, "institutionNumber");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberLessThanOrEqualTo(Integer value) {
            addCriterion("institution_number <=", value, "institutionNumber");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberIn(List<Integer> values) {
            addCriterion("institution_number in", values, "institutionNumber");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberNotIn(List<Integer> values) {
            addCriterion("institution_number not in", values, "institutionNumber");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberBetween(Integer value1, Integer value2) {
            addCriterion("institution_number between", value1, value2, "institutionNumber");
            return (Criteria) this;
        }

        public Criteria andInstitutionNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("institution_number not between", value1, value2, "institutionNumber");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIsNull() {
            addCriterion("institution_name is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIsNotNull() {
            addCriterion("institution_name is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameEqualTo(String value) {
            addCriterion("institution_name =", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotEqualTo(String value) {
            addCriterion("institution_name <>", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameGreaterThan(String value) {
            addCriterion("institution_name >", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("institution_name >=", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLessThan(String value) {
            addCriterion("institution_name <", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLessThanOrEqualTo(String value) {
            addCriterion("institution_name <=", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLike(String value) {
            addCriterion("institution_name like", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotLike(String value) {
            addCriterion("institution_name not like", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIn(List<String> values) {
            addCriterion("institution_name in", values, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotIn(List<String> values) {
            addCriterion("institution_name not in", values, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameBetween(String value1, String value2) {
            addCriterion("institution_name between", value1, value2, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotBetween(String value1, String value2) {
            addCriterion("institution_name not between", value1, value2, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeIsNull() {
            addCriterion("institution_type is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeIsNotNull() {
            addCriterion("institution_type is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeEqualTo(String value) {
            addCriterion("institution_type =", value, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeNotEqualTo(String value) {
            addCriterion("institution_type <>", value, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeGreaterThan(String value) {
            addCriterion("institution_type >", value, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("institution_type >=", value, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeLessThan(String value) {
            addCriterion("institution_type <", value, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeLessThanOrEqualTo(String value) {
            addCriterion("institution_type <=", value, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeLike(String value) {
            addCriterion("institution_type like", value, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeNotLike(String value) {
            addCriterion("institution_type not like", value, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeIn(List<String> values) {
            addCriterion("institution_type in", values, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeNotIn(List<String> values) {
            addCriterion("institution_type not in", values, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeBetween(String value1, String value2) {
            addCriterion("institution_type between", value1, value2, "institutionType");
            return (Criteria) this;
        }

        public Criteria andInstitutionTypeNotBetween(String value1, String value2) {
            addCriterion("institution_type not between", value1, value2, "institutionType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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