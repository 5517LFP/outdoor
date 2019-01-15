package com.my.outdoor.pojo;

import java.util.ArrayList;
import java.util.List;

public class MemactlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemactlistExample() {
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

        public Criteria andMaidIsNull() {
            addCriterion("maid is null");
            return (Criteria) this;
        }

        public Criteria andMaidIsNotNull() {
            addCriterion("maid is not null");
            return (Criteria) this;
        }

        public Criteria andMaidEqualTo(Integer value) {
            addCriterion("maid =", value, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidNotEqualTo(Integer value) {
            addCriterion("maid <>", value, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidGreaterThan(Integer value) {
            addCriterion("maid >", value, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("maid >=", value, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidLessThan(Integer value) {
            addCriterion("maid <", value, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidLessThanOrEqualTo(Integer value) {
            addCriterion("maid <=", value, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidIn(List<Integer> values) {
            addCriterion("maid in", values, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidNotIn(List<Integer> values) {
            addCriterion("maid not in", values, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidBetween(Integer value1, Integer value2) {
            addCriterion("maid between", value1, value2, "maid");
            return (Criteria) this;
        }

        public Criteria andMaidNotBetween(Integer value1, Integer value2) {
            addCriterion("maid not between", value1, value2, "maid");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAlinenameIsNull() {
            addCriterion("alinename is null");
            return (Criteria) this;
        }

        public Criteria andAlinenameIsNotNull() {
            addCriterion("alinename is not null");
            return (Criteria) this;
        }

        public Criteria andAlinenameEqualTo(String value) {
            addCriterion("alinename =", value, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameNotEqualTo(String value) {
            addCriterion("alinename <>", value, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameGreaterThan(String value) {
            addCriterion("alinename >", value, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameGreaterThanOrEqualTo(String value) {
            addCriterion("alinename >=", value, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameLessThan(String value) {
            addCriterion("alinename <", value, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameLessThanOrEqualTo(String value) {
            addCriterion("alinename <=", value, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameLike(String value) {
            addCriterion("alinename like", value, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameNotLike(String value) {
            addCriterion("alinename not like", value, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameIn(List<String> values) {
            addCriterion("alinename in", values, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameNotIn(List<String> values) {
            addCriterion("alinename not in", values, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameBetween(String value1, String value2) {
            addCriterion("alinename between", value1, value2, "alinename");
            return (Criteria) this;
        }

        public Criteria andAlinenameNotBetween(String value1, String value2) {
            addCriterion("alinename not between", value1, value2, "alinename");
            return (Criteria) this;
        }

        public Criteria andAprojectIsNull() {
            addCriterion("aproject is null");
            return (Criteria) this;
        }

        public Criteria andAprojectIsNotNull() {
            addCriterion("aproject is not null");
            return (Criteria) this;
        }

        public Criteria andAprojectEqualTo(String value) {
            addCriterion("aproject =", value, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectNotEqualTo(String value) {
            addCriterion("aproject <>", value, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectGreaterThan(String value) {
            addCriterion("aproject >", value, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectGreaterThanOrEqualTo(String value) {
            addCriterion("aproject >=", value, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectLessThan(String value) {
            addCriterion("aproject <", value, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectLessThanOrEqualTo(String value) {
            addCriterion("aproject <=", value, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectLike(String value) {
            addCriterion("aproject like", value, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectNotLike(String value) {
            addCriterion("aproject not like", value, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectIn(List<String> values) {
            addCriterion("aproject in", values, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectNotIn(List<String> values) {
            addCriterion("aproject not in", values, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectBetween(String value1, String value2) {
            addCriterion("aproject between", value1, value2, "aproject");
            return (Criteria) this;
        }

        public Criteria andAprojectNotBetween(String value1, String value2) {
            addCriterion("aproject not between", value1, value2, "aproject");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
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