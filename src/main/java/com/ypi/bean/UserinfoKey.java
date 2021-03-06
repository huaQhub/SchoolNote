package com.ypi.bean;

public class UserinfoKey {
    private Integer id;

    private String userName;

    public UserinfoKey() {
    }

    public UserinfoKey(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}