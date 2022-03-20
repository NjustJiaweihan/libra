package com.dream.libra.dto;

import lombok.Data;

@Data
public class QuestionDTO {

    private Integer questionId;

    private String stem;

    private Byte type;

    private String explain;

    private Integer bankId;

    private Byte difficulty;

    private Byte state;
}
