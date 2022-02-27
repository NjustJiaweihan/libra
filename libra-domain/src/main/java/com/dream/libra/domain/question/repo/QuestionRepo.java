package com.dream.libra.domain.question.repo;

import com.dream.libra.domain.question.utils.NullQuestion;
import com.dream.libra.po.Question;
import org.springframework.stereotype.Component;

@Component
public class QuestionRepo {

    public Question get(Long questionId){
        Question question = new Question();
        question.setQuestionId(questionId);
        return question;
    }

    public Question getNull(Long questionId){
        return new NullQuestion();
    }
}
