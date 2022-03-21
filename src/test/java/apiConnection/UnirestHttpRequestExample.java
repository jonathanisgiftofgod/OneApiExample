package apiConnection;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestHttpRequestExample {
	public void getRequestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.get("https://reqres.in/api/users?page=2").asJson();
		System.out.println("Status code : " + jsonResponse.getStatus());
		System.out.println("Status Message : " + jsonResponse.getStatusText());
		System.out.println("Response Body : " + jsonResponse.getBody());
	}
	public void postRequestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.post("https://reqres.in/api/users").body("{\r\n" + 
				"    \"name\": \"jonathan\",\r\n" + 
				"    \"job\": \"leader\",\r\n" + 
				"    \"id\": \"212\",\r\n" + 
				"    \"createdAt\": \"2022-02-28T16:21:03.817Z\"\r\n" + 
				"}").asJson();
		System.out.println("Status code : " + jsonResponse.getStatus());
		System.out.println("Status Message : " + jsonResponse.getStatusText());
		System.out.println("Response Body : " + jsonResponse.getBody());
	}
	public void putRequestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.put("https://reqres.in/api/users/549").body("{\r\n" + 
				"    \"name\": \"jonathan nancy\",\r\n" + 
				"    \"job\": \"leader\",\r\n" + 
				"    \"id\": \"212\",\r\n" + 
				"    \"createdAt\": \"2022-02-28T16:21:03.817Z\"\r\n" + 
				"}").asJson();
		System.out.println("Status code : " + jsonResponse.getStatus());
		System.out.println("Status Message : " + jsonResponse.getStatusText());
		System.out.println("Response Body : " + jsonResponse.getBody());
	}
	public void deleteRequestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.delete("https://reqres.in/api/users/549").asJson();
		System.out.println("Status code : " + jsonResponse.getStatus());
		System.out.println("Status Message : " + jsonResponse.getStatusText());
		System.out.println("Response Body : " + jsonResponse.getBody());
	}
	public static void main(String[] args) throws UnirestException {
		UnirestHttpRequestExample u = new UnirestHttpRequestExample();
		//u.getRequestExample();
		//u.postRequestExample();
		//u.putRequestExample();
		u.deleteRequestExample();
	}
}
