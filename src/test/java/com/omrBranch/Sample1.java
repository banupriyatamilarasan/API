package com.omrBranch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser=new JSONParser();
		Object parse=jsonParser.parse(new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Employee1.json"));
		JSONObject jsonObject =(JSONObject)parse;
		Object object = jsonObject.get("page");
		System.out.println(object);
		Object object1 = jsonObject.get("per_page");
		System.out.println(object1);
		Object object2 = jsonObject.get("total");
		System.out.println(object2);
		Object object3 = jsonObject.get("total_pages");
		System.out.println(object3);
		Object object4 = jsonObject.get("data");
		System.out.println(object4);
		JSONArray array=(JSONArray)object4;
		for(int i=0;i<array.size();i++) {
			Object object5 = array.get(i);
			JSONObject jsonObject1=(JSONObject)object5;
			Object object6 = jsonObject1.get("id");
			System.out.println(object6);
			Object object7 = jsonObject1.get("flightName");
			System.out.println(object7);
			Object object8 = jsonObject1.get("Country");
			System.out.println(object8);
			Object object9 = jsonObject1.get("Destinations");
			System.out.println(object9);
			Object object10 = jsonObject1.get("URL");
			System.out.println(object10);
		}
			Object object11 = jsonObject.get("support");
			System.out.println(object11);
			JSONObject jsonObject2=(JSONObject)object11;
			Object object12 = jsonObject2.get("url");
			System.out.println(object12);
			Object object13 = jsonObject2.get("text");
			System.out.println(object13);
			
		}
		
		
		
	 
		
	
	}