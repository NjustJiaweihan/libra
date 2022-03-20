package com.dream.libra.domain.question.service;

import com.dream.libra.domain.question.entity.QuestionEntity;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractQuestionService {

    public abstract boolean support(Byte type);

    public abstract void validate(QuestionEntity question);
}
