package com.dream.libra.dao;

import com.dream.libra.po.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao {

    Question get(Integer questionId);

    int insert(Question question);
}
