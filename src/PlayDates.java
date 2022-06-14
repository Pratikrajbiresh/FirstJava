import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class PlayDates {
	
	public static void main(String[] args) {
		
		// Date rlated operations
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(now1);
		System.out.println(now1.getDayOfMonth());
		System.out.println(now1.getHour());
		System.out.println(now1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
		
		LocalDate birthday = LocalDate.of(1998, 8, 3);
		System.out.println(birthday);
		System.out.println(birthday.getDayOfMonth());
		System.out.println(birthday.getMonth().getValue());
		System.out.println(birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		// add upto local days
		
		LocalDate F10 = now.plusDays(10);
		System.out.println(F10);
		
		LocalDate M10 = now.plusMonths(10);
		System.out.println(M10);
		
		//calculate ur age
		Period period = Period.between(birthday, now.plusDays(2));
		System.out.println(period);
		System.out.println(String.format("%s years, %s months",period.getYears(),period.getMonths()));
		
		// zone based data times
		Set<String> zoneIDs = ZoneId.getAvailableZoneIds();
		System.out.println(zoneIDs);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Australia/Tasmania"));
		System.out.println(zonedDateTime);
				
	}

}
