package com.omr;




	






	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
	
		
			public class Sample5 {
		public static void main(String[] args) {
			Sample5 sample5=new Sample5();
			sample5.deleteFlight();
		}
		public void deleteFlight() {
			RequestSpecification reqspec;
			//1.Initialize the Rest Assured Class
			reqspec=RestAssured.given();
			//2.pass the Header name ,Body(Req Body,Payload),Auth
			reqspec=reqspec.header("Content-Type","application/json");
			//3.Payload,Req Body
		
			//4.Req type,Endpoint
			Response response = reqspec.delete("https://www.omrbranch.com/api/flight/34389");
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












