package com.dream.libra.po;

import lombok.Data;

import java.util.Date;

@Data
public class QuestionOption {

    private Long id;

    private Integer questionId;

    private String option;

    private Byte right;

    private Character symbol;

    private Date ctime;

    private Date mtime;

    private Byte deleted;
}
