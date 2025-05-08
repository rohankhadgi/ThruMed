import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class PatientIntegrationTest {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "http://localhost:4200";
    }

    @Test
    public void shouldReturnPatientsWithValidToken() {
        String token = IntegrationTestHelper.getToken().statusCode(200).extract().jsonPath().get("token");

        given().header("Authorization", "Bearer " + token).when().get("api/patients").then().statusCode(200).body("patients", notNullValue());
    }
}
