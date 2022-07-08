package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import enums.Endpoints;
import models.response.AddPostResponseModel;
import objects.AddPostRequestbody;
import restwrapper.Headers;
import restwrapper.RestWrapper;

public class AddPostsUtils {

    static AddPostRequestbody addPostRequestbody = new AddPostRequestbody();
    public static AddPostResponseModel addNewPost(String userId) throws JsonProcessingException {
        return RestWrapper.restPost(Endpoints.POSTS, Headers.generalHeaders() , addPostRequestbody.getBody(userId) , AddPostResponseModel.class);
    }
}
