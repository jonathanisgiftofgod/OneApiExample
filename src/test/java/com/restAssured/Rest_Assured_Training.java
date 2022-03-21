package com.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_Assured_Training {
	public void getRequest() {
		Response response = RestAssured.get("https://reqres.in/");
		int statusCode = response.statusCode();
		String statusLine = response.getStatusLine();
		System.out.println(statusCode);
		System.out.println(statusLine);
	}
	public static void main(String[] args) {
		Rest_Assured_Training r = new Rest_Assured_Training();
		r.getRequest();
	}
}
