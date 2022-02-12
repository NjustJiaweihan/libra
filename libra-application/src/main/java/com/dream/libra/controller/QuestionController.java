package com.dream.libra.controller;

import com.dream.libra.api.question.QuestionApi;
import com.dream.libra.dto.QuestionDTO;
import com.dream.libra.query.QuestionQuery;
import com.dream.libra.response.Response;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController implements QuestionApi {

    @Override
    public Response<QuestionDTO> get(QuestionQuery query) {
        return new Response<>();
    }
}
