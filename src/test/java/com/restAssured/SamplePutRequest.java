package com.restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SamplePutRequest {
	
	@Test
	private void putRequestExamle() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "poppupulla");
		jsonObject.put("job", "arivupullaAzhagupulla");
		
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.given().when().body(jsonObject.toJSONString()).put("/api/users/2").then().statusCode(200);
		
	}
}
