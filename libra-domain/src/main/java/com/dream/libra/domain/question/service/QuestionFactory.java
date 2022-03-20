package com.dream.libra.domain.question.service;

import com.dream.libra.constant.ErrorCode;
import com.dream.libra.domain.question.entity.QuestionEntity;
import com.dream.libra.log.LibraLog;
import com.dream.libra.po.Question;
import com.dream.libra.repo.QuestionRepo;
import com.dream.libra.util.AbstractDomainFactory;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
public class QuestionFactory extends AbstractDomainFactory<QuestionEntity> {
    private final LibraLog logger = LibraLog.getInstance(LoggerFactory.getLogger(QuestionFactory.class));

    @Autowired
    private QuestionRepo questionRepo;

    public QuestionEntity get(Integer questionId, String...mods){
        Question question = questionRepo.get(questionId);
        if(Objects.isNull(question)) {
            return null;
        }
        QuestionEntity entity = new QuestionEntity();
        entity.setQuestion(question);
        return super.build(entity, mods);
    }
}
