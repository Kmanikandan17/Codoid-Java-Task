package org.codoid;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	  public static void main(String[] args) {
	        String dateString = "2023-04-02";
	        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            Date date = dateFormat.parse(dateString);
	            System.out.println("Date object: " + date);
	        } catch (ParseException e) {
	            System.err.println("Error parsing date: " + e.getMessage());
	        }
	    }

}
