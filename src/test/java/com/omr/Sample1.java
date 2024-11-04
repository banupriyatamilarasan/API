package com.omr;




	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class Sample1 {
		public static void main(String[] args) {
			Sample1 sample1=new Sample1();
			sample1.updateFlight();
		}
		public void updateFlight() {
			RequestSpecification reqspec;
			//1.Initialize the Rest Assured Class
			reqspec=RestAssured.given();
			//2.pass the Header name ,Body(Req Body,Payload),Auth
			reqspec=reqspec.header("Content-Type","application/json");
			//3.Payload,Req Body
			reqspec=reqspec.body("{\r\n"
					+ "    \"flightName\": \"AirIndia\",\r\n"
					+ "    \"Country\": \"India\",\r\n"
					+ "    \"Destinations\": 90,\r\n"
					+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
					+ "}");
			//4.Req type,Endpoint
			Response response = reqspec.put("https://www.omrbranch.com/api/flight/34389");
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



