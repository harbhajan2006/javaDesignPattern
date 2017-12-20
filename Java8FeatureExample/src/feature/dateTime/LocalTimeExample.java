package feature.dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class LocalTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(LocalTime.now()); ;

Set<String> AllZones = ZoneId.getAvailableZoneIds();
for(String zone:AllZones){
	System.out.println("Zone name is ---- " + zone + "----" +  LocalTime.now(ZoneId.of(zone)));
}

LocalTime time=LocalTime.of(2, 10, 55);
System.out.println(time);

System.out.println(LocalTime.ofSecondOfDay(1));
	}

}
