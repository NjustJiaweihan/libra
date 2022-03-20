package com.dream.libra.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class QuestionOption implements Serializable {

    private Long id;

    private String option;

    private Byte right;

    private String symbol;

    private Integer questionId;

    private Date ctime;

    private Date mtime;

    private Byte deleted;

    private static final long serialVersionUID = 1L;
}