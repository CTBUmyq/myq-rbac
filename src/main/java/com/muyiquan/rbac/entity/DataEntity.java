package com.muyiquan.rbac.entity;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "返回结果",description = "通Entity，返回简单结果，带数据")
public class DataEntity extends BaseEntity {

    private static final long serialVersionUID = -3539057267566598504L;
    /*
     *返回数据
     */
    private Object data;

    public DataEntity(){}

    public DataEntity(boolean bResult, String msg) {
        super(bResult, msg);
    }

    public DataEntity(boolean bResult, String msg, Object data) {
        super(bResult, msg);
        this.data = data;
    }

    public DataEntity(int code, String msg, Object data) {
        super(code, msg);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
