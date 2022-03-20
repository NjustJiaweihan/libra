package com.dream.libra.domain.question.service;

import com.dream.libra.constant.ErrorCode;
import com.dream.libra.domain.question.entity.QuestionEntity;
import com.dream.libra.domain.question.utils.QuestionUtils;
import com.dream.libra.dto.QuestionInfoDTO;
import com.dream.libra.enums.QuestionQueryField;
import com.dream.libra.enums.QuestionType;
import com.dream.libra.log.LibraLog;
import com.dream.libra.po.Question;
import com.dream.libra.query.QuestionQuery;
import com.dream.libra.repo.QuestionOptionRepo;
import com.dream.libra.repo.QuestionRelationRepo;
import com.dream.libra.repo.QuestionRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class QuestionCoreService {

    private final LibraLog logger = LibraLog.getInstance(LoggerFactory.getLogger(QuestionCoreService.class));

    @Autowired
    private QuestionFactory questionFactory;

    @Autowired
    private List<AbstractQuestionService> questionHandlers;

    public QuestionEntity get(Integer questionId, List<String> mods){
        return questionFactory.get(questionId, mods.toArray(new String[0]));
    }

    public void validate(QuestionEntity question){
        if(! QuestionType.contain(question.getQuestion().getType())){
            logger.error("题目类型错误 question:{}", question)
                    .thenThrow(ErrorCode.SERVICE_ERROR.createException());
        }
        for (AbstractQuestionService questionHandler : questionHandlers) {
            if(questionHandler.support(question.getQuestion().getType())){
                questionHandler.validate(question);
            }
        }
    }
}
