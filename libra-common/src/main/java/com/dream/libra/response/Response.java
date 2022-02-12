package com.dream.libra.response;

import java.io.Serializable;

/**
 * @author hanjiawei004@ke.com
 * @summary
 */
public class Response<T> implements Serializable {

    private Long code;

    private String message;

    private T data;
}
