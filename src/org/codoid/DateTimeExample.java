package org.codoid;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
	  public static void main(String[] args) {
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        System.out.println("Current Date and Time is: " + currentDateTime);

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	        String formattedDateTime = currentDateTime.format(formatter);
	        System.out.println("Formatted Date and Time is: " + formattedDateTime);
	    }

}
