package dev.rpmhub;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ServiceATest {

    @Test
    public void testOk() {
        given()
        .when().get("/servicea/person/Rodrigo")
        .then()
           .statusCode(200);
    }

    @Test
    public void testPersonObject() {
        given()
        .when().get("/servicea/person/Rodrigo")
        .then()
           .statusCode(200)
           .body(is("{\"name\":\"Rodrigo\"}"));
    }
}
