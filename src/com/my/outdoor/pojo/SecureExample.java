package com.my.outdoor.pojo;

import java.util.ArrayList;
import java.util.List;

public class SecureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecureExample() {
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

        public Criteria andSeidIsNull() {
            addCriterion("seid is null");
            return (Criteria) this;
        }

        public Criteria andSeidIsNotNull() {
            addCriterion("seid is not null");
            return (Criteria) this;
        }

        public Criteria andSeidEqualTo(Integer value) {
            addCriterion("seid =", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidNotEqualTo(Integer value) {
            addCriterion("seid <>", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidGreaterThan(Integer value) {
            addCriterion("seid >", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seid >=", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidLessThan(Integer value) {
            addCriterion("seid <", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidLessThanOrEqualTo(Integer value) {
            addCriterion("seid <=", value, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidIn(List<Integer> values) {
            addCriterion("seid in", values, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidNotIn(List<Integer> values) {
            addCriterion("seid not in", values, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidBetween(Integer value1, Integer value2) {
            addCriterion("seid between", value1, value2, "seid");
            return (Criteria) this;
        }

        public Criteria andSeidNotBetween(Integer value1, Integer value2) {
            addCriterion("seid not between", value1, value2, "seid");
            return (Criteria) this;
        }

        public Criteria andSenameIsNull() {
            addCriterion("sename is null");
            return (Criteria) this;
        }

        public Criteria andSenameIsNotNull() {
            addCriterion("sename is not null");
            return (Criteria) this;
        }

        public Criteria andSenameEqualTo(String value) {
            addCriterion("sename =", value, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameNotEqualTo(String value) {
            addCriterion("sename <>", value, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameGreaterThan(String value) {
            addCriterion("sename >", value, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameGreaterThanOrEqualTo(String value) {
            addCriterion("sename >=", value, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameLessThan(String value) {
            addCriterion("sename <", value, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameLessThanOrEqualTo(String value) {
            addCriterion("sename <=", value, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameLike(String value) {
            addCriterion("sename like", value, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameNotLike(String value) {
            addCriterion("sename not like", value, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameIn(List<String> values) {
            addCriterion("sename in", values, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameNotIn(List<String> values) {
            addCriterion("sename not in", values, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameBetween(String value1, String value2) {
            addCriterion("sename between", value1, value2, "sename");
            return (Criteria) this;
        }

        public Criteria andSenameNotBetween(String value1, String value2) {
            addCriterion("sename not between", value1, value2, "sename");
            return (Criteria) this;
        }

        public Criteria andSelvIsNull() {
            addCriterion("selv is null");
            return (Criteria) this;
        }

        public Criteria andSelvIsNotNull() {
            addCriterion("selv is not null");
            return (Criteria) this;
        }

        public Criteria andSelvEqualTo(String value) {
            addCriterion("selv =", value, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvNotEqualTo(String value) {
            addCriterion("selv <>", value, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvGreaterThan(String value) {
            addCriterion("selv >", value, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvGreaterThanOrEqualTo(String value) {
            addCriterion("selv >=", value, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvLessThan(String value) {
            addCriterion("selv <", value, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvLessThanOrEqualTo(String value) {
            addCriterion("selv <=", value, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvLike(String value) {
            addCriterion("selv like", value, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvNotLike(String value) {
            addCriterion("selv not like", value, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvIn(List<String> values) {
            addCriterion("selv in", values, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvNotIn(List<String> values) {
            addCriterion("selv not in", values, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvBetween(String value1, String value2) {
            addCriterion("selv between", value1, value2, "selv");
            return (Criteria) this;
        }

        public Criteria andSelvNotBetween(String value1, String value2) {
            addCriterion("selv not between", value1, value2, "selv");
            return (Criteria) this;
        }

        public Criteria andSemoneyIsNull() {
            addCriterion("semoney is null");
            return (Criteria) this;
        }

        public Criteria andSemoneyIsNotNull() {
            addCriterion("semoney is not null");
            return (Criteria) this;
        }

        public Criteria andSemoneyEqualTo(String value) {
            addCriterion("semoney =", value, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyNotEqualTo(String value) {
            addCriterion("semoney <>", value, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyGreaterThan(String value) {
            addCriterion("semoney >", value, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyGreaterThanOrEqualTo(String value) {
            addCriterion("semoney >=", value, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyLessThan(String value) {
            addCriterion("semoney <", value, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyLessThanOrEqualTo(String value) {
            addCriterion("semoney <=", value, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyLike(String value) {
            addCriterion("semoney like", value, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyNotLike(String value) {
            addCriterion("semoney not like", value, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyIn(List<String> values) {
            addCriterion("semoney in", values, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyNotIn(List<String> values) {
            addCriterion("semoney not in", values, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyBetween(String value1, String value2) {
            addCriterion("semoney between", value1, value2, "semoney");
            return (Criteria) this;
        }

        public Criteria andSemoneyNotBetween(String value1, String value2) {
            addCriterion("semoney not between", value1, value2, "semoney");
            return (Criteria) this;
        }

        public Criteria andSecompanyIsNull() {
            addCriterion("secompany is null");
            return (Criteria) this;
        }

        public Criteria andSecompanyIsNotNull() {
            addCriterion("secompany is not null");
            return (Criteria) this;
        }

        public Criteria andSecompanyEqualTo(String value) {
            addCriterion("secompany =", value, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyNotEqualTo(String value) {
            addCriterion("secompany <>", value, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyGreaterThan(String value) {
            addCriterion("secompany >", value, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("secompany >=", value, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyLessThan(String value) {
            addCriterion("secompany <", value, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyLessThanOrEqualTo(String value) {
            addCriterion("secompany <=", value, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyLike(String value) {
            addCriterion("secompany like", value, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyNotLike(String value) {
            addCriterion("secompany not like", value, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyIn(List<String> values) {
            addCriterion("secompany in", values, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyNotIn(List<String> values) {
            addCriterion("secompany not in", values, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyBetween(String value1, String value2) {
            addCriterion("secompany between", value1, value2, "secompany");
            return (Criteria) this;
        }

        public Criteria andSecompanyNotBetween(String value1, String value2) {
            addCriterion("secompany not between", value1, value2, "secompany");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyIsNull() {
            addCriterion("seneedmoney is null");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyIsNotNull() {
            addCriterion("seneedmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyEqualTo(Integer value) {
            addCriterion("seneedmoney =", value, "seneedmoney");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyNotEqualTo(Integer value) {
            addCriterion("seneedmoney <>", value, "seneedmoney");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyGreaterThan(Integer value) {
            addCriterion("seneedmoney >", value, "seneedmoney");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("seneedmoney >=", value, "seneedmoney");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyLessThan(Integer value) {
            addCriterion("seneedmoney <", value, "seneedmoney");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("seneedmoney <=", value, "seneedmoney");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyIn(List<Integer> values) {
            addCriterion("seneedmoney in", values, "seneedmoney");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyNotIn(List<Integer> values) {
            addCriterion("seneedmoney not in", values, "seneedmoney");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyBetween(Integer value1, Integer value2) {
            addCriterion("seneedmoney between", value1, value2, "seneedmoney");
            return (Criteria) this;
        }

        public Criteria andSeneedmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("seneedmoney not between", value1, value2, "seneedmoney");
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