package com.dream.libra.po;

import com.dream.libra.utils.BasePO;
import com.dream.libra.utils.Null;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Question extends BasePO implements Null {

    private Long questionId;

    private Byte questionType;

    private Byte questionState;

    private String stem;

    private String explain;

    private Byte difficulty;

    private Long parent;

    private Integer version;

    public boolean isNull(){
        return false;
    }
}
