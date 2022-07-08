package utils;

import enums.Endpoints;
import models.response.TestGetResponseModel;
import restwrapper.Headers;
import restwrapper.RestWrapper;

import java.util.Map;

public class TestGetUtils {
    public TestGetResponseModel callTestGetWithQueryParams(Map<String, String> queryParams)  {
        return RestWrapper.restGet(Endpoints.TESTGET, Headers.generalHeaders() , queryParams , TestGetResponseModel.class);
    }
}
