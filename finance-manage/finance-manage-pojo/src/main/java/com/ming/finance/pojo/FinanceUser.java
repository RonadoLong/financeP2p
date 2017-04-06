package com.ming.finance.pojo;

import java.io.Serializable;
import java.util.Date;

public class FinanceUser implements Serializable {
    private Long sysUserId;

    private String sysUserLoginName;

    private String sysUserLoginPassword;

    private String sysUserStatus;

    private String sysUserIsDelete;

    private Date sysUserRegisterDatetime;

    private String sysUserSex;

    private String sysUserPayPasswrod;

    private String sysUserIcon;

    private String sysUserRealName;

    private String sysUserEmail;

    private String sysUserMobile;

    private String sysUserWeiboId;

    private String sysUserQqId;

    private static final long serialVersionUID = 1L;

    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSysUserLoginName() {
        return sysUserLoginName;
    }

    public void setSysUserLoginName(String sysUserLoginName) {
        this.sysUserLoginName = sysUserLoginName == null ? null : sysUserLoginName.trim();
    }

    public String getSysUserLoginPassword() {
        return sysUserLoginPassword;
    }

    public void setSysUserLoginPassword(String sysUserLoginPassword) {
        this.sysUserLoginPassword = sysUserLoginPassword == null ? null : sysUserLoginPassword.trim();
    }

    public String getSysUserStatus() {
        return sysUserStatus;
    }

    public void setSysUserStatus(String sysUserStatus) {
        this.sysUserStatus = sysUserStatus == null ? null : sysUserStatus.trim();
    }

    public String getSysUserIsDelete() {
        return sysUserIsDelete;
    }

    public void setSysUserIsDelete(String sysUserIsDelete) {
        this.sysUserIsDelete = sysUserIsDelete == null ? null : sysUserIsDelete.trim();
    }

    public Date getSysUserRegisterDatetime() {
        return sysUserRegisterDatetime;
    }

    public void setSysUserRegisterDatetime(Date sysUserRegisterDatetime) {
        this.sysUserRegisterDatetime = sysUserRegisterDatetime;
    }

    public String getSysUserSex() {
        return sysUserSex;
    }

    public void setSysUserSex(String sysUserSex) {
        this.sysUserSex = sysUserSex == null ? null : sysUserSex.trim();
    }

    public String getSysUserPayPasswrod() {
        return sysUserPayPasswrod;
    }

    public void setSysUserPayPasswrod(String sysUserPayPasswrod) {
        this.sysUserPayPasswrod = sysUserPayPasswrod == null ? null : sysUserPayPasswrod.trim();
    }

    public String getSysUserIcon() {
        return sysUserIcon;
    }

    public void setSysUserIcon(String sysUserIcon) {
        this.sysUserIcon = sysUserIcon == null ? null : sysUserIcon.trim();
    }

    public String getSysUserRealName() {
        return sysUserRealName;
    }

    public void setSysUserRealName(String sysUserRealName) {
        this.sysUserRealName = sysUserRealName == null ? null : sysUserRealName.trim();
    }

    public String getSysUserEmail() {
        return sysUserEmail;
    }

    public void setSysUserEmail(String sysUserEmail) {
        this.sysUserEmail = sysUserEmail == null ? null : sysUserEmail.trim();
    }

    public String getSysUserMobile() {
        return sysUserMobile;
    }

    public void setSysUserMobile(String sysUserMobile) {
        this.sysUserMobile = sysUserMobile == null ? null : sysUserMobile.trim();
    }

    public String getSysUserWeiboId() {
        return sysUserWeiboId;
    }

    public void setSysUserWeiboId(String sysUserWeiboId) {
        this.sysUserWeiboId = sysUserWeiboId == null ? null : sysUserWeiboId.trim();
    }

    public String getSysUserQqId() {
        return sysUserQqId;
    }

    public void setSysUserQqId(String sysUserQqId) {
        this.sysUserQqId = sysUserQqId == null ? null : sysUserQqId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysUserId=").append(sysUserId);
        sb.append(", sysUserLoginName=").append(sysUserLoginName);
        sb.append(", sysUserLoginPassword=").append(sysUserLoginPassword);
        sb.append(", sysUserStatus=").append(sysUserStatus);
        sb.append(", sysUserIsDelete=").append(sysUserIsDelete);
        sb.append(", sysUserRegisterDatetime=").append(sysUserRegisterDatetime);
        sb.append(", sysUserSex=").append(sysUserSex);
        sb.append(", sysUserPayPasswrod=").append(sysUserPayPasswrod);
        sb.append(", sysUserIcon=").append(sysUserIcon);
        sb.append(", sysUserRealName=").append(sysUserRealName);
        sb.append(", sysUserEmail=").append(sysUserEmail);
        sb.append(", sysUserMobile=").append(sysUserMobile);
        sb.append(", sysUserWeiboId=").append(sysUserWeiboId);
        sb.append(", sysUserQqId=").append(sysUserQqId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}