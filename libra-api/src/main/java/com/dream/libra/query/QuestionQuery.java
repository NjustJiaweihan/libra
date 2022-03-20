package com.dream.libra.query;

import com.dream.libra.enums.QuestionQueryField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
public class QuestionQuery implements Serializable {

    @NotNull
    @ApiModelProperty("题目id")
    private Integer questionId;

    /**
     * @see QuestionQueryField
     */
    @NotNull
    @ApiModelProperty("题目附属信息可选值")
    private List<String> fields;
}
