package com.dream.libra.query;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class QuestionQuery implements Serializable {

    private Long questionId;

    /**
     * @see com.dream.libra.constant.QuestionQueryField
     */
    private List<String> fields;
}
