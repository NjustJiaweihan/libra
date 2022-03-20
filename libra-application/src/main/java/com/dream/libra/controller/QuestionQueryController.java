package com.dream.libra.controller;

import com.dream.libra.api.question.QuestionQueryApi;
import com.dream.libra.biz.QuestionBizService;
import com.dream.libra.dto.QuestionInfoDTO;
import com.dream.libra.query.QuestionListQuery;
import com.dream.libra.query.QuestionQuery;
import com.dream.libra.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class QuestionQueryController implements QuestionQueryApi {

    @Autowired
    private QuestionBizService questionBizService;

    @Override
    public Response<QuestionInfoDTO> get(@RequestBody @Valid QuestionQuery query) {
        return new Response<>(questionBizService.query(query));
    }

    @Override
    public Response<List<QuestionInfoDTO>> list(@RequestBody @Valid QuestionListQuery query) {
        return null;
    }
}
