import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class IntegrationTestHelper {

    public static ValidatableResponse getToken() {
        String loginPayload = """
                    {
                        "email" : "testuser@test.com",
                        "password" : "password123"
                    }
                """;

        return given().contentType("application/json").body(loginPayload).when().post("/auth/login").then();
    }
}
