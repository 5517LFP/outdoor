package com.my.outdoor.pojo;

import java.util.ArrayList;
import java.util.List;

public class LinemanageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinemanageExample() {
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

        public Criteria andLidIsNull() {
            addCriterion("lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("lid not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLinenameIsNull() {
            addCriterion("linename is null");
            return (Criteria) this;
        }

        public Criteria andLinenameIsNotNull() {
            addCriterion("linename is not null");
            return (Criteria) this;
        }

        public Criteria andLinenameEqualTo(String value) {
            addCriterion("linename =", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotEqualTo(String value) {
            addCriterion("linename <>", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameGreaterThan(String value) {
            addCriterion("linename >", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameGreaterThanOrEqualTo(String value) {
            addCriterion("linename >=", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLessThan(String value) {
            addCriterion("linename <", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLessThanOrEqualTo(String value) {
            addCriterion("linename <=", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLike(String value) {
            addCriterion("linename like", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotLike(String value) {
            addCriterion("linename not like", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameIn(List<String> values) {
            addCriterion("linename in", values, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotIn(List<String> values) {
            addCriterion("linename not in", values, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameBetween(String value1, String value2) {
            addCriterion("linename between", value1, value2, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotBetween(String value1, String value2) {
            addCriterion("linename not between", value1, value2, "linename");
            return (Criteria) this;
        }

        public Criteria andLinecontentIsNull() {
            addCriterion("linecontent is null");
            return (Criteria) this;
        }

        public Criteria andLinecontentIsNotNull() {
            addCriterion("linecontent is not null");
            return (Criteria) this;
        }

        public Criteria andLinecontentEqualTo(String value) {
            addCriterion("linecontent =", value, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentNotEqualTo(String value) {
            addCriterion("linecontent <>", value, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentGreaterThan(String value) {
            addCriterion("linecontent >", value, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentGreaterThanOrEqualTo(String value) {
            addCriterion("linecontent >=", value, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentLessThan(String value) {
            addCriterion("linecontent <", value, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentLessThanOrEqualTo(String value) {
            addCriterion("linecontent <=", value, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentLike(String value) {
            addCriterion("linecontent like", value, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentNotLike(String value) {
            addCriterion("linecontent not like", value, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentIn(List<String> values) {
            addCriterion("linecontent in", values, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentNotIn(List<String> values) {
            addCriterion("linecontent not in", values, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentBetween(String value1, String value2) {
            addCriterion("linecontent between", value1, value2, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinecontentNotBetween(String value1, String value2) {
            addCriterion("linecontent not between", value1, value2, "linecontent");
            return (Criteria) this;
        }

        public Criteria andLinetypeIsNull() {
            addCriterion("linetype is null");
            return (Criteria) this;
        }

        public Criteria andLinetypeIsNotNull() {
            addCriterion("linetype is not null");
            return (Criteria) this;
        }

        public Criteria andLinetypeEqualTo(String value) {
            addCriterion("linetype =", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotEqualTo(String value) {
            addCriterion("linetype <>", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeGreaterThan(String value) {
            addCriterion("linetype >", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeGreaterThanOrEqualTo(String value) {
            addCriterion("linetype >=", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLessThan(String value) {
            addCriterion("linetype <", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLessThanOrEqualTo(String value) {
            addCriterion("linetype <=", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLike(String value) {
            addCriterion("linetype like", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotLike(String value) {
            addCriterion("linetype not like", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeIn(List<String> values) {
            addCriterion("linetype in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotIn(List<String> values) {
            addCriterion("linetype not in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeBetween(String value1, String value2) {
            addCriterion("linetype between", value1, value2, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotBetween(String value1, String value2) {
            addCriterion("linetype not between", value1, value2, "linetype");
            return (Criteria) this;
        }

        public Criteria andAbouttimeIsNull() {
            addCriterion("abouttime is null");
            return (Criteria) this;
        }

        public Criteria andAbouttimeIsNotNull() {
            addCriterion("abouttime is not null");
            return (Criteria) this;
        }

        public Criteria andAbouttimeEqualTo(Integer value) {
            addCriterion("abouttime =", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeNotEqualTo(Integer value) {
            addCriterion("abouttime <>", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeGreaterThan(Integer value) {
            addCriterion("abouttime >", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("abouttime >=", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeLessThan(Integer value) {
            addCriterion("abouttime <", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeLessThanOrEqualTo(Integer value) {
            addCriterion("abouttime <=", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeIn(List<Integer> values) {
            addCriterion("abouttime in", values, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeNotIn(List<Integer> values) {
            addCriterion("abouttime not in", values, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeBetween(Integer value1, Integer value2) {
            addCriterion("abouttime between", value1, value2, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("abouttime not between", value1, value2, "abouttime");
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