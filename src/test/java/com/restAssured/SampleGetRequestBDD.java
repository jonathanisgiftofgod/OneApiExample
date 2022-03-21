package com.restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class SampleGetRequestBDD {
	@Test
	public void getRequestExample() {
		RestAssured.baseURI = "https://reqres.in/api/";
		Response response = RestAssured.given().param("", "").header("","").when().get("/users/3");
		System.out.println(response.asPrettyString());
	}
}
