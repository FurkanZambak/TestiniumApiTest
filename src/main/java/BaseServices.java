import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public abstract class BaseServices {

    public RequestSpecification getReqSpec() {
        return new RequestSpecBuilder()
                .setBaseUri("https://api.trello.com")
                .addHeader("Content-Type", "")
                .addQueryParam("key", "31a12292a56bd7bbf7b03910f67b7a13")
                .addQueryParam("token", "788162e5e0d6b6e0d9514d681e252cc38f986948058d9df181c47a8d20f42950")
                .build();
    }

    public Response postService(String path, Map queryParams) {
        return RestAssured.given()
                .spec(getReqSpec())
                .queryParams(queryParams)
                .post(path);
    }

    public Response putService(String path, Map queryParams) {
        return RestAssured.given()
                .spec(getReqSpec())
                .queryParams(queryParams)
                .put(path);
    }

    public Response deleteService(String path) {
        return RestAssured.given()
                .spec(getReqSpec())
                .delete(path);
    }

    public Response getService(String path) {
        return RestAssured.given()
                .spec(getReqSpec())
                .get(path);
    }
}
