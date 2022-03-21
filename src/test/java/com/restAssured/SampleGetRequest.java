package com.restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class SampleGetRequest {
	@Test
	public void getRequestExample() {
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		
		ResponseBody responseBody = response.body();
		
		System.out.println(responseBody.asPrettyString());
	}
}
