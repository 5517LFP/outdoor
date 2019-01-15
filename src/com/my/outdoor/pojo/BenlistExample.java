package com.my.outdoor.pojo;

import java.util.ArrayList;
import java.util.List;

public class BenlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BenlistExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBphoneIsNull() {
            addCriterion("bphone is null");
            return (Criteria) this;
        }

        public Criteria andBphoneIsNotNull() {
            addCriterion("bphone is not null");
            return (Criteria) this;
        }

        public Criteria andBphoneEqualTo(String value) {
            addCriterion("bphone =", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotEqualTo(String value) {
            addCriterion("bphone <>", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneGreaterThan(String value) {
            addCriterion("bphone >", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneGreaterThanOrEqualTo(String value) {
            addCriterion("bphone >=", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLessThan(String value) {
            addCriterion("bphone <", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLessThanOrEqualTo(String value) {
            addCriterion("bphone <=", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLike(String value) {
            addCriterion("bphone like", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotLike(String value) {
            addCriterion("bphone not like", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneIn(List<String> values) {
            addCriterion("bphone in", values, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotIn(List<String> values) {
            addCriterion("bphone not in", values, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneBetween(String value1, String value2) {
            addCriterion("bphone between", value1, value2, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotBetween(String value1, String value2) {
            addCriterion("bphone not between", value1, value2, "bphone");
            return (Criteria) this;
        }

        public Criteria andBactivenameIsNull() {
            addCriterion("bactivename is null");
            return (Criteria) this;
        }

        public Criteria andBactivenameIsNotNull() {
            addCriterion("bactivename is not null");
            return (Criteria) this;
        }

        public Criteria andBactivenameEqualTo(String value) {
            addCriterion("bactivename =", value, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameNotEqualTo(String value) {
            addCriterion("bactivename <>", value, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameGreaterThan(String value) {
            addCriterion("bactivename >", value, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameGreaterThanOrEqualTo(String value) {
            addCriterion("bactivename >=", value, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameLessThan(String value) {
            addCriterion("bactivename <", value, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameLessThanOrEqualTo(String value) {
            addCriterion("bactivename <=", value, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameLike(String value) {
            addCriterion("bactivename like", value, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameNotLike(String value) {
            addCriterion("bactivename not like", value, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameIn(List<String> values) {
            addCriterion("bactivename in", values, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameNotIn(List<String> values) {
            addCriterion("bactivename not in", values, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameBetween(String value1, String value2) {
            addCriterion("bactivename between", value1, value2, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivenameNotBetween(String value1, String value2) {
            addCriterion("bactivename not between", value1, value2, "bactivename");
            return (Criteria) this;
        }

        public Criteria andBactivetimeIsNull() {
            addCriterion("bactivetime is null");
            return (Criteria) this;
        }

        public Criteria andBactivetimeIsNotNull() {
            addCriterion("bactivetime is not null");
            return (Criteria) this;
        }

        public Criteria andBactivetimeEqualTo(String value) {
            addCriterion("bactivetime =", value, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeNotEqualTo(String value) {
            addCriterion("bactivetime <>", value, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeGreaterThan(String value) {
            addCriterion("bactivetime >", value, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeGreaterThanOrEqualTo(String value) {
            addCriterion("bactivetime >=", value, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeLessThan(String value) {
            addCriterion("bactivetime <", value, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeLessThanOrEqualTo(String value) {
            addCriterion("bactivetime <=", value, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeLike(String value) {
            addCriterion("bactivetime like", value, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeNotLike(String value) {
            addCriterion("bactivetime not like", value, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeIn(List<String> values) {
            addCriterion("bactivetime in", values, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeNotIn(List<String> values) {
            addCriterion("bactivetime not in", values, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeBetween(String value1, String value2) {
            addCriterion("bactivetime between", value1, value2, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBactivetimeNotBetween(String value1, String value2) {
            addCriterion("bactivetime not between", value1, value2, "bactivetime");
            return (Criteria) this;
        }

        public Criteria andBjustIsNull() {
            addCriterion("bjust is null");
            return (Criteria) this;
        }

        public Criteria andBjustIsNotNull() {
            addCriterion("bjust is not null");
            return (Criteria) this;
        }

        public Criteria andBjustEqualTo(String value) {
            addCriterion("bjust =", value, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustNotEqualTo(String value) {
            addCriterion("bjust <>", value, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustGreaterThan(String value) {
            addCriterion("bjust >", value, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustGreaterThanOrEqualTo(String value) {
            addCriterion("bjust >=", value, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustLessThan(String value) {
            addCriterion("bjust <", value, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustLessThanOrEqualTo(String value) {
            addCriterion("bjust <=", value, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustLike(String value) {
            addCriterion("bjust like", value, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustNotLike(String value) {
            addCriterion("bjust not like", value, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustIn(List<String> values) {
            addCriterion("bjust in", values, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustNotIn(List<String> values) {
            addCriterion("bjust not in", values, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustBetween(String value1, String value2) {
            addCriterion("bjust between", value1, value2, "bjust");
            return (Criteria) this;
        }

        public Criteria andBjustNotBetween(String value1, String value2) {
            addCriterion("bjust not between", value1, value2, "bjust");
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