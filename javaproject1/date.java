package javaproject1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class date {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2025, 03, 14); // Year 2023, December, 5th
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH);
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
        
        String splitDate = formattedDate.substring(3);
        String dd = formattedDate.substring(0, 2);
        
        System.out.println(dd);
        String onlyyear=formattedDate.substring(9, 13);
        System.out.println(onlyyear);
        
        
	}

}
