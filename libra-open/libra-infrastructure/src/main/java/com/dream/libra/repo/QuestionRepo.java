package com.dream.libra.repo;

import com.dream.libra.dao.QuestionDao;
import com.dream.libra.po.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionRepo {

    @Autowired
    private QuestionDao questionDao;

    public Question get(Integer questionId){
        return questionDao.get(questionId);
    }
}
