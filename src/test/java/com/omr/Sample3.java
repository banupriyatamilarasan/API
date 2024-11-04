package com.omr;


	






	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
	
		public class Sample3 {
		public static void main(String[] args) {
			Sample3 sample3=new Sample3();
			sample3.singleFlight();
		}
		public void singleFlight() {
			RequestSpecification reqspec;
			//1.Initialize the Rest Assured Class
			reqspec=RestAssured.given();
			//2.pass the Header name ,Body(Req Body,Payload),Auth
			reqspec=reqspec.header("Content-Type","application/json");
			//3.Payload,Req Body
			//reqspec=reqspec.body("{\r\n"
				//	+ "    \"Destinations\": 95\r\n"
				//	+ "}");
			//4.Req type,Endpoint
			Response response = reqspec.get("https://www.omrbranch.com/api/flight/34389");
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









