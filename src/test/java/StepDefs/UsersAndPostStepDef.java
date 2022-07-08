package StepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import models.response.AddPostResponseModel;
import models.response.GetPostsResponseModel;
import models.response.GetUsersResponseModel;
import objects.TestGetQueryParams;
import org.junit.Assert;
import utils.AddPostsUtils;
import utils.GetPostsUtils;
import utils.GetUsersUtils;

public class UsersAndPostStepDef {
    GetUsersResponseModel[] getUsersResponseModel;
    GetPostsResponseModel getPostsResponseModel ;
    AddPostResponseModel addPostResponseModel ;

    int userId ;
    TestGetQueryParams testGetQueryParams = new TestGetQueryParams();
    GetUsersUtils getUsersUtils = new GetUsersUtils();
    GetPostsUtils getPostsUtils = new GetPostsUtils();
    @Then("Get Users")
    public void getUsers() {
        getUsersResponseModel = getUsersUtils.callGetUsers(testGetQueryParams.getQueryParams());
        System.out.println("The User Email Is : " + getUsersResponseModel[0].email);
    }

    @Then("Get Posts For The User")
    public void validateThatTheIsIntegerBetweenAnd() {
        userId = getUsersResponseModel[0].id;
        getPostsResponseModel = getPostsUtils.callGetPosts(testGetQueryParams.getQueryParams(), "/" + String.valueOf(userId));
    }

    @Then("Validate That The PostId Is Integer Between {int} and {int}")
    public void validateThatTheIdIsIntegerBetweenAnd(int start, int end) {
        getPostsUtils.validateIdStartAndEnd(getPostsResponseModel,start,end);
    }


    @And("Add New Post")
    public void addNewPost() throws JsonProcessingException {
        addPostResponseModel = AddPostsUtils.addNewPost(String.valueOf(userId));
    }

    @Then("Validate That the Post Added Successfully")
    public void validateThatThePostAddedSuccessfully(){
        String actualTitle = "APIs Automation";
        String expectedTitle = addPostResponseModel.title;
        Assert.assertEquals(actualTitle , expectedTitle);
    }

}
