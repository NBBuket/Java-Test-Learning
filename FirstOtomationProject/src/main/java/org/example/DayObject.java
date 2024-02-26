package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class DayObject {

    public String readDay() throws IOException, ParseException { //function for getting day objcet as a string

      //reading the json file for input
      Object obj = new JSONParser().parse(new FileReader("date.json"));
      JSONObject jo = (JSONObject) obj;

      //extracting "day" part from the input
      return((String) jo.get("day"));
        
}
