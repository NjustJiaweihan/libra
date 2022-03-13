package com.dream.libra.dao;

import com.dream.libra.po.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionMapper {

    Question get(Integer questionId);

}
