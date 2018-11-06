package com.yasaka.stock.model;

public class User {
    private String id;

    private String username;

    /**
     * 用户密码
     */
    private String password = "";

    /**
     * 用户昵称
     */
    private String nickName = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
