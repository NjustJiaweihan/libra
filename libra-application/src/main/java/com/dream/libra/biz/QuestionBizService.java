package com.dream.libra.biz;

import com.dream.libra.constant.ErrorCode;
import com.dream.libra.domain.question.entity.QuestionEntity;
import com.dream.libra.domain.question.service.QuestionCoreService;
import com.dream.libra.domain.question.utils.QuestionUtils;
import com.dream.libra.dto.QuestionInfoDTO;
import com.dream.libra.query.QuestionQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class QuestionBizService {

    @Autowired
    private QuestionCoreService questionCoreService;

    public QuestionInfoDTO query(QuestionQuery query) {
        QuestionEntity entity = questionCoreService.get(query.getQuestionId(), query.getFields());
        if(Objects.isNull(entity) || Objects.isNull(entity.getQuestion())){
            throw ErrorCode.QUESTION_NOT_EXIST.createException();
        }
        return QuestionUtils.convert(entity);
    }
}
