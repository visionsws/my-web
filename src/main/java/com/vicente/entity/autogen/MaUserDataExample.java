package com.vicente.entity.autogen;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaUserDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaUserDataExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCorpidIsNull() {
            addCriterion("corpid is null");
            return (Criteria) this;
        }

        public Criteria andCorpidIsNotNull() {
            addCriterion("corpid is not null");
            return (Criteria) this;
        }

        public Criteria andCorpidEqualTo(Long value) {
            addCriterion("corpid =", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotEqualTo(Long value) {
            addCriterion("corpid <>", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidGreaterThan(Long value) {
            addCriterion("corpid >", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidGreaterThanOrEqualTo(Long value) {
            addCriterion("corpid >=", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidLessThan(Long value) {
            addCriterion("corpid <", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidLessThanOrEqualTo(Long value) {
            addCriterion("corpid <=", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidIn(List<Long> values) {
            addCriterion("corpid in", values, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotIn(List<Long> values) {
            addCriterion("corpid not in", values, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidBetween(Long value1, Long value2) {
            addCriterion("corpid between", value1, value2, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotBetween(Long value1, Long value2) {
            addCriterion("corpid not between", value1, value2, "corpid");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailIsNull() {
            addCriterion("encrypted_email is null");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailIsNotNull() {
            addCriterion("encrypted_email is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailEqualTo(String value) {
            addCriterion("encrypted_email =", value, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailNotEqualTo(String value) {
            addCriterion("encrypted_email <>", value, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailGreaterThan(String value) {
            addCriterion("encrypted_email >", value, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailGreaterThanOrEqualTo(String value) {
            addCriterion("encrypted_email >=", value, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailLessThan(String value) {
            addCriterion("encrypted_email <", value, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailLessThanOrEqualTo(String value) {
            addCriterion("encrypted_email <=", value, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailLike(String value) {
            addCriterion("encrypted_email like", value, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailNotLike(String value) {
            addCriterion("encrypted_email not like", value, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailIn(List<String> values) {
            addCriterion("encrypted_email in", values, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailNotIn(List<String> values) {
            addCriterion("encrypted_email not in", values, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailBetween(String value1, String value2) {
            addCriterion("encrypted_email between", value1, value2, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andEncryptedEmailNotBetween(String value1, String value2) {
            addCriterion("encrypted_email not between", value1, value2, "encryptedEmail");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileIsNull() {
            addCriterion("encrypted_mobile is null");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileIsNotNull() {
            addCriterion("encrypted_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileEqualTo(String value) {
            addCriterion("encrypted_mobile =", value, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileNotEqualTo(String value) {
            addCriterion("encrypted_mobile <>", value, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileGreaterThan(String value) {
            addCriterion("encrypted_mobile >", value, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileGreaterThanOrEqualTo(String value) {
            addCriterion("encrypted_mobile >=", value, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileLessThan(String value) {
            addCriterion("encrypted_mobile <", value, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileLessThanOrEqualTo(String value) {
            addCriterion("encrypted_mobile <=", value, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileLike(String value) {
            addCriterion("encrypted_mobile like", value, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileNotLike(String value) {
            addCriterion("encrypted_mobile not like", value, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileIn(List<String> values) {
            addCriterion("encrypted_mobile in", values, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileNotIn(List<String> values) {
            addCriterion("encrypted_mobile not in", values, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileBetween(String value1, String value2) {
            addCriterion("encrypted_mobile between", value1, value2, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andEncryptedMobileNotBetween(String value1, String value2) {
            addCriterion("encrypted_mobile not between", value1, value2, "encryptedMobile");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourIsNull() {
            addCriterion("addtime_hour is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourIsNotNull() {
            addCriterion("addtime_hour is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourEqualTo(Integer value) {
            addCriterion("addtime_hour =", value, "addtimeHour");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourNotEqualTo(Integer value) {
            addCriterion("addtime_hour <>", value, "addtimeHour");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourGreaterThan(Integer value) {
            addCriterion("addtime_hour >", value, "addtimeHour");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime_hour >=", value, "addtimeHour");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourLessThan(Integer value) {
            addCriterion("addtime_hour <", value, "addtimeHour");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourLessThanOrEqualTo(Integer value) {
            addCriterion("addtime_hour <=", value, "addtimeHour");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourIn(List<Integer> values) {
            addCriterion("addtime_hour in", values, "addtimeHour");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourNotIn(List<Integer> values) {
            addCriterion("addtime_hour not in", values, "addtimeHour");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourBetween(Integer value1, Integer value2) {
            addCriterion("addtime_hour between", value1, value2, "addtimeHour");
            return (Criteria) this;
        }

        public Criteria andAddtimeHourNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime_hour not between", value1, value2, "addtimeHour");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekIsNull() {
            addCriterion("addtime_week is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekIsNotNull() {
            addCriterion("addtime_week is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekEqualTo(Integer value) {
            addCriterion("addtime_week =", value, "addtimeWeek");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekNotEqualTo(Integer value) {
            addCriterion("addtime_week <>", value, "addtimeWeek");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekGreaterThan(Integer value) {
            addCriterion("addtime_week >", value, "addtimeWeek");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime_week >=", value, "addtimeWeek");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekLessThan(Integer value) {
            addCriterion("addtime_week <", value, "addtimeWeek");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekLessThanOrEqualTo(Integer value) {
            addCriterion("addtime_week <=", value, "addtimeWeek");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekIn(List<Integer> values) {
            addCriterion("addtime_week in", values, "addtimeWeek");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekNotIn(List<Integer> values) {
            addCriterion("addtime_week not in", values, "addtimeWeek");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekBetween(Integer value1, Integer value2) {
            addCriterion("addtime_week between", value1, value2, "addtimeWeek");
            return (Criteria) this;
        }

        public Criteria andAddtimeWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime_week not between", value1, value2, "addtimeWeek");
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Double value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Double value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Double value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Double value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Double value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Double value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Double> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Double> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Double value1, Double value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Double value1, Double value2) {
            addCriterion("age not between", value1, value2, "age");
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

        public Criteria andAllCityIsNull() {
            addCriterion("all_city is null");
            return (Criteria) this;
        }

        public Criteria andAllCityIsNotNull() {
            addCriterion("all_city is not null");
            return (Criteria) this;
        }

        public Criteria andAllCityEqualTo(String value) {
            addCriterion("all_city =", value, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityNotEqualTo(String value) {
            addCriterion("all_city <>", value, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityGreaterThan(String value) {
            addCriterion("all_city >", value, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityGreaterThanOrEqualTo(String value) {
            addCriterion("all_city >=", value, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityLessThan(String value) {
            addCriterion("all_city <", value, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityLessThanOrEqualTo(String value) {
            addCriterion("all_city <=", value, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityLike(String value) {
            addCriterion("all_city like", value, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityNotLike(String value) {
            addCriterion("all_city not like", value, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityIn(List<String> values) {
            addCriterion("all_city in", values, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityNotIn(List<String> values) {
            addCriterion("all_city not in", values, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityBetween(String value1, String value2) {
            addCriterion("all_city between", value1, value2, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllCityNotBetween(String value1, String value2) {
            addCriterion("all_city not between", value1, value2, "allCity");
            return (Criteria) this;
        }

        public Criteria andAllProvinceIsNull() {
            addCriterion("all_province is null");
            return (Criteria) this;
        }

        public Criteria andAllProvinceIsNotNull() {
            addCriterion("all_province is not null");
            return (Criteria) this;
        }

        public Criteria andAllProvinceEqualTo(String value) {
            addCriterion("all_province =", value, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceNotEqualTo(String value) {
            addCriterion("all_province <>", value, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceGreaterThan(String value) {
            addCriterion("all_province >", value, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("all_province >=", value, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceLessThan(String value) {
            addCriterion("all_province <", value, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceLessThanOrEqualTo(String value) {
            addCriterion("all_province <=", value, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceLike(String value) {
            addCriterion("all_province like", value, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceNotLike(String value) {
            addCriterion("all_province not like", value, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceIn(List<String> values) {
            addCriterion("all_province in", values, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceNotIn(List<String> values) {
            addCriterion("all_province not in", values, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceBetween(String value1, String value2) {
            addCriterion("all_province between", value1, value2, "allProvince");
            return (Criteria) this;
        }

        public Criteria andAllProvinceNotBetween(String value1, String value2) {
            addCriterion("all_province not between", value1, value2, "allProvince");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andRealAgeIsNull() {
            addCriterion("real_age is null");
            return (Criteria) this;
        }

        public Criteria andRealAgeIsNotNull() {
            addCriterion("real_age is not null");
            return (Criteria) this;
        }

        public Criteria andRealAgeEqualTo(Double value) {
            addCriterion("real_age =", value, "realAge");
            return (Criteria) this;
        }

        public Criteria andRealAgeNotEqualTo(Double value) {
            addCriterion("real_age <>", value, "realAge");
            return (Criteria) this;
        }

        public Criteria andRealAgeGreaterThan(Double value) {
            addCriterion("real_age >", value, "realAge");
            return (Criteria) this;
        }

        public Criteria andRealAgeGreaterThanOrEqualTo(Double value) {
            addCriterion("real_age >=", value, "realAge");
            return (Criteria) this;
        }

        public Criteria andRealAgeLessThan(Double value) {
            addCriterion("real_age <", value, "realAge");
            return (Criteria) this;
        }

        public Criteria andRealAgeLessThanOrEqualTo(Double value) {
            addCriterion("real_age <=", value, "realAge");
            return (Criteria) this;
        }

        public Criteria andRealAgeIn(List<Double> values) {
            addCriterion("real_age in", values, "realAge");
            return (Criteria) this;
        }

        public Criteria andRealAgeNotIn(List<Double> values) {
            addCriterion("real_age not in", values, "realAge");
            return (Criteria) this;
        }

        public Criteria andRealAgeBetween(Double value1, Double value2) {
            addCriterion("real_age between", value1, value2, "realAge");
            return (Criteria) this;
        }

        public Criteria andRealAgeNotBetween(Double value1, Double value2) {
            addCriterion("real_age not between", value1, value2, "realAge");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedIsNull() {
            addCriterion("email_is_corrected is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedIsNotNull() {
            addCriterion("email_is_corrected is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedEqualTo(Boolean value) {
            addCriterion("email_is_corrected =", value, "emailIsCorrected");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedNotEqualTo(Boolean value) {
            addCriterion("email_is_corrected <>", value, "emailIsCorrected");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedGreaterThan(Boolean value) {
            addCriterion("email_is_corrected >", value, "emailIsCorrected");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("email_is_corrected >=", value, "emailIsCorrected");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedLessThan(Boolean value) {
            addCriterion("email_is_corrected <", value, "emailIsCorrected");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedLessThanOrEqualTo(Boolean value) {
            addCriterion("email_is_corrected <=", value, "emailIsCorrected");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedIn(List<Boolean> values) {
            addCriterion("email_is_corrected in", values, "emailIsCorrected");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedNotIn(List<Boolean> values) {
            addCriterion("email_is_corrected not in", values, "emailIsCorrected");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedBetween(Boolean value1, Boolean value2) {
            addCriterion("email_is_corrected between", value1, value2, "emailIsCorrected");
            return (Criteria) this;
        }

        public Criteria andEmailIsCorrectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("email_is_corrected not between", value1, value2, "emailIsCorrected");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidIsNull() {
            addCriterion("userExpGroupid is null");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidIsNotNull() {
            addCriterion("userExpGroupid is not null");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidEqualTo(Integer value) {
            addCriterion("userExpGroupid =", value, "userexpgroupid");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidNotEqualTo(Integer value) {
            addCriterion("userExpGroupid <>", value, "userexpgroupid");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidGreaterThan(Integer value) {
            addCriterion("userExpGroupid >", value, "userexpgroupid");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userExpGroupid >=", value, "userexpgroupid");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidLessThan(Integer value) {
            addCriterion("userExpGroupid <", value, "userexpgroupid");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("userExpGroupid <=", value, "userexpgroupid");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidIn(List<Integer> values) {
            addCriterion("userExpGroupid in", values, "userexpgroupid");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidNotIn(List<Integer> values) {
            addCriterion("userExpGroupid not in", values, "userexpgroupid");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidBetween(Integer value1, Integer value2) {
            addCriterion("userExpGroupid between", value1, value2, "userexpgroupid");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("userExpGroupid not between", value1, value2, "userexpgroupid");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupIsNull() {
            addCriterion("userExpGroup is null");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupIsNotNull() {
            addCriterion("userExpGroup is not null");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupEqualTo(String value) {
            addCriterion("userExpGroup =", value, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupNotEqualTo(String value) {
            addCriterion("userExpGroup <>", value, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupGreaterThan(String value) {
            addCriterion("userExpGroup >", value, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupGreaterThanOrEqualTo(String value) {
            addCriterion("userExpGroup >=", value, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupLessThan(String value) {
            addCriterion("userExpGroup <", value, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupLessThanOrEqualTo(String value) {
            addCriterion("userExpGroup <=", value, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupLike(String value) {
            addCriterion("userExpGroup like", value, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupNotLike(String value) {
            addCriterion("userExpGroup not like", value, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupIn(List<String> values) {
            addCriterion("userExpGroup in", values, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupNotIn(List<String> values) {
            addCriterion("userExpGroup not in", values, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupBetween(String value1, String value2) {
            addCriterion("userExpGroup between", value1, value2, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andUserexpgroupNotBetween(String value1, String value2) {
            addCriterion("userExpGroup not between", value1, value2, "userexpgroup");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsIsNull() {
            addCriterion("is_email_unsubs is null");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsIsNotNull() {
            addCriterion("is_email_unsubs is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsEqualTo(Short value) {
            addCriterion("is_email_unsubs =", value, "isEmailUnsubs");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsNotEqualTo(Short value) {
            addCriterion("is_email_unsubs <>", value, "isEmailUnsubs");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsGreaterThan(Short value) {
            addCriterion("is_email_unsubs >", value, "isEmailUnsubs");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsGreaterThanOrEqualTo(Short value) {
            addCriterion("is_email_unsubs >=", value, "isEmailUnsubs");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsLessThan(Short value) {
            addCriterion("is_email_unsubs <", value, "isEmailUnsubs");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsLessThanOrEqualTo(Short value) {
            addCriterion("is_email_unsubs <=", value, "isEmailUnsubs");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsIn(List<Short> values) {
            addCriterion("is_email_unsubs in", values, "isEmailUnsubs");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsNotIn(List<Short> values) {
            addCriterion("is_email_unsubs not in", values, "isEmailUnsubs");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsBetween(Short value1, Short value2) {
            addCriterion("is_email_unsubs between", value1, value2, "isEmailUnsubs");
            return (Criteria) this;
        }

        public Criteria andIsEmailUnsubsNotBetween(Short value1, Short value2) {
            addCriterion("is_email_unsubs not between", value1, value2, "isEmailUnsubs");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNull() {
            addCriterion("activityid is null");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNotNull() {
            addCriterion("activityid is not null");
            return (Criteria) this;
        }

        public Criteria andActivityidEqualTo(Integer value) {
            addCriterion("activityid =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(Integer value) {
            addCriterion("activityid <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(Integer value) {
            addCriterion("activityid >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityid >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(Integer value) {
            addCriterion("activityid <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(Integer value) {
            addCriterion("activityid <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<Integer> values) {
            addCriterion("activityid in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<Integer> values) {
            addCriterion("activityid not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(Integer value1, Integer value2) {
            addCriterion("activityid between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(Integer value1, Integer value2) {
            addCriterion("activityid not between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andCarloanIsNull() {
            addCriterion("carloan is null");
            return (Criteria) this;
        }

        public Criteria andCarloanIsNotNull() {
            addCriterion("carloan is not null");
            return (Criteria) this;
        }

        public Criteria andCarloanEqualTo(String value) {
            addCriterion("carloan =", value, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanNotEqualTo(String value) {
            addCriterion("carloan <>", value, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanGreaterThan(String value) {
            addCriterion("carloan >", value, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanGreaterThanOrEqualTo(String value) {
            addCriterion("carloan >=", value, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanLessThan(String value) {
            addCriterion("carloan <", value, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanLessThanOrEqualTo(String value) {
            addCriterion("carloan <=", value, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanLike(String value) {
            addCriterion("carloan like", value, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanNotLike(String value) {
            addCriterion("carloan not like", value, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanIn(List<String> values) {
            addCriterion("carloan in", values, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanNotIn(List<String> values) {
            addCriterion("carloan not in", values, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanBetween(String value1, String value2) {
            addCriterion("carloan between", value1, value2, "carloan");
            return (Criteria) this;
        }

        public Criteria andCarloanNotBetween(String value1, String value2) {
            addCriterion("carloan not between", value1, value2, "carloan");
            return (Criteria) this;
        }

        public Criteria andClearIsNull() {
            addCriterion("clear is null");
            return (Criteria) this;
        }

        public Criteria andClearIsNotNull() {
            addCriterion("clear is not null");
            return (Criteria) this;
        }

        public Criteria andClearEqualTo(String value) {
            addCriterion("clear =", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearNotEqualTo(String value) {
            addCriterion("clear <>", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearGreaterThan(String value) {
            addCriterion("clear >", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearGreaterThanOrEqualTo(String value) {
            addCriterion("clear >=", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearLessThan(String value) {
            addCriterion("clear <", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearLessThanOrEqualTo(String value) {
            addCriterion("clear <=", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearLike(String value) {
            addCriterion("clear like", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearNotLike(String value) {
            addCriterion("clear not like", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearIn(List<String> values) {
            addCriterion("clear in", values, "clear");
            return (Criteria) this;
        }

        public Criteria andClearNotIn(List<String> values) {
            addCriterion("clear not in", values, "clear");
            return (Criteria) this;
        }

        public Criteria andClearBetween(String value1, String value2) {
            addCriterion("clear between", value1, value2, "clear");
            return (Criteria) this;
        }

        public Criteria andClearNotBetween(String value1, String value2) {
            addCriterion("clear not between", value1, value2, "clear");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("client not between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andIpcityIsNull() {
            addCriterion("ipcity is null");
            return (Criteria) this;
        }

        public Criteria andIpcityIsNotNull() {
            addCriterion("ipcity is not null");
            return (Criteria) this;
        }

        public Criteria andIpcityEqualTo(String value) {
            addCriterion("ipcity =", value, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityNotEqualTo(String value) {
            addCriterion("ipcity <>", value, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityGreaterThan(String value) {
            addCriterion("ipcity >", value, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityGreaterThanOrEqualTo(String value) {
            addCriterion("ipcity >=", value, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityLessThan(String value) {
            addCriterion("ipcity <", value, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityLessThanOrEqualTo(String value) {
            addCriterion("ipcity <=", value, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityLike(String value) {
            addCriterion("ipcity like", value, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityNotLike(String value) {
            addCriterion("ipcity not like", value, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityIn(List<String> values) {
            addCriterion("ipcity in", values, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityNotIn(List<String> values) {
            addCriterion("ipcity not in", values, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityBetween(String value1, String value2) {
            addCriterion("ipcity between", value1, value2, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpcityNotBetween(String value1, String value2) {
            addCriterion("ipcity not between", value1, value2, "ipcity");
            return (Criteria) this;
        }

        public Criteria andIpprovinceIsNull() {
            addCriterion("ipprovince is null");
            return (Criteria) this;
        }

        public Criteria andIpprovinceIsNotNull() {
            addCriterion("ipprovince is not null");
            return (Criteria) this;
        }

        public Criteria andIpprovinceEqualTo(String value) {
            addCriterion("ipprovince =", value, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceNotEqualTo(String value) {
            addCriterion("ipprovince <>", value, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceGreaterThan(String value) {
            addCriterion("ipprovince >", value, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("ipprovince >=", value, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceLessThan(String value) {
            addCriterion("ipprovince <", value, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceLessThanOrEqualTo(String value) {
            addCriterion("ipprovince <=", value, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceLike(String value) {
            addCriterion("ipprovince like", value, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceNotLike(String value) {
            addCriterion("ipprovince not like", value, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceIn(List<String> values) {
            addCriterion("ipprovince in", values, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceNotIn(List<String> values) {
            addCriterion("ipprovince not in", values, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceBetween(String value1, String value2) {
            addCriterion("ipprovince between", value1, value2, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIpprovinceNotBetween(String value1, String value2) {
            addCriterion("ipprovince not between", value1, value2, "ipprovince");
            return (Criteria) this;
        }

        public Criteria andIspcIsNull() {
            addCriterion("ispc is null");
            return (Criteria) this;
        }

        public Criteria andIspcIsNotNull() {
            addCriterion("ispc is not null");
            return (Criteria) this;
        }

        public Criteria andIspcEqualTo(String value) {
            addCriterion("ispc =", value, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcNotEqualTo(String value) {
            addCriterion("ispc <>", value, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcGreaterThan(String value) {
            addCriterion("ispc >", value, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcGreaterThanOrEqualTo(String value) {
            addCriterion("ispc >=", value, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcLessThan(String value) {
            addCriterion("ispc <", value, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcLessThanOrEqualTo(String value) {
            addCriterion("ispc <=", value, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcLike(String value) {
            addCriterion("ispc like", value, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcNotLike(String value) {
            addCriterion("ispc not like", value, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcIn(List<String> values) {
            addCriterion("ispc in", values, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcNotIn(List<String> values) {
            addCriterion("ispc not in", values, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcBetween(String value1, String value2) {
            addCriterion("ispc between", value1, value2, "ispc");
            return (Criteria) this;
        }

        public Criteria andIspcNotBetween(String value1, String value2) {
            addCriterion("ispc not between", value1, value2, "ispc");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceIsNull() {
            addCriterion("mobileprovince is null");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceIsNotNull() {
            addCriterion("mobileprovince is not null");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceEqualTo(String value) {
            addCriterion("mobileprovince =", value, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceNotEqualTo(String value) {
            addCriterion("mobileprovince <>", value, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceGreaterThan(String value) {
            addCriterion("mobileprovince >", value, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("mobileprovince >=", value, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceLessThan(String value) {
            addCriterion("mobileprovince <", value, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceLessThanOrEqualTo(String value) {
            addCriterion("mobileprovince <=", value, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceLike(String value) {
            addCriterion("mobileprovince like", value, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceNotLike(String value) {
            addCriterion("mobileprovince not like", value, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceIn(List<String> values) {
            addCriterion("mobileprovince in", values, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceNotIn(List<String> values) {
            addCriterion("mobileprovince not in", values, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceBetween(String value1, String value2) {
            addCriterion("mobileprovince between", value1, value2, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobileprovinceNotBetween(String value1, String value2) {
            addCriterion("mobileprovince not between", value1, value2, "mobileprovince");
            return (Criteria) this;
        }

        public Criteria andMobiletypeIsNull() {
            addCriterion("mobiletype is null");
            return (Criteria) this;
        }

        public Criteria andMobiletypeIsNotNull() {
            addCriterion("mobiletype is not null");
            return (Criteria) this;
        }

        public Criteria andMobiletypeEqualTo(String value) {
            addCriterion("mobiletype =", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotEqualTo(String value) {
            addCriterion("mobiletype <>", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeGreaterThan(String value) {
            addCriterion("mobiletype >", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("mobiletype >=", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeLessThan(String value) {
            addCriterion("mobiletype <", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeLessThanOrEqualTo(String value) {
            addCriterion("mobiletype <=", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeLike(String value) {
            addCriterion("mobiletype like", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotLike(String value) {
            addCriterion("mobiletype not like", value, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeIn(List<String> values) {
            addCriterion("mobiletype in", values, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotIn(List<String> values) {
            addCriterion("mobiletype not in", values, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeBetween(String value1, String value2) {
            addCriterion("mobiletype between", value1, value2, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andMobiletypeNotBetween(String value1, String value2) {
            addCriterion("mobiletype not between", value1, value2, "mobiletype");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("terminal_type is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("terminal_type is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(String value) {
            addCriterion("terminal_type =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(String value) {
            addCriterion("terminal_type <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(String value) {
            addCriterion("terminal_type >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_type >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(String value) {
            addCriterion("terminal_type <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(String value) {
            addCriterion("terminal_type <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLike(String value) {
            addCriterion("terminal_type like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotLike(String value) {
            addCriterion("terminal_type not like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<String> values) {
            addCriterion("terminal_type in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<String> values) {
            addCriterion("terminal_type not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(String value1, String value2) {
            addCriterion("terminal_type between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(String value1, String value2) {
            addCriterion("terminal_type not between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andUserprovinceIsNull() {
            addCriterion("userprovince is null");
            return (Criteria) this;
        }

        public Criteria andUserprovinceIsNotNull() {
            addCriterion("userprovince is not null");
            return (Criteria) this;
        }

        public Criteria andUserprovinceEqualTo(String value) {
            addCriterion("userprovince =", value, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceNotEqualTo(String value) {
            addCriterion("userprovince <>", value, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceGreaterThan(String value) {
            addCriterion("userprovince >", value, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("userprovince >=", value, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceLessThan(String value) {
            addCriterion("userprovince <", value, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceLessThanOrEqualTo(String value) {
            addCriterion("userprovince <=", value, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceLike(String value) {
            addCriterion("userprovince like", value, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceNotLike(String value) {
            addCriterion("userprovince not like", value, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceIn(List<String> values) {
            addCriterion("userprovince in", values, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceNotIn(List<String> values) {
            addCriterion("userprovince not in", values, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceBetween(String value1, String value2) {
            addCriterion("userprovince between", value1, value2, "userprovince");
            return (Criteria) this;
        }

        public Criteria andUserprovinceNotBetween(String value1, String value2) {
            addCriterion("userprovince not between", value1, value2, "userprovince");
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