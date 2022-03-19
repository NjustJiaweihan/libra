package com.dream.libra.api.question;

import com.dream.libra.response.Response;
import io.swagger.annotations.Api;

@Api("QuestionApi")
public interface QuestionApi {

    Response<Integer> update();

    Response<Integer> delete();
}
