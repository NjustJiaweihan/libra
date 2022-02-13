package com.dream.libra.exception;

public class BizException extends RuntimeException{

    private Long code;
    private String msg;

    BizException(Long code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
