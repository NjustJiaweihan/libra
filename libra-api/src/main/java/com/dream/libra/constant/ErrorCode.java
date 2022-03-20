package com.dream.libra.constant;

import com.dream.libra.exception.BizException;

public enum ErrorCode {

    SERVICE_ERROR(1L, "service error"),
    QUESTION_NOT_EXIST(6000001L, "题目不存在"),
    ;

    public final Long code;
    public final String msg;

    ErrorCode(Long code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public BizException createException(){
        return new BizException(this.code, this.msg);
    }
}
