package apiConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class HttpUrlConnectionExample {
	public void getMethodExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/employees"); 
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		
		connection.connect();
		int statusCode = connection.getResponseCode();
		System.out.println("Status code is : "+statusCode);
		
		String message = connection.getResponseMessage();
		System.out.println("message");
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		
		while((line=bufferReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	public void postMethodExample() throws IOException {
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonBody = "{\"name\":\"GBJ\", \"salary\":\"9876543510\", \"age\"=\"41\"}";
		
		byte[] inputJson = jsonBody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		
		System.out.println("Response code : " + connection.getResponseCode());
		System.out.println("Response Message : " + connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		
		while((line=bufferReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);

	}
	public void putRequestExample() throws IOException {
		URL url = new URL("http://dummy.restapiexample.com/public/api/v1/update/21");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonBody = "{\"name\":\"GBJ\", \"salary\":\"9876543510987654\", \"age\"=\"42\"}";
		
		byte[] inputJson = jsonBody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		
		System.out.println("Response code : " + connection.getResponseCode());
		System.out.println("Response Message : " + connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		
		while((line=bufferReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	public void deleteRequestExample() throws IOException {
		URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/21");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("DELETE");
		
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		
		
		System.out.println("Response code : " + connection.getResponseCode());
		System.out.println("Response Message : " + connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		
		while((line=bufferReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) throws IOException {
		HttpUrlConnectionExample connectionExample = new HttpUrlConnectionExample();
		//connectionExample.getMethodExample();
		//connectionExample.postMethodExample();
		//connectionExample.putRequestExample();
		connectionExample.deleteRequestExample();
	}
	
}
