package com.dream.libra.response;

import java.io.Serializable;

public class Response<T> implements Serializable {

    private static final Long SUCCESS_CODE = 0L;
    private static final String SUCCESS_MSG = "success";

    private Long code;
    private String message;
    private T data;

    public Response(Long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Response(T data){
        this(SUCCESS_CODE, SUCCESS_MSG, data);
    }
}
