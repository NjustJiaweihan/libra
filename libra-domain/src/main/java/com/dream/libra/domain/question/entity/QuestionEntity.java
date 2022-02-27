package com.dream.libra.domain.question.entity;

import com.dream.libra.po.Question;
import com.dream.libra.po.QuestionOption;
import com.dream.libra.po.QuestionProperty;
import lombok.Data;

import java.util.List;

@Data
public class QuestionEntity {

    private Question question;

    private List<QuestionOption> optionList;

    private List<QuestionProperty> propertyList;
}
