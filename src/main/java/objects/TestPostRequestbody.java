package objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import helpers.CleanObject;
import io.cucumber.datatable.DataTable;
import models.request.TestPostRequestModel;

import java.util.HashMap;
import java.util.Map;

public class TestPostRequestbody {
    public static Map<String, String> body = new HashMap<String, String>();
    public static TestPostRequestModel testPostRequestModel = new TestPostRequestModel();


    public static void generatePayload(DataTable payload) {
        for (Map<Object, Object> data : payload.asMaps(String.class, String.class)) {
            body.put((String) data.get("payLoadKey"), (String) data.get("payLoadValue"));
        }
    }

    public static String getBody() throws JsonProcessingException {
        testPostRequestModel.helloY = body.get("helloY");
        testPostRequestModel.helloX = body.get("helloX");
        System.out.println("body   " + body);
        System.out.println("testPostRequestModel.helloX    " + testPostRequestModel.helloX);
        System.out.println("testPostRequestModel value is   " + testPostRequestModel);
        System.out.println("CleanObject.getCleanObject(testPostRequestModel)   " + CleanObject.getCleanObject(testPostRequestModel));
        return CleanObject.getCleanObject(testPostRequestModel);

    }

    public static String getBody(String helloY , String helloX) throws JsonProcessingException {
        testPostRequestModel.helloY = helloY;
        testPostRequestModel.helloX = helloX;
        return CleanObject.getCleanObject(testPostRequestModel);
    }




}
