package com.dream.libra.po;

import lombok.Data;

import java.util.Date;

@Data
public class Question {

    private Long id;

    private Long questionId;

    private Byte type;

    private Byte state;

    private String stem;

    private String explain;

    private Byte difficulty;

    private Integer version;

    private Date ctime;

    private Date mtime;

    private Byte deleted;
}
