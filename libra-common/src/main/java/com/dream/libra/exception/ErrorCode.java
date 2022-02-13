package com.dream.libra.exception;

public enum ErrorCode {

    SERVICE_ERROR(1L, "service error");

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
