package com.dream.libra.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BizException extends RuntimeException{

    private Long code;
    private String msg;

    public BizException(Long code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
