package com.yasaka.stock.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_yasaka_users")
public class User extends IDEntity {
    /**
     * 用户账号
     */
    @Column(unique = true)
    private String username;

    /**
     * 用户密码
     */
    @JsonIgnore
    @JSONField(serialize = false)
    private String password = "";

    /**
     * 用户昵称
     */
    private String nickName = "";


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
