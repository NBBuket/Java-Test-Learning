package org.example;

import org.json.simple.parser.ParseException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {

        DayObject newDay = new DayObject(); //creating day object
        String day = newDay.readDay();

        MonthObject newMonth = new MonthObject(); //creating month object
        String month = newMonth.readMonth();

        YearObject newYear = new YearObject(); //creating year object
        String year = newYear.readYear();

        System.out.println("Day: " + day + " Month: " + month + " Year: " + year );

    }
}
