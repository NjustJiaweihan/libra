package com.dream.libra.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QuestionRelation implements Serializable {

    private Long id;

    private Integer questionId;

    private Integer relationId;

    private Byte relationType;

    private String relationValue;

    private Date ctime;

    private Date mtime;

    private Byte deleted;

    private static final long serialVersionUID = 1L;
}