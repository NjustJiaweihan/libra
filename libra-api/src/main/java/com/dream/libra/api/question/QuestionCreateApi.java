package com.dream.libra.api.question;

import com.dream.libra.cmd.QuestionCreateCMD;
import com.dream.libra.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Api("QuestionCreateApi")
@RequestMapping("/create")
public interface QuestionCreateApi {

    @ApiImplicitParams({
            @ApiImplicitParam(name = "createCMD", value = "createCMD", required = true, dataType = "QuestionCreateCMD", paramType = "body")
    })
    @PostMapping(value = "/question")
    Response<Integer> create(@RequestBody @Valid QuestionCreateCMD createCMD);

    Response<Integer> createByExcel();
}
