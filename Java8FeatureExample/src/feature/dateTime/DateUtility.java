package feature.dateTime;

import java.time.LocalDate;

public class DateUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate d = LocalDate.now();
System.out.println(d);
System.out.println(d.getDayOfMonth());
System.out.println(d.getDayOfYear());
System.out.println(d.getMonthValue());
System.out.println(d.getDayOfWeek());
System.out.println(d.minusDays(3L));
System.out.println(d.plusMonths(2));
System.out.println(d.isAfter(LocalDate.of(2017, 2, 2)));
	}

}
