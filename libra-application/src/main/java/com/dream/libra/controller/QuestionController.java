package com.dream.libra.controller;

import com.dream.libra.api.question.QuestionApi;
import com.dream.libra.domain.question.service.QuestionService;
import com.dream.libra.dto.QuestionInfoDTO;
import com.dream.libra.log.LibraLog;
import com.dream.libra.query.QuestionListQuery;
import com.dream.libra.query.QuestionQuery;
import com.dream.libra.response.Response;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class QuestionController implements QuestionApi {

    @Autowired
    private QuestionService questionService;

    @Override
    public Response<QuestionInfoDTO> get(@RequestBody @Valid QuestionQuery query) {
        return new Response<>(questionService.get(query));
    }

    @Override
    public Response<List<QuestionInfoDTO>> list(@RequestBody @Valid QuestionListQuery query) {
        return null;
    }
}
