package date;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatExample {
	public static void main(String[] args) {

		Date curDate = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

		String DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		try {
			Date strToDate = format.parse(DateToStr);
			System.out.println(strToDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// using different locale
		String pattern = "EEEEE MMMMM yyyy HH:mm:ss.SSSZ";
		SimpleDateFormat simpleDateFormat =
		        new SimpleDateFormat(pattern, new Locale("da", "DK"));

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		//date format symbols
		Locale locale = new Locale("en", "UK");
		DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
		dateFormatSymbols.setWeekdays(new String[]{
		        "Unused",
		        "Sad Sunday",
		        "Manic Monday",
		        "Thriving Tuesday",
		        "Wet Wednesday",
		        "Total Thursday",
		        "Fat Friday",
		        "Super Saturday",
		});

		String pattern1 = "EEEEE MMMMM yyyy";
		SimpleDateFormat simpleDateFormat1 =
		        new SimpleDateFormat(pattern1, dateFormatSymbols);

		String date1 = simpleDateFormat1.format(new Date());
		System.out.println(date1);
	}
}