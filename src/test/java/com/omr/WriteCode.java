package com.omr;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteCode {
	public static void main(String[] args) throws StreamReadException,DatabindException,IOException{
		ObjectMapper mapper=new ObjectMapper();
		ArrayList<A1> array=new ArrayList<A1>();
		A1 a1= new A1(3,"AirIndia","India","28","https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		A1 a2=new A1(33,"AirIndia","India","20","https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		A1 a3= new A1(36,"AirIndia", "India","71","https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
A1 a4=new A1(42,"AirIndia.Raj","India","98", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
A1 a5 =new A1(49,"AirIndia","India","88","https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
A1 a6=new A1(59,"AirIndia", "India","87","https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
array.add(a1);
array.add(a2);
array.add(a3);
array.add(a4);
array.add(a5);
array.add(a6);
	
C f = new C( "https:\\/\\/omrbranch.com","For Joining Automation Course, Please Contact-Velmurugan 9944152058");
A2 v= new A2(1,6,9118,1520,array,f);
mapper.writeValue(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Employee2.json"), v);

	}
}


