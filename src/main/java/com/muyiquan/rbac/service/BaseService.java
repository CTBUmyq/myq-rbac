package com.muyiquan.rbac.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseService {
    /*
     *日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());

    /*
     * 打印调试日志
     *
     * @param debugMsg
     * @param paramter
     */
    protected void  debug(String debugMsg,Object... parameter){
        if (logger.isDebugEnabled()){
            logger.debug(debugMsg,parameter);
        }
    }
}
