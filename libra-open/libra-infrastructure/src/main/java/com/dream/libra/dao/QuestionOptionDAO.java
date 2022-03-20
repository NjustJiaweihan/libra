package com.dream.libra.dao;

import com.dream.libra.po.QuestionOption;
import com.dream.libra.po.QuestionOptionExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * QuestionOptionDAO继承基类
 */
@Mapper
@Repository
public interface QuestionOptionDAO extends MyBatisBaseDao<QuestionOption, Long, QuestionOptionExample> {
}