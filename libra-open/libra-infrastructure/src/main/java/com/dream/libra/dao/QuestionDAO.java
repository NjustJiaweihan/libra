package com.dream.libra.dao;

import com.dream.libra.po.Question;
import com.dream.libra.po.QuestionExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * QuestionDAO继承基类
 */
@Mapper
@Repository
public interface QuestionDAO extends MyBatisBaseDao<Question, Long, QuestionExample> {
}