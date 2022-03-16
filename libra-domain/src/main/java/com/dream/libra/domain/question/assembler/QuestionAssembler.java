package com.dream.libra.domain.question.assembler;

import com.dream.libra.dto.QuestionDTO;
import com.dream.libra.po.Question;

public class QuestionAssembler {

    public static QuestionDTO assembleQuestionDTO(Question question){
        QuestionDTO target = new QuestionDTO();

        target.setQuestionId(question.getQuestionId());
        return target;
    }
}
