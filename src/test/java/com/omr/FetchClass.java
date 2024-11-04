package com.omr;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchClass {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		A2 v = mapper.readValue(new  File(System.getProperty("user.dir")+"\\src\\test\\resources\\Employee1.json"),A2.class);
		int page = v.getPage();
		System.out.println(page);
		int per_page = v.getPer_page();
		System.out.println(per_page);
	int total = v.getTotal();
	System.out.println(total);
	int total_pages = v.getTotal_pages();
	System.out.println(total_pages);
	 ArrayList<A1> data = v.getData();
	System.out.println(data);
	//ArrayList<A1> data2 = v.getData();
	for (A1 a1 : data) {
		int id = a1.getId();
		System.out.println(id);
		String flightName = a1.getFlightName();
		System.out.println(flightName);
		String country = a1.getCountry();
		System.out.println(country);
		String destinations = a1.getDestinations();
		System.out.println(destinations);
		String url = a1.getURL();
		System.out.println(url);
	}
	C support = v.getSupport();
	System.out.println(support);
	String url = support.getUrl();
	System.out.println(url);
	String text = support.getText();
	System.out.println(text);
	
	
	
		
	}
  	}
	
	


