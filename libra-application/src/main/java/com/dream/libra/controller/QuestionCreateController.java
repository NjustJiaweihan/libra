package com.dream.libra.controller;

import com.dream.libra.api.question.QuestionCreateApi;
import com.dream.libra.response.Response;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionCreateController implements QuestionCreateApi {

    @Override
    public Response<Integer> create() {
        return null;
    }

    @Override
    public Response<Integer> createByExcel() {
        return null;
    }
}
