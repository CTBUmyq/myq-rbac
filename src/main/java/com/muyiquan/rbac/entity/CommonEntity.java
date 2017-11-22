package com.muyiquan.rbac.entity;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "返回结果",description = "通用Entity，返回简单结果")
public class CommonEntity extends  BaseEntity{

    private static final long serialVersionUID = -8903269910195009558L;

    public CommonEntity() {
    }

    public CommonEntity(boolean bResult, String msg) {
        super(bResult, msg);
    }

    public CommonEntity(int code, String msg) {
        super(code, msg);
    }
}
