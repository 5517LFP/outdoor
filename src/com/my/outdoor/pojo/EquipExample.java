package com.my.outdoor.pojo;

import java.util.ArrayList;
import java.util.List;

public class EquipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipExample() {
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

        public Criteria andEqidIsNull() {
            addCriterion("eqid is null");
            return (Criteria) this;
        }

        public Criteria andEqidIsNotNull() {
            addCriterion("eqid is not null");
            return (Criteria) this;
        }

        public Criteria andEqidEqualTo(Integer value) {
            addCriterion("eqid =", value, "eqid");
            return (Criteria) this;
        }

        public Criteria andEqidNotEqualTo(Integer value) {
            addCriterion("eqid <>", value, "eqid");
            return (Criteria) this;
        }

        public Criteria andEqidGreaterThan(Integer value) {
            addCriterion("eqid >", value, "eqid");
            return (Criteria) this;
        }

        public Criteria andEqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eqid >=", value, "eqid");
            return (Criteria) this;
        }

        public Criteria andEqidLessThan(Integer value) {
            addCriterion("eqid <", value, "eqid");
            return (Criteria) this;
        }

        public Criteria andEqidLessThanOrEqualTo(Integer value) {
            addCriterion("eqid <=", value, "eqid");
            return (Criteria) this;
        }

        public Criteria andEqidIn(List<Integer> values) {
            addCriterion("eqid in", values, "eqid");
            return (Criteria) this;
        }

        public Criteria andEqidNotIn(List<Integer> values) {
            addCriterion("eqid not in", values, "eqid");
            return (Criteria) this;
        }

        public Criteria andEqidBetween(Integer value1, Integer value2) {
            addCriterion("eqid between", value1, value2, "eqid");
            return (Criteria) this;
        }

        public Criteria andEqidNotBetween(Integer value1, Integer value2) {
            addCriterion("eqid not between", value1, value2, "eqid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueIsNull() {
            addCriterion("onedayvalue is null");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueIsNotNull() {
            addCriterion("onedayvalue is not null");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueEqualTo(String value) {
            addCriterion("onedayvalue =", value, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueNotEqualTo(String value) {
            addCriterion("onedayvalue <>", value, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueGreaterThan(String value) {
            addCriterion("onedayvalue >", value, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueGreaterThanOrEqualTo(String value) {
            addCriterion("onedayvalue >=", value, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueLessThan(String value) {
            addCriterion("onedayvalue <", value, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueLessThanOrEqualTo(String value) {
            addCriterion("onedayvalue <=", value, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueLike(String value) {
            addCriterion("onedayvalue like", value, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueNotLike(String value) {
            addCriterion("onedayvalue not like", value, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueIn(List<String> values) {
            addCriterion("onedayvalue in", values, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueNotIn(List<String> values) {
            addCriterion("onedayvalue not in", values, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueBetween(String value1, String value2) {
            addCriterion("onedayvalue between", value1, value2, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andOnedayvalueNotBetween(String value1, String value2) {
            addCriterion("onedayvalue not between", value1, value2, "onedayvalue");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(String value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(String value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(String value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(String value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(String value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(String value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLike(String value) {
            addCriterion("deposit like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotLike(String value) {
            addCriterion("deposit not like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<String> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<String> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(String value1, String value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(String value1, String value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
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