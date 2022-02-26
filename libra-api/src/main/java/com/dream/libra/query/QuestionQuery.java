package com.dream.libra.query;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class QuestionQuery implements Serializable {

    @NotNull
    @ApiModelProperty("题目id")
    private Long questionId;

    /**
     * @see com.dream.libra.constant.QuestionQueryField
     */
    @NotNull
    @ApiModelProperty("题目附属信息可选值")
    private List<String> fields;
}
