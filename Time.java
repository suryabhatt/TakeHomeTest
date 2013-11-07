
//Submitted By: Surya Bhatt


	/**Time class here is used to get the meeting time and day,  and returns values for 
	 * meeting time and day.
	**/

public class Time {

	private String day;
	private int timeOfDay;
	
	static final String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
	
	public Time() {
		// TODO Auto-generated constructor stub
	}
	//return the day of the class
	public String getDay(MeetingTime mt){
		
		int d;
		d= mt.getStartTime()/(24*60);
		
		return days[d];
		
		
	}
	//return the time for a particular class or lab
	public int getTimeOfDay(MeetingTime mt){
		
		int minutesOfDay = mt.getStartTime()%(60*24);
		
		
		return minutesOfDay;
	}

}
