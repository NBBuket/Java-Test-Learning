package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        DateObjects newDate = new DateObjects();
        String day = newDate.readDay();
        String month = newDate.readMonth();
        String year = newDate.readYear();

        System.out.println("Day: " + day + " Month: " + month + " Year: " + year );

    }
}