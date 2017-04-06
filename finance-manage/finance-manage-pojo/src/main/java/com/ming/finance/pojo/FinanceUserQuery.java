package com.ming.finance.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceUserQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FinanceUserQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andSysUserIdIsNull() {
            addCriterion("sys_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNotNull() {
            addCriterion("sys_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdEqualTo(Long value) {
            addCriterion("sys_user_id =", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotEqualTo(Long value) {
            addCriterion("sys_user_id <>", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThan(Long value) {
            addCriterion("sys_user_id >", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_user_id >=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThan(Long value) {
            addCriterion("sys_user_id <", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_user_id <=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIn(List<Long> values) {
            addCriterion("sys_user_id in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotIn(List<Long> values) {
            addCriterion("sys_user_id not in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdBetween(Long value1, Long value2) {
            addCriterion("sys_user_id between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_user_id not between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameIsNull() {
            addCriterion("sys_user_login_name is null");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameIsNotNull() {
            addCriterion("sys_user_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameEqualTo(String value) {
            addCriterion("sys_user_login_name =", value, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameNotEqualTo(String value) {
            addCriterion("sys_user_login_name <>", value, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameGreaterThan(String value) {
            addCriterion("sys_user_login_name >", value, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_login_name >=", value, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameLessThan(String value) {
            addCriterion("sys_user_login_name <", value, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameLessThanOrEqualTo(String value) {
            addCriterion("sys_user_login_name <=", value, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameLike(String value) {
            addCriterion("sys_user_login_name like", value, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameNotLike(String value) {
            addCriterion("sys_user_login_name not like", value, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameIn(List<String> values) {
            addCriterion("sys_user_login_name in", values, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameNotIn(List<String> values) {
            addCriterion("sys_user_login_name not in", values, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameBetween(String value1, String value2) {
            addCriterion("sys_user_login_name between", value1, value2, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginNameNotBetween(String value1, String value2) {
            addCriterion("sys_user_login_name not between", value1, value2, "sysUserLoginName");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordIsNull() {
            addCriterion("sys_user_login_password is null");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordIsNotNull() {
            addCriterion("sys_user_login_password is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordEqualTo(String value) {
            addCriterion("sys_user_login_password =", value, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordNotEqualTo(String value) {
            addCriterion("sys_user_login_password <>", value, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordGreaterThan(String value) {
            addCriterion("sys_user_login_password >", value, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_login_password >=", value, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordLessThan(String value) {
            addCriterion("sys_user_login_password <", value, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("sys_user_login_password <=", value, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordLike(String value) {
            addCriterion("sys_user_login_password like", value, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordNotLike(String value) {
            addCriterion("sys_user_login_password not like", value, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordIn(List<String> values) {
            addCriterion("sys_user_login_password in", values, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordNotIn(List<String> values) {
            addCriterion("sys_user_login_password not in", values, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordBetween(String value1, String value2) {
            addCriterion("sys_user_login_password between", value1, value2, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("sys_user_login_password not between", value1, value2, "sysUserLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusIsNull() {
            addCriterion("sys_user_status is null");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusIsNotNull() {
            addCriterion("sys_user_status is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusEqualTo(String value) {
            addCriterion("sys_user_status =", value, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusNotEqualTo(String value) {
            addCriterion("sys_user_status <>", value, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusGreaterThan(String value) {
            addCriterion("sys_user_status >", value, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_status >=", value, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusLessThan(String value) {
            addCriterion("sys_user_status <", value, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusLessThanOrEqualTo(String value) {
            addCriterion("sys_user_status <=", value, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusLike(String value) {
            addCriterion("sys_user_status like", value, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusNotLike(String value) {
            addCriterion("sys_user_status not like", value, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusIn(List<String> values) {
            addCriterion("sys_user_status in", values, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusNotIn(List<String> values) {
            addCriterion("sys_user_status not in", values, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusBetween(String value1, String value2) {
            addCriterion("sys_user_status between", value1, value2, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserStatusNotBetween(String value1, String value2) {
            addCriterion("sys_user_status not between", value1, value2, "sysUserStatus");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteIsNull() {
            addCriterion("sys_user_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteIsNotNull() {
            addCriterion("sys_user_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteEqualTo(String value) {
            addCriterion("sys_user_is_delete =", value, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteNotEqualTo(String value) {
            addCriterion("sys_user_is_delete <>", value, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteGreaterThan(String value) {
            addCriterion("sys_user_is_delete >", value, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_is_delete >=", value, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteLessThan(String value) {
            addCriterion("sys_user_is_delete <", value, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("sys_user_is_delete <=", value, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteLike(String value) {
            addCriterion("sys_user_is_delete like", value, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteNotLike(String value) {
            addCriterion("sys_user_is_delete not like", value, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteIn(List<String> values) {
            addCriterion("sys_user_is_delete in", values, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteNotIn(List<String> values) {
            addCriterion("sys_user_is_delete not in", values, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteBetween(String value1, String value2) {
            addCriterion("sys_user_is_delete between", value1, value2, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserIsDeleteNotBetween(String value1, String value2) {
            addCriterion("sys_user_is_delete not between", value1, value2, "sysUserIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeIsNull() {
            addCriterion("sys_user_register_datetime is null");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeIsNotNull() {
            addCriterion("sys_user_register_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeEqualTo(Date value) {
            addCriterion("sys_user_register_datetime =", value, "sysUserRegisterDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeNotEqualTo(Date value) {
            addCriterion("sys_user_register_datetime <>", value, "sysUserRegisterDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeGreaterThan(Date value) {
            addCriterion("sys_user_register_datetime >", value, "sysUserRegisterDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_user_register_datetime >=", value, "sysUserRegisterDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeLessThan(Date value) {
            addCriterion("sys_user_register_datetime <", value, "sysUserRegisterDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_user_register_datetime <=", value, "sysUserRegisterDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeIn(List<Date> values) {
            addCriterion("sys_user_register_datetime in", values, "sysUserRegisterDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeNotIn(List<Date> values) {
            addCriterion("sys_user_register_datetime not in", values, "sysUserRegisterDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeBetween(Date value1, Date value2) {
            addCriterion("sys_user_register_datetime between", value1, value2, "sysUserRegisterDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUserRegisterDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_user_register_datetime not between", value1, value2, "sysUserRegisterDatetime");
            return (Criteria) this;
        }

        public Criteria andSysUserSexIsNull() {
            addCriterion("sys_user_sex is null");
            return (Criteria) this;
        }

        public Criteria andSysUserSexIsNotNull() {
            addCriterion("sys_user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserSexEqualTo(String value) {
            addCriterion("sys_user_sex =", value, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexNotEqualTo(String value) {
            addCriterion("sys_user_sex <>", value, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexGreaterThan(String value) {
            addCriterion("sys_user_sex >", value, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_sex >=", value, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexLessThan(String value) {
            addCriterion("sys_user_sex <", value, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexLessThanOrEqualTo(String value) {
            addCriterion("sys_user_sex <=", value, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexLike(String value) {
            addCriterion("sys_user_sex like", value, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexNotLike(String value) {
            addCriterion("sys_user_sex not like", value, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexIn(List<String> values) {
            addCriterion("sys_user_sex in", values, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexNotIn(List<String> values) {
            addCriterion("sys_user_sex not in", values, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexBetween(String value1, String value2) {
            addCriterion("sys_user_sex between", value1, value2, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserSexNotBetween(String value1, String value2) {
            addCriterion("sys_user_sex not between", value1, value2, "sysUserSex");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodIsNull() {
            addCriterion("sys_user_pay_passwrod is null");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodIsNotNull() {
            addCriterion("sys_user_pay_passwrod is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodEqualTo(String value) {
            addCriterion("sys_user_pay_passwrod =", value, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodNotEqualTo(String value) {
            addCriterion("sys_user_pay_passwrod <>", value, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodGreaterThan(String value) {
            addCriterion("sys_user_pay_passwrod >", value, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_pay_passwrod >=", value, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodLessThan(String value) {
            addCriterion("sys_user_pay_passwrod <", value, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodLessThanOrEqualTo(String value) {
            addCriterion("sys_user_pay_passwrod <=", value, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodLike(String value) {
            addCriterion("sys_user_pay_passwrod like", value, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodNotLike(String value) {
            addCriterion("sys_user_pay_passwrod not like", value, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodIn(List<String> values) {
            addCriterion("sys_user_pay_passwrod in", values, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodNotIn(List<String> values) {
            addCriterion("sys_user_pay_passwrod not in", values, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodBetween(String value1, String value2) {
            addCriterion("sys_user_pay_passwrod between", value1, value2, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserPayPasswrodNotBetween(String value1, String value2) {
            addCriterion("sys_user_pay_passwrod not between", value1, value2, "sysUserPayPasswrod");
            return (Criteria) this;
        }

        public Criteria andSysUserIconIsNull() {
            addCriterion("sys_user_icon is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIconIsNotNull() {
            addCriterion("sys_user_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserIconEqualTo(String value) {
            addCriterion("sys_user_icon =", value, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconNotEqualTo(String value) {
            addCriterion("sys_user_icon <>", value, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconGreaterThan(String value) {
            addCriterion("sys_user_icon >", value, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_icon >=", value, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconLessThan(String value) {
            addCriterion("sys_user_icon <", value, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconLessThanOrEqualTo(String value) {
            addCriterion("sys_user_icon <=", value, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconLike(String value) {
            addCriterion("sys_user_icon like", value, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconNotLike(String value) {
            addCriterion("sys_user_icon not like", value, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconIn(List<String> values) {
            addCriterion("sys_user_icon in", values, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconNotIn(List<String> values) {
            addCriterion("sys_user_icon not in", values, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconBetween(String value1, String value2) {
            addCriterion("sys_user_icon between", value1, value2, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserIconNotBetween(String value1, String value2) {
            addCriterion("sys_user_icon not between", value1, value2, "sysUserIcon");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameIsNull() {
            addCriterion("sys_user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameIsNotNull() {
            addCriterion("sys_user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameEqualTo(String value) {
            addCriterion("sys_user_real_name =", value, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameNotEqualTo(String value) {
            addCriterion("sys_user_real_name <>", value, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameGreaterThan(String value) {
            addCriterion("sys_user_real_name >", value, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_real_name >=", value, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameLessThan(String value) {
            addCriterion("sys_user_real_name <", value, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("sys_user_real_name <=", value, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameLike(String value) {
            addCriterion("sys_user_real_name like", value, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameNotLike(String value) {
            addCriterion("sys_user_real_name not like", value, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameIn(List<String> values) {
            addCriterion("sys_user_real_name in", values, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameNotIn(List<String> values) {
            addCriterion("sys_user_real_name not in", values, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameBetween(String value1, String value2) {
            addCriterion("sys_user_real_name between", value1, value2, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserRealNameNotBetween(String value1, String value2) {
            addCriterion("sys_user_real_name not between", value1, value2, "sysUserRealName");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailIsNull() {
            addCriterion("sys_user_email is null");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailIsNotNull() {
            addCriterion("sys_user_email is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailEqualTo(String value) {
            addCriterion("sys_user_email =", value, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailNotEqualTo(String value) {
            addCriterion("sys_user_email <>", value, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailGreaterThan(String value) {
            addCriterion("sys_user_email >", value, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_email >=", value, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailLessThan(String value) {
            addCriterion("sys_user_email <", value, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailLessThanOrEqualTo(String value) {
            addCriterion("sys_user_email <=", value, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailLike(String value) {
            addCriterion("sys_user_email like", value, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailNotLike(String value) {
            addCriterion("sys_user_email not like", value, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailIn(List<String> values) {
            addCriterion("sys_user_email in", values, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailNotIn(List<String> values) {
            addCriterion("sys_user_email not in", values, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailBetween(String value1, String value2) {
            addCriterion("sys_user_email between", value1, value2, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserEmailNotBetween(String value1, String value2) {
            addCriterion("sys_user_email not between", value1, value2, "sysUserEmail");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileIsNull() {
            addCriterion("sys_user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileIsNotNull() {
            addCriterion("sys_user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileEqualTo(String value) {
            addCriterion("sys_user_mobile =", value, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileNotEqualTo(String value) {
            addCriterion("sys_user_mobile <>", value, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileGreaterThan(String value) {
            addCriterion("sys_user_mobile >", value, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_mobile >=", value, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileLessThan(String value) {
            addCriterion("sys_user_mobile <", value, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileLessThanOrEqualTo(String value) {
            addCriterion("sys_user_mobile <=", value, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileLike(String value) {
            addCriterion("sys_user_mobile like", value, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileNotLike(String value) {
            addCriterion("sys_user_mobile not like", value, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileIn(List<String> values) {
            addCriterion("sys_user_mobile in", values, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileNotIn(List<String> values) {
            addCriterion("sys_user_mobile not in", values, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileBetween(String value1, String value2) {
            addCriterion("sys_user_mobile between", value1, value2, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserMobileNotBetween(String value1, String value2) {
            addCriterion("sys_user_mobile not between", value1, value2, "sysUserMobile");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdIsNull() {
            addCriterion("sys_user_weibo_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdIsNotNull() {
            addCriterion("sys_user_weibo_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdEqualTo(String value) {
            addCriterion("sys_user_weibo_id =", value, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdNotEqualTo(String value) {
            addCriterion("sys_user_weibo_id <>", value, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdGreaterThan(String value) {
            addCriterion("sys_user_weibo_id >", value, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_weibo_id >=", value, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdLessThan(String value) {
            addCriterion("sys_user_weibo_id <", value, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdLessThanOrEqualTo(String value) {
            addCriterion("sys_user_weibo_id <=", value, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdLike(String value) {
            addCriterion("sys_user_weibo_id like", value, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdNotLike(String value) {
            addCriterion("sys_user_weibo_id not like", value, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdIn(List<String> values) {
            addCriterion("sys_user_weibo_id in", values, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdNotIn(List<String> values) {
            addCriterion("sys_user_weibo_id not in", values, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdBetween(String value1, String value2) {
            addCriterion("sys_user_weibo_id between", value1, value2, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserWeiboIdNotBetween(String value1, String value2) {
            addCriterion("sys_user_weibo_id not between", value1, value2, "sysUserWeiboId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdIsNull() {
            addCriterion("sys_user_qq_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdIsNotNull() {
            addCriterion("sys_user_qq_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdEqualTo(String value) {
            addCriterion("sys_user_qq_id =", value, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdNotEqualTo(String value) {
            addCriterion("sys_user_qq_id <>", value, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdGreaterThan(String value) {
            addCriterion("sys_user_qq_id >", value, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_qq_id >=", value, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdLessThan(String value) {
            addCriterion("sys_user_qq_id <", value, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdLessThanOrEqualTo(String value) {
            addCriterion("sys_user_qq_id <=", value, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdLike(String value) {
            addCriterion("sys_user_qq_id like", value, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdNotLike(String value) {
            addCriterion("sys_user_qq_id not like", value, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdIn(List<String> values) {
            addCriterion("sys_user_qq_id in", values, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdNotIn(List<String> values) {
            addCriterion("sys_user_qq_id not in", values, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdBetween(String value1, String value2) {
            addCriterion("sys_user_qq_id between", value1, value2, "sysUserQqId");
            return (Criteria) this;
        }

        public Criteria andSysUserQqIdNotBetween(String value1, String value2) {
            addCriterion("sys_user_qq_id not between", value1, value2, "sysUserQqId");
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