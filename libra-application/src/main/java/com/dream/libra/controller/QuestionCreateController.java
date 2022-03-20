package com.dream.libra.controller;

import com.dream.libra.api.question.QuestionCreateApi;
import com.dream.libra.biz.QuestionBizService;
import com.dream.libra.cmd.QuestionCreateCMD;
import com.dream.libra.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class QuestionCreateController implements QuestionCreateApi {

    @Autowired
    private QuestionBizService questionBizService;

    @Override
    public Response<Integer> create(@RequestBody @Valid QuestionCreateCMD createCMD) {
        questionBizService.create(createCMD);
        return new Response<>(0);
    }

    @Override
    public Response<Integer> createByExcel() {
        return null;
    }
}
