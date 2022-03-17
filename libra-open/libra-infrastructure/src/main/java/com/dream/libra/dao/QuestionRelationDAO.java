package com.dream.libra.dao;

import com.dream.libra.po.QuestionRelation;
import com.dream.libra.po.QuestionRelationExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * QuestionRelationDAO继承基类
 */
@Mapper
@Repository
public interface QuestionRelationDAO extends MyBatisBaseDao<QuestionRelation, Long, QuestionRelationExample> {
}