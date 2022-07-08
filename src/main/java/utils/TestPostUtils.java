package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import enums.Endpoints;
import models.response.TestPostResponseModel;
import objects.TestPostRequestbody;
import restwrapper.Headers;
import restwrapper.RestWrapper;


public class TestPostUtils {
    static TestPostRequestbody testPostRequestbody = new TestPostRequestbody();
    public static TestPostResponseModel callTestPost() throws JsonProcessingException {
        return RestWrapper.restPost(Endpoints.TESTPOST, Headers.generalHeaders() , testPostRequestbody.getBody() , TestPostResponseModel.class);
    }
    public static TestPostResponseModel callTestPostNegativeScenarios(String helloY, String helloX) throws JsonProcessingException {
        return RestWrapper.restPost(Endpoints.TESTPOST, Headers.generalHeaders() , testPostRequestbody.getBody(helloY,helloX) , TestPostResponseModel.class);
    }

}
