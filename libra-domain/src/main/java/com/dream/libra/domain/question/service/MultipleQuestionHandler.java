package com.dream.libra.domain.question.service;

import com.dream.libra.enums.QuestionType;
import com.dream.libra.domain.question.entity.QuestionEntity;
import org.springframework.stereotype.Service;

@Service
public class MultipleQuestionHandler extends AbstractQuestionService{

    @Override
    public boolean support(Byte type) {
        return QuestionType.MULTIPLE.code.equals(type);
    }

    @Override
    public void validate(QuestionEntity question) {

    }
}
