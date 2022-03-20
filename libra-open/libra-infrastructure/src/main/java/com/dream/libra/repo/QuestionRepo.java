package com.dream.libra.repo;

import com.dream.libra.dao.QuestionDAO;
import com.dream.libra.po.Question;
import com.dream.libra.po.QuestionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Random;

@Repository
public class QuestionRepo {

    @Autowired
    private QuestionDAO questionDao;

    public Question get(Integer questionId){
        QuestionExample example = new QuestionExample();
        example.createCriteria().andQuestionIdEqualTo(questionId);
        List<Question> questions = questionDao.selectByExample(example);
        return CollectionUtils.isEmpty(questions) ? null : questions.get(0);
    }

    public int insert(Question question){
        return questionDao.insertSelective(question);
    }
}
