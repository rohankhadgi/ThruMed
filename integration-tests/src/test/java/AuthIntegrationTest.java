import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class AuthIntegrationTest {

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "http://localhost:4200";
    }

    @Test
    public void shouldReturnOKWithValidToken() {
        ValidatableResponse token = IntegrationTestHelper.getToken();

        Response response = token
                .statusCode(200)
                .body("token", notNullValue())
                .extract()
                .response();

        System.out.println("Generated Token: " + response.jsonPath().getString("token"));
    }

    @Test
    public void shouldReturnUnauthorizedOnInvalidToken() {
        String loginPayload = """
                    {
                        "email" : "testuser_invalid@test.com",
                        "password" : "wrongpassword"
                    }
                """;

        given().contentType("application/json").body(loginPayload).when().post("/auth/login").then().statusCode(401);
    }
}
