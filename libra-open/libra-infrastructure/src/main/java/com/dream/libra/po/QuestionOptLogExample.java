package com.dream.libra.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionOptLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public QuestionOptLogExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andOptTypeIsNull() {
            addCriterion("opt_type is null");
            return (Criteria) this;
        }

        public Criteria andOptTypeIsNotNull() {
            addCriterion("opt_type is not null");
            return (Criteria) this;
        }

        public Criteria andOptTypeEqualTo(Byte value) {
            addCriterion("opt_type =", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotEqualTo(Byte value) {
            addCriterion("opt_type <>", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThan(Byte value) {
            addCriterion("opt_type >", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("opt_type >=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThan(Byte value) {
            addCriterion("opt_type <", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThanOrEqualTo(Byte value) {
            addCriterion("opt_type <=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeIn(List<Byte> values) {
            addCriterion("opt_type in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotIn(List<Byte> values) {
            addCriterion("opt_type not in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeBetween(Byte value1, Byte value2) {
            addCriterion("opt_type between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("opt_type not between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andOptContentIsNull() {
            addCriterion("opt_content is null");
            return (Criteria) this;
        }

        public Criteria andOptContentIsNotNull() {
            addCriterion("opt_content is not null");
            return (Criteria) this;
        }

        public Criteria andOptContentEqualTo(String value) {
            addCriterion("opt_content =", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotEqualTo(String value) {
            addCriterion("opt_content <>", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentGreaterThan(String value) {
            addCriterion("opt_content >", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentGreaterThanOrEqualTo(String value) {
            addCriterion("opt_content >=", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentLessThan(String value) {
            addCriterion("opt_content <", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentLessThanOrEqualTo(String value) {
            addCriterion("opt_content <=", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentLike(String value) {
            addCriterion("opt_content like", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotLike(String value) {
            addCriterion("opt_content not like", value, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentIn(List<String> values) {
            addCriterion("opt_content in", values, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotIn(List<String> values) {
            addCriterion("opt_content not in", values, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentBetween(String value1, String value2) {
            addCriterion("opt_content between", value1, value2, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptContentNotBetween(String value1, String value2) {
            addCriterion("opt_content not between", value1, value2, "optContent");
            return (Criteria) this;
        }

        public Criteria andOptUserIsNull() {
            addCriterion("opt_user is null");
            return (Criteria) this;
        }

        public Criteria andOptUserIsNotNull() {
            addCriterion("opt_user is not null");
            return (Criteria) this;
        }

        public Criteria andOptUserEqualTo(String value) {
            addCriterion("opt_user =", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserNotEqualTo(String value) {
            addCriterion("opt_user <>", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserGreaterThan(String value) {
            addCriterion("opt_user >", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserGreaterThanOrEqualTo(String value) {
            addCriterion("opt_user >=", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserLessThan(String value) {
            addCriterion("opt_user <", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserLessThanOrEqualTo(String value) {
            addCriterion("opt_user <=", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserLike(String value) {
            addCriterion("opt_user like", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserNotLike(String value) {
            addCriterion("opt_user not like", value, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserIn(List<String> values) {
            addCriterion("opt_user in", values, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserNotIn(List<String> values) {
            addCriterion("opt_user not in", values, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserBetween(String value1, String value2) {
            addCriterion("opt_user between", value1, value2, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptUserNotBetween(String value1, String value2) {
            addCriterion("opt_user not between", value1, value2, "optUser");
            return (Criteria) this;
        }

        public Criteria andOptTimeIsNull() {
            addCriterion("opt_time is null");
            return (Criteria) this;
        }

        public Criteria andOptTimeIsNotNull() {
            addCriterion("opt_time is not null");
            return (Criteria) this;
        }

        public Criteria andOptTimeEqualTo(Date value) {
            addCriterion("opt_time =", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotEqualTo(Date value) {
            addCriterion("opt_time <>", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeGreaterThan(Date value) {
            addCriterion("opt_time >", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opt_time >=", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLessThan(Date value) {
            addCriterion("opt_time <", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLessThanOrEqualTo(Date value) {
            addCriterion("opt_time <=", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeIn(List<Date> values) {
            addCriterion("opt_time in", values, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotIn(List<Date> values) {
            addCriterion("opt_time not in", values, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeBetween(Date value1, Date value2) {
            addCriterion("opt_time between", value1, value2, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotBetween(Date value1, Date value2) {
            addCriterion("opt_time not between", value1, value2, "optTime");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Date value) {
            addCriterion("mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Date value) {
            addCriterion("mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Date value) {
            addCriterion("mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Date value) {
            addCriterion("mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Date value) {
            addCriterion("mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Date> values) {
            addCriterion("mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Date> values) {
            addCriterion("mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Date value1, Date value2) {
            addCriterion("mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Date value1, Date value2) {
            addCriterion("mtime not between", value1, value2, "mtime");
            return (Criteria) this;
        }
    }

    /**
     */
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