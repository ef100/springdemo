package com.gateluck.model;

import java.util.Date;

/**
 * Created by cef on 16/6/11.
 */
public class UserInfo {
    private int userId;
    private String userName;
    private Date birthday;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
