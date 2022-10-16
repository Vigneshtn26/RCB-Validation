package org.testvagrant;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Rcbvalidation {

	public static void main(String[] args) throws  IOException, ParseException {
		JSONParser parser = new JSONParser();
	      try {
	         Object obj = parser.parse(new FileReader("D:/Teamrcb/TeamRCB.json"));
	         JSONObject jsonObject = (JSONObject)obj;
	         String country = (String)jsonObject.get("location");
	         JSONArray player = (JSONArray)jsonObject.get("player");
	         JSONObject newjso = new JSONObject();
	         System.out.println("location: " + country);
	         
	         for (int i = 0; i < player.size(); i++) {
	        	 System.out.println(player.get(i));
	        	
	         }
	      
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	   }
}
