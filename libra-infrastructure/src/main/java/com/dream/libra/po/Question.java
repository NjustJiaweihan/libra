package com.dream.libra.po;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Question extends BasePO{

    private Long questionId;

    private Byte question_type;

    private Byte question_state;

    private String stem;

    private String explain;

    private Byte difficulty;

    private Long parent;

    private Integer version;
}
