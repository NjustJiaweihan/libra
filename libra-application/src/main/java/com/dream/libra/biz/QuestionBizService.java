package com.dream.libra.biz;
import java.util.Date;

import com.dream.libra.cmd.QuestionCreateCMD;
import com.dream.libra.constant.ErrorCode;
import com.dream.libra.domain.question.entity.QuestionEntity;
import com.dream.libra.domain.question.service.QuestionCoreService;
import com.dream.libra.domain.question.utils.QuestionUtils;
import com.dream.libra.dto.QuestionInfoDTO;
import com.dream.libra.po.Question;
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

    public void create(QuestionCreateCMD createCMD){
        Question question = new Question();
        question.setStem(createCMD.getStem());
        question.setType(createCMD.getType());
        question.setExplain(createCMD.getExplain());
        question.setBankId(1);
        question.setDifficulty((byte)0);
        question.setState((byte)0);

        questionCoreService.add(question);
    }
}
