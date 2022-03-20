package com.dream.libra.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Question implements Serializable {

    private Long id;

    private Integer questionId;

    private String stem;

    private Byte type;

    private String explain;

    private Integer bankId;

    private Byte difficulty;

    private Byte state;

    private Integer version;

    private Date ctime;

    private Date mtime;

    private Byte deleted;

    private static final long serialVersionUID = 1L;
}