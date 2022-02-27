package com.dream.libra.controller;

import com.dream.libra.api.question.QuestionCacheApi;
import com.dream.libra.dto.QuestionInfoDTO;
import com.dream.libra.query.QuestionListQuery;
import com.dream.libra.query.QuestionQuery;
import com.dream.libra.response.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class QuestionCacheController implements QuestionCacheApi {

    @Override
    public Response<QuestionInfoDTO> get(@RequestBody QuestionQuery query) {
        return null;
    }

    @Override
    public Response<List<QuestionInfoDTO>> list(@Valid QuestionListQuery query) {
        return null;
    }
}
