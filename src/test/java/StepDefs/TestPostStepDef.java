package StepDefs;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import models.response.TestPostResponseModel;
import objects.AddPostRequestbody;
import objects.TestPostRequestbody;
import utils.TestPostUtils;


public class TestPostStepDef {
TestPostResponseModel testPostResponseModel ;
TestPostRequestbody testPostRequestbody ;
AddPostRequestbody addPostRequestbody ;

//    @Given("Create Payload For Post Request")
//    public void createPayloadForPostRequest(DataTable payload){
//        testPostRequestbody = new TestPostRequestbody();
//        TestPostRequestbody.generatePayload(payload);
//    }

    @Given("Create Payload For Post Request")
    public void createPayloadForPostRequest(DataTable payload ){
        addPostRequestbody = new AddPostRequestbody();
        addPostRequestbody.generatePayload(payload);
    }

    @Then("Get TestPost positiveScenario")
    public void getTestPost() throws JsonProcessingException {
        testPostResponseModel = TestPostUtils.callTestPost();
        System.out.println(testPostResponseModel.data);
        System.out.println(testPostResponseModel.data);

    }



    @Given("Create Payload {string} and {string} For Post Request")
    public void createPayloadAndForPostRequest(String helloY, String helloX) throws JsonProcessingException {
        testPostRequestbody = new TestPostRequestbody();
        testPostRequestbody.getBody(helloY,helloX);
        testPostResponseModel = TestPostUtils.callTestPostNegativeScenarios(helloY,helloX);
        System.out.println(testPostResponseModel.data);

    }


    @Then("Get TestPost negativeScenarios {string} and {string}")
    public void getTestPostNegativeScenariosAnd(String helloY, String helloX) throws JsonProcessingException {
        System.out.println(testPostResponseModel.data);
    }
}
