package com.dream.libra.domain.question.service;

import com.dream.libra.constant.QuestionType;
import com.dream.libra.domain.question.entity.QuestionEntity;
import org.springframework.stereotype.Service;

@Service
public class JudgeQuestionHandler extends AbstractQuestionService{

    @Override
    public boolean support(Byte type) {
        return QuestionType.JUDGE.code.equals(type);
    }

    @Override
    public void validate(QuestionEntity question) {

    }
}
