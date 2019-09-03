package com.jakcy.examples.mybatis.generator.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreUserIdIsNull() {
            addCriterion("cre_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreUserIdIsNotNull() {
            addCriterion("cre_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreUserIdEqualTo(String value) {
            addCriterion("cre_user_id =", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdNotEqualTo(String value) {
            addCriterion("cre_user_id <>", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdGreaterThan(String value) {
            addCriterion("cre_user_id >", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("cre_user_id >=", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdLessThan(String value) {
            addCriterion("cre_user_id <", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdLessThanOrEqualTo(String value) {
            addCriterion("cre_user_id <=", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdLike(String value) {
            addCriterion("cre_user_id like", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdNotLike(String value) {
            addCriterion("cre_user_id not like", value, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdIn(List<String> values) {
            addCriterion("cre_user_id in", values, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdNotIn(List<String> values) {
            addCriterion("cre_user_id not in", values, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdBetween(String value1, String value2) {
            addCriterion("cre_user_id between", value1, value2, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCreUserIdNotBetween(String value1, String value2) {
            addCriterion("cre_user_id not between", value1, value2, "creUserId");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("crt_time is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("crt_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(String value) {
            addCriterion("crt_time =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(String value) {
            addCriterion("crt_time <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(String value) {
            addCriterion("crt_time >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(String value) {
            addCriterion("crt_time >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(String value) {
            addCriterion("crt_time <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(String value) {
            addCriterion("crt_time <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLike(String value) {
            addCriterion("crt_time like", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotLike(String value) {
            addCriterion("crt_time not like", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<String> values) {
            addCriterion("crt_time in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<String> values) {
            addCriterion("crt_time not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(String value1, String value2) {
            addCriterion("crt_time between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(String value1, String value2) {
            addCriterion("crt_time not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameIsNull() {
            addCriterion("crt_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameIsNotNull() {
            addCriterion("crt_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameEqualTo(String value) {
            addCriterion("crt_user_name =", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameNotEqualTo(String value) {
            addCriterion("crt_user_name <>", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameGreaterThan(String value) {
            addCriterion("crt_user_name >", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("crt_user_name >=", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameLessThan(String value) {
            addCriterion("crt_user_name <", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameLessThanOrEqualTo(String value) {
            addCriterion("crt_user_name <=", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameLike(String value) {
            addCriterion("crt_user_name like", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameNotLike(String value) {
            addCriterion("crt_user_name not like", value, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameIn(List<String> values) {
            addCriterion("crt_user_name in", values, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameNotIn(List<String> values) {
            addCriterion("crt_user_name not in", values, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameBetween(String value1, String value2) {
            addCriterion("crt_user_name between", value1, value2, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andCrtUserNameNotBetween(String value1, String value2) {
            addCriterion("crt_user_name not between", value1, value2, "crtUserName");
            return (Criteria) this;
        }

        public Criteria andUptTimeIsNull() {
            addCriterion("upt_time is null");
            return (Criteria) this;
        }

        public Criteria andUptTimeIsNotNull() {
            addCriterion("upt_time is not null");
            return (Criteria) this;
        }

        public Criteria andUptTimeEqualTo(String value) {
            addCriterion("upt_time =", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeNotEqualTo(String value) {
            addCriterion("upt_time <>", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeGreaterThan(String value) {
            addCriterion("upt_time >", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeGreaterThanOrEqualTo(String value) {
            addCriterion("upt_time >=", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeLessThan(String value) {
            addCriterion("upt_time <", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeLessThanOrEqualTo(String value) {
            addCriterion("upt_time <=", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeLike(String value) {
            addCriterion("upt_time like", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeNotLike(String value) {
            addCriterion("upt_time not like", value, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeIn(List<String> values) {
            addCriterion("upt_time in", values, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeNotIn(List<String> values) {
            addCriterion("upt_time not in", values, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeBetween(String value1, String value2) {
            addCriterion("upt_time between", value1, value2, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptTimeNotBetween(String value1, String value2) {
            addCriterion("upt_time not between", value1, value2, "uptTime");
            return (Criteria) this;
        }

        public Criteria andUptUserIdIsNull() {
            addCriterion("upt_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUptUserIdIsNotNull() {
            addCriterion("upt_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUptUserIdEqualTo(String value) {
            addCriterion("upt_user_id =", value, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdNotEqualTo(String value) {
            addCriterion("upt_user_id <>", value, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdGreaterThan(String value) {
            addCriterion("upt_user_id >", value, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("upt_user_id >=", value, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdLessThan(String value) {
            addCriterion("upt_user_id <", value, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdLessThanOrEqualTo(String value) {
            addCriterion("upt_user_id <=", value, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdLike(String value) {
            addCriterion("upt_user_id like", value, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdNotLike(String value) {
            addCriterion("upt_user_id not like", value, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdIn(List<String> values) {
            addCriterion("upt_user_id in", values, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdNotIn(List<String> values) {
            addCriterion("upt_user_id not in", values, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdBetween(String value1, String value2) {
            addCriterion("upt_user_id between", value1, value2, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserIdNotBetween(String value1, String value2) {
            addCriterion("upt_user_id not between", value1, value2, "uptUserId");
            return (Criteria) this;
        }

        public Criteria andUptUserNameIsNull() {
            addCriterion("upt_user_name is null");
            return (Criteria) this;
        }

        public Criteria andUptUserNameIsNotNull() {
            addCriterion("upt_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUptUserNameEqualTo(String value) {
            addCriterion("upt_user_name =", value, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameNotEqualTo(String value) {
            addCriterion("upt_user_name <>", value, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameGreaterThan(String value) {
            addCriterion("upt_user_name >", value, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("upt_user_name >=", value, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameLessThan(String value) {
            addCriterion("upt_user_name <", value, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameLessThanOrEqualTo(String value) {
            addCriterion("upt_user_name <=", value, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameLike(String value) {
            addCriterion("upt_user_name like", value, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameNotLike(String value) {
            addCriterion("upt_user_name not like", value, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameIn(List<String> values) {
            addCriterion("upt_user_name in", values, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameNotIn(List<String> values) {
            addCriterion("upt_user_name not in", values, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameBetween(String value1, String value2) {
            addCriterion("upt_user_name between", value1, value2, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andUptUserNameNotBetween(String value1, String value2) {
            addCriterion("upt_user_name not between", value1, value2, "uptUserName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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