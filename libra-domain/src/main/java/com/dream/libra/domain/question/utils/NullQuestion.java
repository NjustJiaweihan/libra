package com.dream.libra.domain.question.utils;

import com.dream.libra.po.Question;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NullQuestion extends Question {

    public boolean isNull(){
        return true;
    }

    public String getStem(){
        return "";
    }
}
