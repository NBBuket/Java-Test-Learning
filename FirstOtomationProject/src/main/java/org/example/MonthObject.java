package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class MonthObject {

    public String readMonth() throws IOException, ParseException { //function for getting month objcet as a string

      //reading the json file for input
      Object obj = new JSONParser().parse(new FileReader("date.json"));
      JSONObject jo = (JSONObject) obj;

      //extracting "month" part from the input
      return((String) jo.get("month"));
        
}
