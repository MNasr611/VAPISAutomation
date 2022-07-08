package StepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import models.response.TestGetResponseModel;
import objects.TestGetQueryParams;
import utils.TestGetUtils;

public class TestGetStepDef {
    TestGetResponseModel testGetResponseModel;
    TestGetQueryParams testGetQueryParams = new TestGetQueryParams();
    TestGetUtils testGetUtils = new TestGetUtils();


    @Given("Create Multiple QueryParams For Get Request")
    public void createQueryParamsForGetRequest(DataTable queryParameters) throws Throwable {
        testGetQueryParams.createQueryParamsForGetRequest(queryParameters);
    }

    @Given("Create QueryParam {string} and {string} For Get Request")
    public void creategetpayloadAnd(String key, String value) {
        testGetQueryParams.createQueryPayload(key, value);
    }


    @Then("Get TestGet positiveScenario")
    public void getTestGetPositiveScenario() {
        testGetResponseModel = testGetUtils.callTestGetWithQueryParams(testGetQueryParams.getQueryParams());
        System.out.println("queryParams =   " + testGetQueryParams.getQueryParams());
        System.out.println(testGetResponseModel.url);
    }


}



