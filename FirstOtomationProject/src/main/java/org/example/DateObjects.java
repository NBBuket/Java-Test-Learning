package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class DateObjects {

    public String readDay() {
        JSONObject obj = null;
        try {
            FileReader fr = new FileReader("date.json");
            JSONParser parser = new JSONParser();
            obj = (JSONObject) parser.parse(fr);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        Object strDay = obj.get("day");
        return(strDay.toString());
    }

    public String readMonth() {
        JSONObject obj = null;
        try {
            FileReader fr = new FileReader("date.json");
            JSONParser parser = new JSONParser();
            obj = (JSONObject) parser.parse(fr);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        Object strMonth = obj.get("month");
        return(strMonth.toString());
    }

    public String readYear() {
        JSONObject obj = null;
        try {
            FileReader fr = new FileReader("date.json");
            JSONParser parser = new JSONParser();
            obj = (JSONObject) parser.parse(fr);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        Object strYear = obj.get("year");
        return(strYear.toString());
    }
}
