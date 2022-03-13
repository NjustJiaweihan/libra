package com.dream.libra.po;

import lombok.Data;

import java.util.Date;

@Data
public class QuestionRelation {

    private Long id;

    private Integer questionId;

    private Integer relationId;

    private Byte relationType;

    private Integer relationValue;

    private Date ctime;

    private Date mtime;

    private Byte deleted;
}
