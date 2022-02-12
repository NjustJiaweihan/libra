package com.dream.libra.controller;

import com.dream.libra.api.question.QuestionApi;
import com.dream.libra.dto.QuestionDTO;
import com.dream.libra.log.LibraLog;
import com.dream.libra.query.QuestionQuery;
import com.dream.libra.response.Response;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController implements QuestionApi {

    private final LibraLog logger = LibraLog.getInstance(LoggerFactory.getLogger(QuestionController.class));

    @Override
    public Response<QuestionDTO> get(QuestionQuery query) {
        return new Response<>();
    }
}
