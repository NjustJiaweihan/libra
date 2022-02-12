package com.dream.libra.api.question;

import com.dream.libra.dto.QuestionDTO;
import com.dream.libra.query.QuestionQuery;
import com.dream.libra.response.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/question")
public interface QuestionApi {

    @PostMapping("/get")
    Response<QuestionDTO> get(@RequestBody QuestionQuery query);
}
