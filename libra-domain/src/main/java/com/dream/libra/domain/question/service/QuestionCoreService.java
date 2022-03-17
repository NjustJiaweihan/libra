package com.dream.libra.domain.question.service;

import com.dream.libra.constant.ErrorCode;
import com.dream.libra.domain.question.assembler.QuestionAssembler;
import com.dream.libra.domain.question.entity.QuestionEntity;
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
    private QuestionRepo questionRepo;

    @Autowired
    private QuestionOptionRepo questionOptionRepo;

    @Autowired
    private QuestionRelationRepo questionRelationRepo;

    @Autowired
    private List<AbstractQuestionService> questionHandlers;

    public QuestionInfoDTO get(QuestionQuery query){
        QuestionInfoDTO questionInfoDTO = new QuestionInfoDTO();
        questionInfoDTO.setQuestion(QuestionAssembler.assembleQuestionDTO(getOrThrow(query.getQuestionId())));

        // todo 异步方式 mono.zip和feature
        // 题目选项
        if(Boolean.TRUE.equals(query.getFields().contains(QuestionQueryField.OPTION.fieldName))){
            questionOptionRepo.get(query.getQuestionId());
        }

        // 题目属性
        if(Boolean.TRUE.equals(query.getFields().contains(QuestionQueryField.PROPERTY.fieldName))){
            questionRelationRepo.get(query.getQuestionId());
        }

        return questionInfoDTO;
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

    private Question getOrThrow(Integer questionId){
        Question question = questionRepo.get(questionId);
        if(Objects.isNull(question)){
            logger.error("题目不存在 questionId:{}", questionId)
                  .thenThrow(ErrorCode.QUESTION_NOT_EXIST.createException());
        }

        return question;
    }
}
