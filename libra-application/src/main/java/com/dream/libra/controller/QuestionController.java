package com.dream.libra.controller;

import com.dream.libra.api.question.QuestionApi;
import com.dream.libra.response.Response;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController implements QuestionApi {

    @Override
    public Response<Integer> update() {
        return null;
    }

    @Override
    public Response<Integer> delete() {
        return null;
    }
}
