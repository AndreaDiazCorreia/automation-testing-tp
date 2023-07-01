package com.Tests.Back;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetAccountActivityAll {
    String URL = "https://parabank.parasoft.com/parabank/services_proxy/bank/accounts/14121/transactions/month/All/type/All";
    Response response = given().auth().basic("CathJeff", "Test123")
            .when()
            .get(URL);

    @Test
    public void test01() {

        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }
    @Test
    public void test02() {

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
}
