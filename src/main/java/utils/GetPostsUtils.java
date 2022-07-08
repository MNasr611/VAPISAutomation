package utils;

import enums.Endpoints;
import models.response.GetPostsResponseModel;
import models.response.GetUsersResponseModel;
import org.junit.Assert;
import restwrapper.Headers;
import restwrapper.RestWrapper;

import java.util.Map;

public class GetPostsUtils {
    int postId ;
    public GetPostsResponseModel callGetPosts(Map<String, String> queryParams , String pathParameter)  {
        return RestWrapper.restGetWithPathParameter(Endpoints.POSTS, Headers.generalHeaders() , queryParams ,pathParameter, GetPostsResponseModel.class);
    }

    public void validateIdStartAndEnd(GetPostsResponseModel getPostsResponseModel, int start, int end){
        postId = getPostsResponseModel.id;
        Assert.assertTrue( postId >= start && postId <= end );
    }
}
