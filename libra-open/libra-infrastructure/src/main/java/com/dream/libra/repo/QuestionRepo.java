package com.dream.libra.repo;

import com.dream.libra.dao.QuestionMapper;
import com.dream.libra.po.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionRepo {

    // @Autowired
    private QuestionMapper questionMapper;

    public Question get(Integer questionId){
        // return questionMapper.get(questionId);
        return null;
    }
}
