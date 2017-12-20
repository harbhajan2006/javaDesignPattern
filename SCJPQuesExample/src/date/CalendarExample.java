package date;
// http://javarevisited.blogspot.com/2017/02/17-examples-of-calendar-and-date-in-java.html
//http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	
	public static void main(String[] args) {
		Calendar calendar  = Calendar.getInstance();
		System.out.println(calendar);
		System.out.println(calendar.getTime());
		// relation ship between calendar and date class
		Date d = calendar.getTime();
		
		// Printing some information...
				System.out.println("ERA: " + calendar.get(Calendar.ERA));
				System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
				System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
				System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
				System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
				System.out.println("DATE: " + calendar.get(Calendar.DATE));
				System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
				System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
				System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
				System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
				System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
				System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
				System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
				System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
				System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
				System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
				
				
				// addind and subtracting -- date manipulations
				calendar.add(Calendar.DATE, 1);
				System.out.println(calendar.getTime());
				
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				System.out.println(calendar.getTime());
				
				calendar.add(Calendar.MONTH, 1);
				System.out.println(calendar.getTime());
				
				calendar.add(Calendar.YEAR, 1);

				
				// Example 13 - converting Date to Calendar 
				Date date= new Date(); 
				Calendar cal1 = Calendar.getInstance(); 
				cal1.setTime(date);
				
				System.out.println(cal1.getTime());
				// comparing dates

				if(cal1.equals(calendar)){
					System.out.println("daes are equal");
				}
			
				if(cal1.after(calendar)){
					System.out.println("cal1 comes after calendar");
				}
				
				if(cal1.before(calendar)){
					System.out.println("cal1 comes before calendar");
					
				}
	}

}
