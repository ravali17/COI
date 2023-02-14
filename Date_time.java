package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

public class Date_time {
	public static void LocalDateTimeApi() {
		
		LocalDate date=LocalDate.now();
		System.out.println("current date is:"+date);
		LocalTime time=LocalTime.now();
		System.out.println("current time is:"+time);
		LocalDateTime current=LocalDateTime.now();
		System.out.println("current time amd date is:"+current);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyyhh:mm:ss");
		String formatedDateTime=current.format(format);
		System.out.println("in formatted manner:"+formatedDateTime);
		Month month=current.getMonth();
		int day=current.getDayOfMonth();
		int seconds=current.getSecond();
		System.out.println("month:"+month+":day="+day+":seconds="+seconds);
		LocalDate date2=LocalDate.of(1950, 01, 26);
		System.out.println("the republic day:"+date2);
		LocalDateTime specificDate=current.withDayOfMonth(4).withYear(2022);
		System.out.println(specificDate);
		
		ZonedDateTime currentZone = ZonedDateTime.now();
	    System.out.println("the current zone is "+currentZone.getZone());
		ZoneId seoul=ZoneId.of("Asia/Seoul");
		ZonedDateTime seoulZone=currentZone.withZoneSameInstant(seoul);
		System.out.println("seoul time zone:"+seoulZone);
		
		
		
	}
	public static void main(String args[]) {
		LocalDateTimeApi();
		Set<String>zoneid=ZoneId.getAvailableZoneIds();
		for(String zoneids:zoneid) {
			System.out.println(zoneids);
		}
	}

}
