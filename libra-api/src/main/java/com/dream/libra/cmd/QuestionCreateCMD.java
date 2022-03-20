package com.dream.libra.cmd;

import com.dream.libra.enums.QuestionType;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class QuestionCreateCMD implements Serializable {

    @NotEmpty
    @ApiModelProperty("题干")
    private String stem;

    /**
     * @see QuestionType
     */
    @NotNull
    @ApiModelProperty("题型")
    private Byte type;

    @NotEmpty
    @ApiModelProperty("题解")
    private String explain;
}
