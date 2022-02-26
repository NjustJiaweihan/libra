package com.dream.libra.po;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionOption extends BasePO {

    private Long questionId;

    private String item;

    private Byte right;

    private Character symbol;
}
