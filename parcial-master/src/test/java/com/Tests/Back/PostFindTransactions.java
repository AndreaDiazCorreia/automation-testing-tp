package com.Tests.Back;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostFindTransactions {
    @Test
    public void test02() {

        given().auth()
                .basic("CathJeff", "Test123")
                .when()
                .post("https://parabank.parasoft.com/parabank/services_proxy/bank/transfer?fromAccountId=14121&toAccountId=14454&amount=10")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
