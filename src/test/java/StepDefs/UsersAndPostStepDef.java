package StepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import models.response.AddPostResponseModel;
import models.response.GetPostsResponseModel;
import models.response.GetUsersResponseModel;
import objects.AddPostRequestbody;
import objects.GetRequestQueryParams;
import org.junit.Assert;
import utils.AddPostsUtils;
import utils.GetPostsUtils;
import utils.GetUsersUtils;

public class UsersAndPostStepDef {
    GetUsersResponseModel[] getUsersResponseModel;
    GetPostsResponseModel getPostsResponseModel ;
    AddPostResponseModel addPostResponseModel ;
    AddPostRequestbody addPostRequestbody ;
    GetRequestQueryParams getRequestQueryParams = new GetRequestQueryParams();

    int userId ;
    GetUsersUtils getUsersUtils = new GetUsersUtils();
    GetPostsUtils getPostsUtils = new GetPostsUtils();
    @Then("Get Users")
    public void getUsers() {
        getUsersResponseModel = getUsersUtils.callGetUsers(getRequestQueryParams.getQueryParams());
        System.out.println("The User Email Is : " + getUsersResponseModel[0].email);
    }

    @Then("Get Posts For The User")
    public void validateThatTheIsIntegerBetweenAnd() {
        userId = getUsersResponseModel[0].id;
        getPostsResponseModel = getPostsUtils.callGetPosts(getRequestQueryParams.getQueryParams(), "/" + String.valueOf(userId));
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

    @Given("Create Payload For Post Request")
    public void createPayloadForPostRequest(DataTable payload ){
        addPostRequestbody = new AddPostRequestbody();
        addPostRequestbody.generatePayload(payload);
    }





    @Given("Create Multiple QueryParams For Get Request")
    public void createQueryParamsForGetRequest(DataTable queryParameters) throws Throwable {
        getRequestQueryParams.createQueryParamsForGetRequest(queryParameters);
    }

    @Given("Create QueryParam {string} and {string} For Get Request")
    public void creategetpayloadAnd(String key, String value) {
        getRequestQueryParams.createQueryPayload(key, value);
    }


}
