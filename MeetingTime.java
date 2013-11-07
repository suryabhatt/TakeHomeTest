//Submitted By: Surya Bhatt
/****
 * Here the MeetingTime class'defines the start time and end time of all the courses and the labs. 
 * Then we have getters and setters for StartTimes and EndTimes
 * Finally we have  a logic to test the meeting times between different courses
****/
public class MeetingTime {

	private int startTime;
	private int endTime;

	public MeetingTime() {
		// TODO Auto-generated constructor stub
	}

	public MeetingTime(int startTime, int endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}
// Getters and setters for start time and end time
	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
// OVERLAP method tests for overlap of meeting times in schedule
	public boolean overlap(MeetingTime mt1) {
		if ((mt1.getStartTime() > this.startTime && mt1.getStartTime() < this.endTime)
				|| (mt1.getEndTime() > this.startTime && mt1.getEndTime() < this.endTime)) {
			
			return true;
		}

		return false;

	}

}
