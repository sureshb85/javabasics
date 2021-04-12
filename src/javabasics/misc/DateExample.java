package javabasics.misc;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {

		// date time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Date Time: " + dateTime);

		// date
		LocalDate onlyDate = LocalDate.now();
		System.out.println("Date: " + onlyDate);

		// date
		LocalTime onlyTime = LocalTime.now();
		System.out.println("Time: " + onlyTime);

		// specific format
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("yyyy/MM/dd HH:mm:ss" + dtf.format(dateTime));

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("dd/MM/yyyy HH:mm:ss" + formatter.format(date));

		Date date1 = new Date();
		System.out.println(date1);

		Date date2 = Calendar.getInstance().getTime();
		System.out.println(date2);
	}
}
