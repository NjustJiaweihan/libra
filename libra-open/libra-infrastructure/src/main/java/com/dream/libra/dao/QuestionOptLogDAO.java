package com.dream.libra.dao;

import com.dream.libra.po.QuestionOptLog;
import com.dream.libra.po.QuestionOptLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * QuestionOptLogDAO继承基类
 */
@Mapper
@Repository
public interface QuestionOptLogDAO extends MyBatisBaseDao<QuestionOptLog, Long, QuestionOptLogExample> {
}