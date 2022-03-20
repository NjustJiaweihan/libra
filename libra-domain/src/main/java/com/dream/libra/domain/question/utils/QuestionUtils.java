package com.dream.libra.domain.question.utils;

import com.dream.libra.domain.question.entity.QuestionEntity;
import com.dream.libra.dto.QuestionDTO;
import com.dream.libra.dto.QuestionInfoDTO;
import com.dream.libra.po.Question;

public class QuestionUtils {

    private QuestionUtils(){}

    public static QuestionDTO convert(Question question){
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setQuestionId(question.getQuestionId());
        questionDTO.setStem(question.getStem());
        questionDTO.setType(question.getType());
        questionDTO.setExplain(question.getExplain());
        questionDTO.setBankId(question.getBankId());
        questionDTO.setDifficulty(question.getDifficulty());
        questionDTO.setState(question.getState());
        return questionDTO;
    }

    public static QuestionInfoDTO convert(QuestionEntity entity){
        QuestionInfoDTO infoDTO = new QuestionInfoDTO();
        infoDTO.setQuestion(convert(entity.getQuestion()));

        return infoDTO;
    }
}
