package com.dream.libra.api.question;

import com.dream.libra.response.Response;
import io.swagger.annotations.Api;

@Api("QuestionCreateApi")
public interface QuestionCreateApi {

    Response<Integer> create();

    Response<Integer> createByExcel();
}
