package com.restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SamplePostRequest {
	@Test
	public void postRequestExample() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "poppu");
		jsonObject.put("job", "StudyGameHappy");
		System.out.println(jsonObject.toString());
		
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.given().header("","").param("", "").body(jsonObject.toJSONString()).
		post("api/users/2").then().statusCode(201);
	}
}
