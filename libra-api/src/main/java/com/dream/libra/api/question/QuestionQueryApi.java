package com.dream.libra.api.question;

import com.dream.libra.dto.QuestionInfoDTO;
import com.dream.libra.query.QuestionListQuery;
import com.dream.libra.query.QuestionQuery;
import com.dream.libra.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Api("QuestionQueryApi")
@RequestMapping("/query")
public interface QuestionQueryApi {

    @ApiImplicitParams({
            @ApiImplicitParam(name = "query", value = "query", required = true, dataType = "QuestionQuery", paramType = "body")
    })
    @PostMapping(value = "/question")
    Response<QuestionInfoDTO> get(@RequestBody @Valid QuestionQuery query);

    @ApiImplicitParams({
            @ApiImplicitParam(name = "query", value = "query", required = true, dataType = "QuestionListQuery", paramType = "body")
    })
    @PostMapping(value = "/questions")
    Response<List<QuestionInfoDTO>> list(@RequestBody @Valid QuestionListQuery query);
}
