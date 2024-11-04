package com.omr;






	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
	public class Sample2 {

		public static void main(String[] args) {
			Sample2 sample2=new Sample2();
			sample2.updateFlight1();
		}
		public void updateFlight1() {
			RequestSpecification reqspec;
			//1.Initialize the Rest Assured Class
			reqspec=RestAssured.given();
			//2.pass the Header name ,Body(Req Body,Payload),Auth
			reqspec=reqspec.header("Content-Type","application/json");
			//3.Payload,Req Body
			reqspec=reqspec.body("{\r\n"
					+ "    \"Destinations\": 95\r\n"
					+ "}");
			//4.Req type,Endpoint
			Response response = reqspec.patch("https://www.omrbranch.com/api/flight/34389");
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






