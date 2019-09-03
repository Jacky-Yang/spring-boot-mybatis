package com.jakcy.examples.mybatis.generator.pojo;

public class User {
    private String id;

    private String creUserId;

    private String crtTime;

    private String crtUserName;

    private String uptTime;

    private String uptUserId;

    private String uptUserName;

    private String loginName;

    private String sex;

    private String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreUserId() {
        return creUserId;
    }

    public void setCreUserId(String creUserId) {
        this.creUserId = creUserId == null ? null : creUserId.trim();
    }

    public String getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(String crtTime) {
        this.crtTime = crtTime == null ? null : crtTime.trim();
    }

    public String getCrtUserName() {
        return crtUserName;
    }

    public void setCrtUserName(String crtUserName) {
        this.crtUserName = crtUserName == null ? null : crtUserName.trim();
    }

    public String getUptTime() {
        return uptTime;
    }

    public void setUptTime(String uptTime) {
        this.uptTime = uptTime == null ? null : uptTime.trim();
    }

    public String getUptUserId() {
        return uptUserId;
    }

    public void setUptUserId(String uptUserId) {
        this.uptUserId = uptUserId == null ? null : uptUserId.trim();
    }

    public String getUptUserName() {
        return uptUserName;
    }

    public void setUptUserName(String uptUserName) {
        this.uptUserName = uptUserName == null ? null : uptUserName.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", creUserId='" + creUserId + '\'' +
                ", crtTime='" + crtTime + '\'' +
                ", crtUserName='" + crtUserName + '\'' +
                ", uptTime='" + uptTime + '\'' +
                ", uptUserId='" + uptUserId + '\'' +
                ", uptUserName='" + uptUserName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", sex='" + sex + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}