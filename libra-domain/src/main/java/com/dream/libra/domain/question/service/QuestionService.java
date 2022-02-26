package com.dream.libra.domain.question.service;

import com.dream.libra.constant.QuestionQueryField;
import com.dream.libra.domain.question.assembler.QuestionAssembler;
import com.dream.libra.domain.question.repo.QuestionOptionRepo;
import com.dream.libra.domain.question.repo.QuestionPropertyRepo;
import com.dream.libra.domain.question.repo.QuestionRepo;
import com.dream.libra.dto.QuestionInfoDTO;
import com.dream.libra.exception.ErrorCode;
import com.dream.libra.log.LibraLog;
import com.dream.libra.po.Question;
import com.dream.libra.query.QuestionQuery;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class QuestionService {

    private final LibraLog logger = LibraLog.getInstance(LoggerFactory.getLogger(QuestionService.class));

    @Autowired
    private QuestionRepo questionRepo;

    @Autowired
    private QuestionOptionRepo questionOptionRepo;

    @Autowired
    private QuestionPropertyRepo questionPropertyRepo;

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
            questionPropertyRepo.get(query.getQuestionId());
        }

        return questionInfoDTO;
    }

    private Question getOrThrow(Long questionId){
        Question question = questionRepo.get(questionId);
        if(Objects.isNull(question)){
            logger.error("题目不存在 questionId:{}", questionId)
                  .thenThrow(ErrorCode.QUESTION_NOT_EXIST.createException());
        }

        return question;
    }
}
