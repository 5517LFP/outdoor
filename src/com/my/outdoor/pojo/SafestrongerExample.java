package com.my.outdoor.pojo;

import java.util.ArrayList;
import java.util.List;

public class SafestrongerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SafestrongerExample() {
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

        public Criteria andSsidIsNull() {
            addCriterion("ssid is null");
            return (Criteria) this;
        }

        public Criteria andSsidIsNotNull() {
            addCriterion("ssid is not null");
            return (Criteria) this;
        }

        public Criteria andSsidEqualTo(Integer value) {
            addCriterion("ssid =", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotEqualTo(Integer value) {
            addCriterion("ssid <>", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThan(Integer value) {
            addCriterion("ssid >", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssid >=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThan(Integer value) {
            addCriterion("ssid <", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThanOrEqualTo(Integer value) {
            addCriterion("ssid <=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidIn(List<Integer> values) {
            addCriterion("ssid in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotIn(List<Integer> values) {
            addCriterion("ssid not in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidBetween(Integer value1, Integer value2) {
            addCriterion("ssid between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotBetween(Integer value1, Integer value2) {
            addCriterion("ssid not between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsnameIsNull() {
            addCriterion("ssname is null");
            return (Criteria) this;
        }

        public Criteria andSsnameIsNotNull() {
            addCriterion("ssname is not null");
            return (Criteria) this;
        }

        public Criteria andSsnameEqualTo(String value) {
            addCriterion("ssname =", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotEqualTo(String value) {
            addCriterion("ssname <>", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameGreaterThan(String value) {
            addCriterion("ssname >", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameGreaterThanOrEqualTo(String value) {
            addCriterion("ssname >=", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameLessThan(String value) {
            addCriterion("ssname <", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameLessThanOrEqualTo(String value) {
            addCriterion("ssname <=", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameLike(String value) {
            addCriterion("ssname like", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotLike(String value) {
            addCriterion("ssname not like", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameIn(List<String> values) {
            addCriterion("ssname in", values, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotIn(List<String> values) {
            addCriterion("ssname not in", values, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameBetween(String value1, String value2) {
            addCriterion("ssname between", value1, value2, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotBetween(String value1, String value2) {
            addCriterion("ssname not between", value1, value2, "ssname");
            return (Criteria) this;
        }

        public Criteria andSslvIsNull() {
            addCriterion("sslv is null");
            return (Criteria) this;
        }

        public Criteria andSslvIsNotNull() {
            addCriterion("sslv is not null");
            return (Criteria) this;
        }

        public Criteria andSslvEqualTo(String value) {
            addCriterion("sslv =", value, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvNotEqualTo(String value) {
            addCriterion("sslv <>", value, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvGreaterThan(String value) {
            addCriterion("sslv >", value, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvGreaterThanOrEqualTo(String value) {
            addCriterion("sslv >=", value, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvLessThan(String value) {
            addCriterion("sslv <", value, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvLessThanOrEqualTo(String value) {
            addCriterion("sslv <=", value, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvLike(String value) {
            addCriterion("sslv like", value, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvNotLike(String value) {
            addCriterion("sslv not like", value, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvIn(List<String> values) {
            addCriterion("sslv in", values, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvNotIn(List<String> values) {
            addCriterion("sslv not in", values, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvBetween(String value1, String value2) {
            addCriterion("sslv between", value1, value2, "sslv");
            return (Criteria) this;
        }

        public Criteria andSslvNotBetween(String value1, String value2) {
            addCriterion("sslv not between", value1, value2, "sslv");
            return (Criteria) this;
        }

        public Criteria andSscontentIsNull() {
            addCriterion("sscontent is null");
            return (Criteria) this;
        }

        public Criteria andSscontentIsNotNull() {
            addCriterion("sscontent is not null");
            return (Criteria) this;
        }

        public Criteria andSscontentEqualTo(String value) {
            addCriterion("sscontent =", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentNotEqualTo(String value) {
            addCriterion("sscontent <>", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentGreaterThan(String value) {
            addCriterion("sscontent >", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentGreaterThanOrEqualTo(String value) {
            addCriterion("sscontent >=", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentLessThan(String value) {
            addCriterion("sscontent <", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentLessThanOrEqualTo(String value) {
            addCriterion("sscontent <=", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentLike(String value) {
            addCriterion("sscontent like", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentNotLike(String value) {
            addCriterion("sscontent not like", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentIn(List<String> values) {
            addCriterion("sscontent in", values, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentNotIn(List<String> values) {
            addCriterion("sscontent not in", values, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentBetween(String value1, String value2) {
            addCriterion("sscontent between", value1, value2, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentNotBetween(String value1, String value2) {
            addCriterion("sscontent not between", value1, value2, "sscontent");
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