package com.cdwebservice.example.acceptancetests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

@Tag("API")
public class GreetingCheck {
        @BeforeEach
        public void setup() {
            RestAssured.baseURI = "http://localhost";
            RestAssured.port = 8082;
        }

        @Test
        public void callGreetingEndpoint_ShouldReturn200_HelloWorldBody() {
            given()
                    .contentType(ContentType.JSON)
                    .pathParam("id", "hello")

                    .when()
                    .get("greeting/{id}")

                    .then()
                    .statusCode(200)
                    .body("content", equalTo("Hello, World!"));
        }

    }


