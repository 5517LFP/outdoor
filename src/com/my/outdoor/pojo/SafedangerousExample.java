package com.my.outdoor.pojo;

import java.util.ArrayList;
import java.util.List;

public class SafedangerousExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SafedangerousExample() {
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

        public Criteria andSdidIsNull() {
            addCriterion("sdid is null");
            return (Criteria) this;
        }

        public Criteria andSdidIsNotNull() {
            addCriterion("sdid is not null");
            return (Criteria) this;
        }

        public Criteria andSdidEqualTo(Integer value) {
            addCriterion("sdid =", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotEqualTo(Integer value) {
            addCriterion("sdid <>", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidGreaterThan(Integer value) {
            addCriterion("sdid >", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdid >=", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidLessThan(Integer value) {
            addCriterion("sdid <", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidLessThanOrEqualTo(Integer value) {
            addCriterion("sdid <=", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidIn(List<Integer> values) {
            addCriterion("sdid in", values, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotIn(List<Integer> values) {
            addCriterion("sdid not in", values, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidBetween(Integer value1, Integer value2) {
            addCriterion("sdid between", value1, value2, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotBetween(Integer value1, Integer value2) {
            addCriterion("sdid not between", value1, value2, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdnameIsNull() {
            addCriterion("sdname is null");
            return (Criteria) this;
        }

        public Criteria andSdnameIsNotNull() {
            addCriterion("sdname is not null");
            return (Criteria) this;
        }

        public Criteria andSdnameEqualTo(String value) {
            addCriterion("sdname =", value, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameNotEqualTo(String value) {
            addCriterion("sdname <>", value, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameGreaterThan(String value) {
            addCriterion("sdname >", value, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameGreaterThanOrEqualTo(String value) {
            addCriterion("sdname >=", value, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameLessThan(String value) {
            addCriterion("sdname <", value, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameLessThanOrEqualTo(String value) {
            addCriterion("sdname <=", value, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameLike(String value) {
            addCriterion("sdname like", value, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameNotLike(String value) {
            addCriterion("sdname not like", value, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameIn(List<String> values) {
            addCriterion("sdname in", values, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameNotIn(List<String> values) {
            addCriterion("sdname not in", values, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameBetween(String value1, String value2) {
            addCriterion("sdname between", value1, value2, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdnameNotBetween(String value1, String value2) {
            addCriterion("sdname not between", value1, value2, "sdname");
            return (Criteria) this;
        }

        public Criteria andSdlvIsNull() {
            addCriterion("sdlv is null");
            return (Criteria) this;
        }

        public Criteria andSdlvIsNotNull() {
            addCriterion("sdlv is not null");
            return (Criteria) this;
        }

        public Criteria andSdlvEqualTo(Integer value) {
            addCriterion("sdlv =", value, "sdlv");
            return (Criteria) this;
        }

        public Criteria andSdlvNotEqualTo(Integer value) {
            addCriterion("sdlv <>", value, "sdlv");
            return (Criteria) this;
        }

        public Criteria andSdlvGreaterThan(Integer value) {
            addCriterion("sdlv >", value, "sdlv");
            return (Criteria) this;
        }

        public Criteria andSdlvGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdlv >=", value, "sdlv");
            return (Criteria) this;
        }

        public Criteria andSdlvLessThan(Integer value) {
            addCriterion("sdlv <", value, "sdlv");
            return (Criteria) this;
        }

        public Criteria andSdlvLessThanOrEqualTo(Integer value) {
            addCriterion("sdlv <=", value, "sdlv");
            return (Criteria) this;
        }

        public Criteria andSdlvIn(List<Integer> values) {
            addCriterion("sdlv in", values, "sdlv");
            return (Criteria) this;
        }

        public Criteria andSdlvNotIn(List<Integer> values) {
            addCriterion("sdlv not in", values, "sdlv");
            return (Criteria) this;
        }

        public Criteria andSdlvBetween(Integer value1, Integer value2) {
            addCriterion("sdlv between", value1, value2, "sdlv");
            return (Criteria) this;
        }

        public Criteria andSdlvNotBetween(Integer value1, Integer value2) {
            addCriterion("sdlv not between", value1, value2, "sdlv");
            return (Criteria) this;
        }

        public Criteria andSdcontentIsNull() {
            addCriterion("sdcontent is null");
            return (Criteria) this;
        }

        public Criteria andSdcontentIsNotNull() {
            addCriterion("sdcontent is not null");
            return (Criteria) this;
        }

        public Criteria andSdcontentEqualTo(String value) {
            addCriterion("sdcontent =", value, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentNotEqualTo(String value) {
            addCriterion("sdcontent <>", value, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentGreaterThan(String value) {
            addCriterion("sdcontent >", value, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentGreaterThanOrEqualTo(String value) {
            addCriterion("sdcontent >=", value, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentLessThan(String value) {
            addCriterion("sdcontent <", value, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentLessThanOrEqualTo(String value) {
            addCriterion("sdcontent <=", value, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentLike(String value) {
            addCriterion("sdcontent like", value, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentNotLike(String value) {
            addCriterion("sdcontent not like", value, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentIn(List<String> values) {
            addCriterion("sdcontent in", values, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentNotIn(List<String> values) {
            addCriterion("sdcontent not in", values, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentBetween(String value1, String value2) {
            addCriterion("sdcontent between", value1, value2, "sdcontent");
            return (Criteria) this;
        }

        public Criteria andSdcontentNotBetween(String value1, String value2) {
            addCriterion("sdcontent not between", value1, value2, "sdcontent");
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