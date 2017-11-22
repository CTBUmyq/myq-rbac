package com.muyiquan.rbac.entity;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable{
    /**
     *
     **/
    private static final long serialVersionUID = 6421458566622885165L;

    /*
     *0:表示成功；其它：失败
     */
    protected int code;

    /*
     *返回信息
     */
    protected  String msg;

    public BaseEntity(){
    }

    public BaseEntity(boolean bResult,String msg) {
        super();
        this.code = bResult?0:-1;
        this.msg = msg;
    }

    public BaseEntity(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
