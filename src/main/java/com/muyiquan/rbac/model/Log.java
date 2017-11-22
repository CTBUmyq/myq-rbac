package com.muyiquan.rbac.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Log implements Serializable {
    private Integer id;

    private Integer opId;

    private Short opType;

    private String content;

    private Date opTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public Short getOpType() {
        return opType;
    }

    public void setOpType(Short opType) {
        this.opType = opType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }
}