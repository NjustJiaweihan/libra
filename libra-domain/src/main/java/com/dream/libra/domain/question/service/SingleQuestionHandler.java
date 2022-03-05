package com.dream.libra.domain.question.service;

import com.dream.libra.enums.QuestionType;
import com.dream.libra.domain.question.entity.QuestionEntity;
import com.dream.libra.po.QuestionOption;
import com.dream.libra.po.QuestionProperty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingleQuestionHandler extends AbstractQuestionService{

    @Override
    public boolean support(Byte type) {
        return QuestionType.SINGLE.code.equals(type);
    }

    @Override
    public void validate(QuestionEntity question) {

        // 校验选项
        List<QuestionOption> optionList = question.getOptionList();
        long rightCount = optionList.stream().filter(option -> option.getRight()==1).count();
        if(rightCount == 1 || optionList.size() < 3 || optionList.size() > 8){
            throw new RuntimeException();
        }

        // 校验属性
        List<QuestionProperty> propertyList = question.getPropertyList();
    }
}
