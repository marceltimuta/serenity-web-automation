package common;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class RestAPI {

    private final RequestSpecification requestSpec;

    public RestAPI() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.demoblaze.com")
                .setContentType(ContentType.JSON)
                .build();
    }

    public void addProductToCart(String id, int prod_id) {
        JSONObject requestParams = new JSONObject();
        requestParams.put("cookie", "user=b5d47874-5b15-c7d8-11af-a021c8b3328c");
        requestParams.put("flag", false);
        requestParams.put("id", id);
        requestParams.put("prod_id", prod_id);

        requestSpec.body(requestParams.toJSONString());
        given(requestSpec).post("/addtocart");
    }

}
