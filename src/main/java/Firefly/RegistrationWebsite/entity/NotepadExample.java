package Firefly.RegistrationWebsite.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotepadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotepadExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andIslikeIsNull() {
            addCriterion("isLike is null");
            return (Criteria) this;
        }

        public Criteria andIslikeIsNotNull() {
            addCriterion("isLike is not null");
            return (Criteria) this;
        }

        public Criteria andIslikeEqualTo(Integer value) {
            addCriterion("isLike =", value, "islike");
            return (Criteria) this;
        }

        public Criteria andIslikeNotEqualTo(Integer value) {
            addCriterion("isLike <>", value, "islike");
            return (Criteria) this;
        }

        public Criteria andIslikeGreaterThan(Integer value) {
            addCriterion("isLike >", value, "islike");
            return (Criteria) this;
        }

        public Criteria andIslikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("isLike >=", value, "islike");
            return (Criteria) this;
        }

        public Criteria andIslikeLessThan(Integer value) {
            addCriterion("isLike <", value, "islike");
            return (Criteria) this;
        }

        public Criteria andIslikeLessThanOrEqualTo(Integer value) {
            addCriterion("isLike <=", value, "islike");
            return (Criteria) this;
        }

        public Criteria andIslikeIn(List<Integer> values) {
            addCriterion("isLike in", values, "islike");
            return (Criteria) this;
        }

        public Criteria andIslikeNotIn(List<Integer> values) {
            addCriterion("isLike not in", values, "islike");
            return (Criteria) this;
        }

        public Criteria andIslikeBetween(Integer value1, Integer value2) {
            addCriterion("isLike between", value1, value2, "islike");
            return (Criteria) this;
        }

        public Criteria andIslikeNotBetween(Integer value1, Integer value2) {
            addCriterion("isLike not between", value1, value2, "islike");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNull() {
            addCriterion("likeNum is null");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNotNull() {
            addCriterion("likeNum is not null");
            return (Criteria) this;
        }

        public Criteria andLikenumEqualTo(Integer value) {
            addCriterion("likeNum =", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotEqualTo(Integer value) {
            addCriterion("likeNum <>", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThan(Integer value) {
            addCriterion("likeNum >", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeNum >=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThan(Integer value) {
            addCriterion("likeNum <", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThanOrEqualTo(Integer value) {
            addCriterion("likeNum <=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumIn(List<Integer> values) {
            addCriterion("likeNum in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotIn(List<Integer> values) {
            addCriterion("likeNum not in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumBetween(Integer value1, Integer value2) {
            addCriterion("likeNum between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("likeNum not between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumIsNull() {
            addCriterion("dislikeNum is null");
            return (Criteria) this;
        }

        public Criteria andDislikenumIsNotNull() {
            addCriterion("dislikeNum is not null");
            return (Criteria) this;
        }

        public Criteria andDislikenumEqualTo(Integer value) {
            addCriterion("dislikeNum =", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumNotEqualTo(Integer value) {
            addCriterion("dislikeNum <>", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumGreaterThan(Integer value) {
            addCriterion("dislikeNum >", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dislikeNum >=", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumLessThan(Integer value) {
            addCriterion("dislikeNum <", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumLessThanOrEqualTo(Integer value) {
            addCriterion("dislikeNum <=", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumIn(List<Integer> values) {
            addCriterion("dislikeNum in", values, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumNotIn(List<Integer> values) {
            addCriterion("dislikeNum not in", values, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumBetween(Integer value1, Integer value2) {
            addCriterion("dislikeNum between", value1, value2, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("dislikeNum not between", value1, value2, "dislikenum");
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