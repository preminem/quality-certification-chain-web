package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class TransactionDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionDoExample() {
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

        public Criteria andBasedataIsNull() {
            addCriterion("basedata is null");
            return (Criteria) this;
        }

        public Criteria andBasedataIsNotNull() {
            addCriterion("basedata is not null");
            return (Criteria) this;
        }

        public Criteria andBasedataEqualTo(String value) {
            addCriterion("basedata =", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataNotEqualTo(String value) {
            addCriterion("basedata <>", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataGreaterThan(String value) {
            addCriterion("basedata >", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataGreaterThanOrEqualTo(String value) {
            addCriterion("basedata >=", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataLessThan(String value) {
            addCriterion("basedata <", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataLessThanOrEqualTo(String value) {
            addCriterion("basedata <=", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataLike(String value) {
            addCriterion("basedata like", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataNotLike(String value) {
            addCriterion("basedata not like", value, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataIn(List<String> values) {
            addCriterion("basedata in", values, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataNotIn(List<String> values) {
            addCriterion("basedata not in", values, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataBetween(String value1, String value2) {
            addCriterion("basedata between", value1, value2, "basedata");
            return (Criteria) this;
        }

        public Criteria andBasedataNotBetween(String value1, String value2) {
            addCriterion("basedata not between", value1, value2, "basedata");
            return (Criteria) this;
        }

        public Criteria andTrancidIsNull() {
            addCriterion("trancid is null");
            return (Criteria) this;
        }

        public Criteria andTrancidIsNotNull() {
            addCriterion("trancid is not null");
            return (Criteria) this;
        }

        public Criteria andTrancidEqualTo(String value) {
            addCriterion("trancid =", value, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidNotEqualTo(String value) {
            addCriterion("trancid <>", value, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidGreaterThan(String value) {
            addCriterion("trancid >", value, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidGreaterThanOrEqualTo(String value) {
            addCriterion("trancid >=", value, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidLessThan(String value) {
            addCriterion("trancid <", value, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidLessThanOrEqualTo(String value) {
            addCriterion("trancid <=", value, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidLike(String value) {
            addCriterion("trancid like", value, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidNotLike(String value) {
            addCriterion("trancid not like", value, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidIn(List<String> values) {
            addCriterion("trancid in", values, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidNotIn(List<String> values) {
            addCriterion("trancid not in", values, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidBetween(String value1, String value2) {
            addCriterion("trancid between", value1, value2, "trancid");
            return (Criteria) this;
        }

        public Criteria andTrancidNotBetween(String value1, String value2) {
            addCriterion("trancid not between", value1, value2, "trancid");
            return (Criteria) this;
        }

        public Criteria andCheckmanIsNull() {
            addCriterion("checkman is null");
            return (Criteria) this;
        }

        public Criteria andCheckmanIsNotNull() {
            addCriterion("checkman is not null");
            return (Criteria) this;
        }

        public Criteria andCheckmanEqualTo(String value) {
            addCriterion("checkman =", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanNotEqualTo(String value) {
            addCriterion("checkman <>", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanGreaterThan(String value) {
            addCriterion("checkman >", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanGreaterThanOrEqualTo(String value) {
            addCriterion("checkman >=", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanLessThan(String value) {
            addCriterion("checkman <", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanLessThanOrEqualTo(String value) {
            addCriterion("checkman <=", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanLike(String value) {
            addCriterion("checkman like", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanNotLike(String value) {
            addCriterion("checkman not like", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanIn(List<String> values) {
            addCriterion("checkman in", values, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanNotIn(List<String> values) {
            addCriterion("checkman not in", values, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanBetween(String value1, String value2) {
            addCriterion("checkman between", value1, value2, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanNotBetween(String value1, String value2) {
            addCriterion("checkman not between", value1, value2, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanidIsNull() {
            addCriterion("checkmanid is null");
            return (Criteria) this;
        }

        public Criteria andCheckmanidIsNotNull() {
            addCriterion("checkmanid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckmanidEqualTo(String value) {
            addCriterion("checkmanid =", value, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidNotEqualTo(String value) {
            addCriterion("checkmanid <>", value, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidGreaterThan(String value) {
            addCriterion("checkmanid >", value, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidGreaterThanOrEqualTo(String value) {
            addCriterion("checkmanid >=", value, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidLessThan(String value) {
            addCriterion("checkmanid <", value, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidLessThanOrEqualTo(String value) {
            addCriterion("checkmanid <=", value, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidLike(String value) {
            addCriterion("checkmanid like", value, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidNotLike(String value) {
            addCriterion("checkmanid not like", value, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidIn(List<String> values) {
            addCriterion("checkmanid in", values, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidNotIn(List<String> values) {
            addCriterion("checkmanid not in", values, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidBetween(String value1, String value2) {
            addCriterion("checkmanid between", value1, value2, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andCheckmanidNotBetween(String value1, String value2) {
            addCriterion("checkmanid not between", value1, value2, "checkmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanIsNull() {
            addCriterion("uploadman is null");
            return (Criteria) this;
        }

        public Criteria andUploadmanIsNotNull() {
            addCriterion("uploadman is not null");
            return (Criteria) this;
        }

        public Criteria andUploadmanEqualTo(String value) {
            addCriterion("uploadman =", value, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanNotEqualTo(String value) {
            addCriterion("uploadman <>", value, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanGreaterThan(String value) {
            addCriterion("uploadman >", value, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanGreaterThanOrEqualTo(String value) {
            addCriterion("uploadman >=", value, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanLessThan(String value) {
            addCriterion("uploadman <", value, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanLessThanOrEqualTo(String value) {
            addCriterion("uploadman <=", value, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanLike(String value) {
            addCriterion("uploadman like", value, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanNotLike(String value) {
            addCriterion("uploadman not like", value, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanIn(List<String> values) {
            addCriterion("uploadman in", values, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanNotIn(List<String> values) {
            addCriterion("uploadman not in", values, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanBetween(String value1, String value2) {
            addCriterion("uploadman between", value1, value2, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanNotBetween(String value1, String value2) {
            addCriterion("uploadman not between", value1, value2, "uploadman");
            return (Criteria) this;
        }

        public Criteria andUploadmanidIsNull() {
            addCriterion("uploadmanid is null");
            return (Criteria) this;
        }

        public Criteria andUploadmanidIsNotNull() {
            addCriterion("uploadmanid is not null");
            return (Criteria) this;
        }

        public Criteria andUploadmanidEqualTo(String value) {
            addCriterion("uploadmanid =", value, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidNotEqualTo(String value) {
            addCriterion("uploadmanid <>", value, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidGreaterThan(String value) {
            addCriterion("uploadmanid >", value, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidGreaterThanOrEqualTo(String value) {
            addCriterion("uploadmanid >=", value, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidLessThan(String value) {
            addCriterion("uploadmanid <", value, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidLessThanOrEqualTo(String value) {
            addCriterion("uploadmanid <=", value, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidLike(String value) {
            addCriterion("uploadmanid like", value, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidNotLike(String value) {
            addCriterion("uploadmanid not like", value, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidIn(List<String> values) {
            addCriterion("uploadmanid in", values, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidNotIn(List<String> values) {
            addCriterion("uploadmanid not in", values, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidBetween(String value1, String value2) {
            addCriterion("uploadmanid between", value1, value2, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andUploadmanidNotBetween(String value1, String value2) {
            addCriterion("uploadmanid not between", value1, value2, "uploadmanid");
            return (Criteria) this;
        }

        public Criteria andTempIsNull() {
            addCriterion("temp is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("temp is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(String value) {
            addCriterion("temp =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(String value) {
            addCriterion("temp <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(String value) {
            addCriterion("temp >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(String value) {
            addCriterion("temp >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(String value) {
            addCriterion("temp <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(String value) {
            addCriterion("temp <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLike(String value) {
            addCriterion("temp like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotLike(String value) {
            addCriterion("temp not like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<String> values) {
            addCriterion("temp in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<String> values) {
            addCriterion("temp not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(String value1, String value2) {
            addCriterion("temp between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(String value1, String value2) {
            addCriterion("temp not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTemp1IsNull() {
            addCriterion("temp1 is null");
            return (Criteria) this;
        }

        public Criteria andTemp1IsNotNull() {
            addCriterion("temp1 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp1EqualTo(String value) {
            addCriterion("temp1 =", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotEqualTo(String value) {
            addCriterion("temp1 <>", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1GreaterThan(String value) {
            addCriterion("temp1 >", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1GreaterThanOrEqualTo(String value) {
            addCriterion("temp1 >=", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1LessThan(String value) {
            addCriterion("temp1 <", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1LessThanOrEqualTo(String value) {
            addCriterion("temp1 <=", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1Like(String value) {
            addCriterion("temp1 like", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotLike(String value) {
            addCriterion("temp1 not like", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1In(List<String> values) {
            addCriterion("temp1 in", values, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotIn(List<String> values) {
            addCriterion("temp1 not in", values, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1Between(String value1, String value2) {
            addCriterion("temp1 between", value1, value2, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotBetween(String value1, String value2) {
            addCriterion("temp1 not between", value1, value2, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp2IsNull() {
            addCriterion("temp2 is null");
            return (Criteria) this;
        }

        public Criteria andTemp2IsNotNull() {
            addCriterion("temp2 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp2EqualTo(String value) {
            addCriterion("temp2 =", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotEqualTo(String value) {
            addCriterion("temp2 <>", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2GreaterThan(String value) {
            addCriterion("temp2 >", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2GreaterThanOrEqualTo(String value) {
            addCriterion("temp2 >=", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2LessThan(String value) {
            addCriterion("temp2 <", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2LessThanOrEqualTo(String value) {
            addCriterion("temp2 <=", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2Like(String value) {
            addCriterion("temp2 like", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotLike(String value) {
            addCriterion("temp2 not like", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2In(List<String> values) {
            addCriterion("temp2 in", values, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotIn(List<String> values) {
            addCriterion("temp2 not in", values, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2Between(String value1, String value2) {
            addCriterion("temp2 between", value1, value2, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotBetween(String value1, String value2) {
            addCriterion("temp2 not between", value1, value2, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp3IsNull() {
            addCriterion("temp3 is null");
            return (Criteria) this;
        }

        public Criteria andTemp3IsNotNull() {
            addCriterion("temp3 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp3EqualTo(String value) {
            addCriterion("temp3 =", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotEqualTo(String value) {
            addCriterion("temp3 <>", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3GreaterThan(String value) {
            addCriterion("temp3 >", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3GreaterThanOrEqualTo(String value) {
            addCriterion("temp3 >=", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3LessThan(String value) {
            addCriterion("temp3 <", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3LessThanOrEqualTo(String value) {
            addCriterion("temp3 <=", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3Like(String value) {
            addCriterion("temp3 like", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotLike(String value) {
            addCriterion("temp3 not like", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3In(List<String> values) {
            addCriterion("temp3 in", values, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotIn(List<String> values) {
            addCriterion("temp3 not in", values, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3Between(String value1, String value2) {
            addCriterion("temp3 between", value1, value2, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotBetween(String value1, String value2) {
            addCriterion("temp3 not between", value1, value2, "temp3");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNull() {
            addCriterion("isChecked is null");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNotNull() {
            addCriterion("isChecked is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckedEqualTo(String value) {
            addCriterion("isChecked =", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotEqualTo(String value) {
            addCriterion("isChecked <>", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThan(String value) {
            addCriterion("isChecked >", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThanOrEqualTo(String value) {
            addCriterion("isChecked >=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThan(String value) {
            addCriterion("isChecked <", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThanOrEqualTo(String value) {
            addCriterion("isChecked <=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLike(String value) {
            addCriterion("isChecked like", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotLike(String value) {
            addCriterion("isChecked not like", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedIn(List<String> values) {
            addCriterion("isChecked in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotIn(List<String> values) {
            addCriterion("isChecked not in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedBetween(String value1, String value2) {
            addCriterion("isChecked between", value1, value2, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotBetween(String value1, String value2) {
            addCriterion("isChecked not between", value1, value2, "ischecked");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andUnittypeIsNull() {
            addCriterion("unittype is null");
            return (Criteria) this;
        }

        public Criteria andUnittypeIsNotNull() {
            addCriterion("unittype is not null");
            return (Criteria) this;
        }

        public Criteria andUnittypeEqualTo(String value) {
            addCriterion("unittype =", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotEqualTo(String value) {
            addCriterion("unittype <>", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeGreaterThan(String value) {
            addCriterion("unittype >", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeGreaterThanOrEqualTo(String value) {
            addCriterion("unittype >=", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLessThan(String value) {
            addCriterion("unittype <", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLessThanOrEqualTo(String value) {
            addCriterion("unittype <=", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLike(String value) {
            addCriterion("unittype like", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotLike(String value) {
            addCriterion("unittype not like", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeIn(List<String> values) {
            addCriterion("unittype in", values, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotIn(List<String> values) {
            addCriterion("unittype not in", values, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeBetween(String value1, String value2) {
            addCriterion("unittype between", value1, value2, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotBetween(String value1, String value2) {
            addCriterion("unittype not between", value1, value2, "unittype");
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