package com.dream.libra.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class QuestionOptLog implements Serializable {

    private Long id;

    private Integer questionId;

    private Byte optType;

    private String optContent;

    private String optUser;

    private Date optTime;

    private Date ctime;

    private Date mtime;

    private static final long serialVersionUID = 1L;
}