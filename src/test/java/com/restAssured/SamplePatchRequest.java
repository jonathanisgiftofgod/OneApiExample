package com.restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SamplePatchRequest {
	
	@Test
	private void patchRequestExamle() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "poppupulla");
		jsonObject.put("job", "arivupullaAzhagupulla");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.given().when().body(jsonObject.toJSONString()).patch("/api/users/2").then().statusCode(200);
	}
	public void deleteRequestExample() {
		RestAssured.baseURI = "https://reqres.in/";
		
		RestAssured.given().header("","").when().delete("/api/users/2").then().statusCode(204);
	}
}
