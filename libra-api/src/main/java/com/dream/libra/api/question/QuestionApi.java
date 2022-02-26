package com.dream.libra.api.question;

import com.dream.libra.dto.QuestionInfoDTO;
import com.dream.libra.query.QuestionQuery;
import com.dream.libra.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Api("QuestionApi")
@RequestMapping("/question")
public interface QuestionApi {

    @ApiImplicitParams({
            @ApiImplicitParam(name = "query", value = "query", required = true, dataType = "QuestionQuery", paramType = "body")
    })
    @PostMapping(value = "/get")
    Response<QuestionInfoDTO> get(@RequestBody QuestionQuery query);
}
