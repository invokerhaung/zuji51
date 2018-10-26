package com.wulee.administrator.zuji.database.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import java.io.Serializable;

/**
 * Entity mapped to table "NewFriend_TABLE".
 */
public class NewFriendInfo implements Serializable{

    private Long id;
    private String uid;
    private String msg;
    private String name;
    private String address;
    private String avatar;
    private Integer status;
    private Long time;

    public NewFriendInfo() {
    }

    public NewFriendInfo(Long id, String uid, String msg, String name, String address, String avatar, Integer status, Long time) {
        this.id = id;
        this.uid = uid;
        this.msg = msg;
        this.name = name;
        this.address = address;
        this.avatar = avatar;
        this.status = status;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

}