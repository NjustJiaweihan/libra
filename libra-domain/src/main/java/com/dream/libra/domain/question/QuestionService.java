package com.dream.libra.domain.question;

import com.dream.libra.constant.QuestionQueryField;
import com.dream.libra.exception.ErrorCode;
import com.dream.libra.log.LibraLog;
import com.dream.libra.query.QuestionQuery;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    private final LibraLog logger = LibraLog.getInstance(LoggerFactory.getLogger(QuestionService.class));

    public void get(QuestionQuery query){

        // 题目选项
        if(Boolean.TRUE.equals(query.getFields().contains(QuestionQueryField.OPTION.fieldName))){
            // todo
            logger.error("").thenThrow(ErrorCode.SERVICE_ERROR.createException());
        }
    }
}
