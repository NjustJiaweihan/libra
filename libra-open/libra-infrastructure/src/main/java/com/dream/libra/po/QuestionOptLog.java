package com.dream.libra.po;

import lombok.Data;

import java.util.Date;

@Data
public class QuestionOptLog {

    private Long id;

    private int questionId;

    private String optUser;

    private String optContent;

    private String optType;

    private Date optTime;

    private Date ctime;

    private Date mtime;
}
