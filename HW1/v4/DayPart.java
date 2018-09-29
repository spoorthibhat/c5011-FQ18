package v4;
import java.time.LocalTime;

enum DayParts { MORNING, AFTERNOON, EVENING, NIGHT }

class DayPart {

	private DayParts dp;
	
	public DayPart(LocalTime lt) {
		int hour = lt.getHour();
		if (hour >= 5 && hour < 12) 
			dp = DayParts.MORNING;
		else if (hour >= 12 && hour < 17) 
			dp = DayParts.AFTERNOON;
		else if (hour >= 17 && hour < 22)  
			dp =  DayParts.EVENING;
		else 
			dp =  DayParts.NIGHT;
	}
	
	public DayPart() {
		this(LocalTime.now());
	}
	
	public DayParts getDayPart() {
		return dp;
	}
	
	@Override
	public String toString() {
		switch (dp) {
			case MORNING:
				return "morning";
			case AFTERNOON:
				return "afternoon";
			case EVENING:
				return "evening";
			case NIGHT:
				return "night";
			default:
				return "unknown";
		}
	}
	
}
