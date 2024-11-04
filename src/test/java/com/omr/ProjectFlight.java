package com.omr;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ProjectFlight extends APIBaseClass{
	Integer id;
	@Test(priority=1)
	public void postCreateFlight() {
		addHeader("Content-Type", "application/json");
		addBody("{\r\n"
				+ "    \"flightName\": \"AirIndia\",\r\n"
				+ "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": \"87\",\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
				+ "}\r\n"
				+ "");
		Response reqType = addReqType("POST", "https://www.omrbranch.com/api/flights");
		int statusCode = getStatusCode(reqType);
		System.out.println(statusCode);
		JsonPath path = reqType.jsonPath();
		Object object1 = path.get("data.id");
		id=(Integer)object1;
		System.out.println(id);
		String string = getResBodyAsPrettyString(reqType);
		System.out.println(string);

		
	}
	
	


@Test(priority=2)
public void getSingleFlight() {
	//1.Header
	addHeader("Content-Type", "aplication/json");
	//2.RequestType and Endpoint
	Response reqType = addReqType("GET", "https://www.omrbranch.com/api/flight/"+id);
	int statusCode = getStatusCode(response);
	System.out.println(statusCode);
	
	//JsonPath jsonPath = response.jsonPath();
	
	//Object object = jsonPath.get("data.flightName");
	//System.out.println(object);
	String prettyString = getResBodyAsPrettyString(reqType);
	System.out.println(prettyString);


}
@Test(priority=3)
public void updateFlight() {
	addHeader("Content-Type", "application/json");
	addBody("{\r\n"
			+ "    \"flightName\": \"AirIndia\",\r\n"
			+ "    \"Country\": \"India\",\r\n"
			+ "    \"Destinations\": 86,\r\n"
			+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
			+ "}\r\n"
			+ "");
	Response reqType1 = addReqType("PUT", "https://www.omrbranch.com/api/flight/"+id);
	int code = getStatusCode(reqType1);
	System.out.println(code);
	//one value get
	//JsonPath jsonPath1 = reqType1.jsonPath();
	//Object t = jsonPath1.get("data.Country");
	//System.out.println(t);
	String resBodyAsPrettyString = getResBodyAsPrettyString(reqType1);
	System.out.println(resBodyAsPrettyString);
}
@Test(priority=4)
public void updatyeFlight1() {
	addHeader("Content-Type", "application/json");
	
	addBody("{\r\n"
			+ "    \"Destinations\": 25\r\n"
			+ "}");
	Response response2 = addReqType("PATCH", "https://www.omrbranch.com/api/flight/"+id);
	int statusCode = getStatusCode(response2);
	System.out.println(statusCode);
	String asPrettyString = getResBodyAsPrettyString(response2);
	System.out.println(asPrettyString);
	
}
@Test(priority=5)
public void deleteFlight() {
	addHeader("Content-Type", "application/json");
	Response type = addReqType("DELETE", "https://www.omrbranch.com/api/flight/"+id);
	int i = getStatusCode(type);
	System.out.println(i);
	
}
@Test(priority=6)
public void listFlight() {
	addHeader("Content-Type", "application/json");
	Response type1 = addReqType("GET", "https://www.omrbranch.com/api/flights?page=1");
	int statusCode1 = getStatusCode(type1);
	System.out.println(statusCode1);
	String bodyAsPrettyString = getResBodyAsPrettyString(type1);
	System.out.println(bodyAsPrettyString);
	
}

}














