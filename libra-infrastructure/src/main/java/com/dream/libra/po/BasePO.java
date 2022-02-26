package com.dream.libra.po;

import lombok.Data;

import java.util.Date;

@Data
public class BasePO {

    protected Long id;

    protected Date ctime;

    protected Date mtime;

    protected Byte deleted;
}
