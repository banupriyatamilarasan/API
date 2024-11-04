package com.omr;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {
	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.createFlight();
	}
	public void createFlight() {
		RequestSpecification reqspec;
		//1.Initialize the Rest Assured Class
		reqspec=RestAssured.given();
		//2.pass the Header name ,Body(Req Body,Payload),Auth
		reqspec=reqspec.header("Content-Type","application/json");
		//3.Payload,Req Body
		reqspec=reqspec.body("{\r\n"
				+ "    \"flightName\": \"AirIndia\",\r\n"
				+ "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": \"87\",\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
				+ "}");
		//4.Req type,Endpoint
		Response response = reqspec.post("https://www.omrbranch.com/api/flights");
		//Status code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		//Res Body------>AsString
		String asString = response.asString();
		System.out.println(asString);
		//Res Body---->AsPreetyString
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
		
		
		
	}

}
