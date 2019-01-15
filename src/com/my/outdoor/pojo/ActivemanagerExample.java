package com.my.outdoor.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivemanagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivemanagerExample() {
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

        public Criteria andAlineIsNull() {
            addCriterion("aline is null");
            return (Criteria) this;
        }

        public Criteria andAlineIsNotNull() {
            addCriterion("aline is not null");
            return (Criteria) this;
        }

        public Criteria andAlineEqualTo(String value) {
            addCriterion("aline =", value, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineNotEqualTo(String value) {
            addCriterion("aline <>", value, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineGreaterThan(String value) {
            addCriterion("aline >", value, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineGreaterThanOrEqualTo(String value) {
            addCriterion("aline >=", value, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineLessThan(String value) {
            addCriterion("aline <", value, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineLessThanOrEqualTo(String value) {
            addCriterion("aline <=", value, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineLike(String value) {
            addCriterion("aline like", value, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineNotLike(String value) {
            addCriterion("aline not like", value, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineIn(List<String> values) {
            addCriterion("aline in", values, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineNotIn(List<String> values) {
            addCriterion("aline not in", values, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineBetween(String value1, String value2) {
            addCriterion("aline between", value1, value2, "aline");
            return (Criteria) this;
        }

        public Criteria andAlineNotBetween(String value1, String value2) {
            addCriterion("aline not between", value1, value2, "aline");
            return (Criteria) this;
        }

        public Criteria andAsecureIsNull() {
            addCriterion("asecure is null");
            return (Criteria) this;
        }

        public Criteria andAsecureIsNotNull() {
            addCriterion("asecure is not null");
            return (Criteria) this;
        }

        public Criteria andAsecureEqualTo(String value) {
            addCriterion("asecure =", value, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureNotEqualTo(String value) {
            addCriterion("asecure <>", value, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureGreaterThan(String value) {
            addCriterion("asecure >", value, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureGreaterThanOrEqualTo(String value) {
            addCriterion("asecure >=", value, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureLessThan(String value) {
            addCriterion("asecure <", value, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureLessThanOrEqualTo(String value) {
            addCriterion("asecure <=", value, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureLike(String value) {
            addCriterion("asecure like", value, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureNotLike(String value) {
            addCriterion("asecure not like", value, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureIn(List<String> values) {
            addCriterion("asecure in", values, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureNotIn(List<String> values) {
            addCriterion("asecure not in", values, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureBetween(String value1, String value2) {
            addCriterion("asecure between", value1, value2, "asecure");
            return (Criteria) this;
        }

        public Criteria andAsecureNotBetween(String value1, String value2) {
            addCriterion("asecure not between", value1, value2, "asecure");
            return (Criteria) this;
        }

        public Criteria andAdangerousIsNull() {
            addCriterion("adangerous is null");
            return (Criteria) this;
        }

        public Criteria andAdangerousIsNotNull() {
            addCriterion("adangerous is not null");
            return (Criteria) this;
        }

        public Criteria andAdangerousEqualTo(String value) {
            addCriterion("adangerous =", value, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousNotEqualTo(String value) {
            addCriterion("adangerous <>", value, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousGreaterThan(String value) {
            addCriterion("adangerous >", value, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousGreaterThanOrEqualTo(String value) {
            addCriterion("adangerous >=", value, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousLessThan(String value) {
            addCriterion("adangerous <", value, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousLessThanOrEqualTo(String value) {
            addCriterion("adangerous <=", value, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousLike(String value) {
            addCriterion("adangerous like", value, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousNotLike(String value) {
            addCriterion("adangerous not like", value, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousIn(List<String> values) {
            addCriterion("adangerous in", values, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousNotIn(List<String> values) {
            addCriterion("adangerous not in", values, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousBetween(String value1, String value2) {
            addCriterion("adangerous between", value1, value2, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAdangerousNotBetween(String value1, String value2) {
            addCriterion("adangerous not between", value1, value2, "adangerous");
            return (Criteria) this;
        }

        public Criteria andAstrongerIsNull() {
            addCriterion("astronger is null");
            return (Criteria) this;
        }

        public Criteria andAstrongerIsNotNull() {
            addCriterion("astronger is not null");
            return (Criteria) this;
        }

        public Criteria andAstrongerEqualTo(String value) {
            addCriterion("astronger =", value, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerNotEqualTo(String value) {
            addCriterion("astronger <>", value, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerGreaterThan(String value) {
            addCriterion("astronger >", value, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerGreaterThanOrEqualTo(String value) {
            addCriterion("astronger >=", value, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerLessThan(String value) {
            addCriterion("astronger <", value, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerLessThanOrEqualTo(String value) {
            addCriterion("astronger <=", value, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerLike(String value) {
            addCriterion("astronger like", value, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerNotLike(String value) {
            addCriterion("astronger not like", value, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerIn(List<String> values) {
            addCriterion("astronger in", values, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerNotIn(List<String> values) {
            addCriterion("astronger not in", values, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerBetween(String value1, String value2) {
            addCriterion("astronger between", value1, value2, "astronger");
            return (Criteria) this;
        }

        public Criteria andAstrongerNotBetween(String value1, String value2) {
            addCriterion("astronger not between", value1, value2, "astronger");
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

        public Criteria andActivestatuesIsNull() {
            addCriterion("activestatues is null");
            return (Criteria) this;
        }

        public Criteria andActivestatuesIsNotNull() {
            addCriterion("activestatues is not null");
            return (Criteria) this;
        }

        public Criteria andActivestatuesEqualTo(String value) {
            addCriterion("activestatues =", value, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesNotEqualTo(String value) {
            addCriterion("activestatues <>", value, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesGreaterThan(String value) {
            addCriterion("activestatues >", value, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesGreaterThanOrEqualTo(String value) {
            addCriterion("activestatues >=", value, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesLessThan(String value) {
            addCriterion("activestatues <", value, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesLessThanOrEqualTo(String value) {
            addCriterion("activestatues <=", value, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesLike(String value) {
            addCriterion("activestatues like", value, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesNotLike(String value) {
            addCriterion("activestatues not like", value, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesIn(List<String> values) {
            addCriterion("activestatues in", values, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesNotIn(List<String> values) {
            addCriterion("activestatues not in", values, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesBetween(String value1, String value2) {
            addCriterion("activestatues between", value1, value2, "activestatues");
            return (Criteria) this;
        }

        public Criteria andActivestatuesNotBetween(String value1, String value2) {
            addCriterion("activestatues not between", value1, value2, "activestatues");
            return (Criteria) this;
        }

        public Criteria andAcontentIsNull() {
            addCriterion("acontent is null");
            return (Criteria) this;
        }

        public Criteria andAcontentIsNotNull() {
            addCriterion("acontent is not null");
            return (Criteria) this;
        }

        public Criteria andAcontentEqualTo(String value) {
            addCriterion("acontent =", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentNotEqualTo(String value) {
            addCriterion("acontent <>", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentGreaterThan(String value) {
            addCriterion("acontent >", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentGreaterThanOrEqualTo(String value) {
            addCriterion("acontent >=", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentLessThan(String value) {
            addCriterion("acontent <", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentLessThanOrEqualTo(String value) {
            addCriterion("acontent <=", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentLike(String value) {
            addCriterion("acontent like", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentNotLike(String value) {
            addCriterion("acontent not like", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentIn(List<String> values) {
            addCriterion("acontent in", values, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentNotIn(List<String> values) {
            addCriterion("acontent not in", values, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentBetween(String value1, String value2) {
            addCriterion("acontent between", value1, value2, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentNotBetween(String value1, String value2) {
            addCriterion("acontent not between", value1, value2, "acontent");
            return (Criteria) this;
        }

        public Criteria andApictureIsNull() {
            addCriterion("apicture is null");
            return (Criteria) this;
        }

        public Criteria andApictureIsNotNull() {
            addCriterion("apicture is not null");
            return (Criteria) this;
        }

        public Criteria andApictureEqualTo(String value) {
            addCriterion("apicture =", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureNotEqualTo(String value) {
            addCriterion("apicture <>", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureGreaterThan(String value) {
            addCriterion("apicture >", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureGreaterThanOrEqualTo(String value) {
            addCriterion("apicture >=", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureLessThan(String value) {
            addCriterion("apicture <", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureLessThanOrEqualTo(String value) {
            addCriterion("apicture <=", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureLike(String value) {
            addCriterion("apicture like", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureNotLike(String value) {
            addCriterion("apicture not like", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureIn(List<String> values) {
            addCriterion("apicture in", values, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureNotIn(List<String> values) {
            addCriterion("apicture not in", values, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureBetween(String value1, String value2) {
            addCriterion("apicture between", value1, value2, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureNotBetween(String value1, String value2) {
            addCriterion("apicture not between", value1, value2, "apicture");
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