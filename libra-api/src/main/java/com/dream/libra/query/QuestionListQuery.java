package com.dream.libra.query;

import com.dream.libra.enums.QuestionQueryField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class QuestionListQuery {

    @NotEmpty
    @ApiModelProperty("题目id")
    private List<Long> questionIdList;

    /**
     * @see QuestionQueryField
     */
    @NotNull
    @ApiModelProperty("题目附属信息可选值")
    private List<String> fields;
}
