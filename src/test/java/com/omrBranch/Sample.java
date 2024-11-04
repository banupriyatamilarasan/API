package com.omrBranch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser=new JSONParser();
		Object parse=jsonParser.parse(new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Employee.json"));
		JSONObject jsonObject =(JSONObject)parse;
		
		Object object = jsonObject.get("data");
		//String data=(String)object;
		System.out.println(object);
		JSONObject jsonObject1 =(JSONObject)object;
		Object object2 = jsonObject1.get("id");
		//String id = (String)object2;
		System.out.println(object2);
		Object object3 = jsonObject1.get("flightName");
		//String flightName=(String)object3;
		System.out.println(object3);
		
		Object object4 = jsonObject1.get("Country");
		
		//String Country=(String)object4;
		System.out.println(object4);
		Object object5 = jsonObject1.get("Destinations");
		//String Destinations=(String)object5;
		System.out.println(object5);
		Object object6 = jsonObject1.get("URL");
		//String URL=(String)object6;
		System.out.println(object6);
		Object object7 = jsonObject1.get("Created_Date");
		//String CreatedDate=(String)object7;
		System.out.println(object7);
		Object object8 = jsonObject1.get("Updated_Date");
		//String UpdatedDate=(String)object8;
		System.out.println(object8);
		Object object9 = jsonObject.get("support");
		//String support=(String)object9;
		System.out.println(object9);
		JSONObject jsonObject2 =(JSONObject)object9;
		Object object10 = jsonObject2.get("url");
		//String url=(String)object10;
		System.out.println(object10);
		Object object11 = jsonObject2.get("text");
		//String text=(String)object11;
		System.out.println(object11);
		
		
		
	}

}

