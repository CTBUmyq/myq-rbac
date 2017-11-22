package com.muyiquan.rbac.model;

import java.io.Serializable;

public class TokenModel implements Serializable {

    private static final long serialVersionUID = 7740182507558894421L;

    //用户id
    private int userId;

    //随机生成的uuid
    private  String token;

    public  TokenModel(int userId,String token){
        this.userId = userId;
        this.token = token;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
