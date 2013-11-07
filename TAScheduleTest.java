
//Submitted By: Surya Bhatt
/**This will be the class which tests all the other classes and tests for time overlaps
**/

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;



public class TAScheduleTest {

	public TAScheduleTest() {
		// TODO Auto-generated constructor stub
	}
	
	//setting any Date of a Sunday Midnight as a reference date
	public static void getDay(){
		//int startTime;
		Calendar date = new GregorianCalendar(2013,9,20);
		System.out.println(date.getTime());
		
	}
	//Writing all the tests to be performed, for overlapping timings and non overlapping timings
	//for overlapping times
	
	@Test
	
	public void testOverlapPositive(){ 
		
		MeetingTime mt_Lab1= new MeetingTime(3720,3760);
		//tues 2:30 to 3:30
		MeetingTime mt_course1_day2 = new MeetingTime(3750, 3810);
		System.out.println("test1 executed");
		assertEquals(true, mt_Lab1.overlap(mt_course1_day2));
	}
	
	//for non- overlapping times
	@Test
	public void testOverlapPositive2(){    
		MeetingTime mt_course1_day2 = new MeetingTime(3750, 3810);
		MeetingTime mt_Lab2 = new MeetingTime(7200, 7260);
		System.out.println("test1 executed again");
		assertEquals(false, mt_Lab2.overlap(mt_course1_day2));
	}
	
	//for overlapping times, with a different case
	@Test
	public void testNonOverLap(){	
		MeetingTime mt_Lab1= new MeetingTime(3720,3760);
		MeetingTime mt_course1_day2 = new MeetingTime(3750, 3810);
		System.out.println("t2 executed");
		assertNotEquals(false, mt_Lab1.overlap(mt_course1_day2));
	}
	
	// for non overlapping times
	@Test
	public void testNonOverLap2(){  
		MeetingTime mt_course1_day1 = new MeetingTime(2280, 2340);
		MeetingTime mt_Lab2 = new MeetingTime(7200, 7260);
		System.out.println("test 2 executed again");
		assertNotEquals(true, mt_Lab2.overlap(mt_course1_day1));
		
	}
	
	
	
	//Though the main method below is never used, we could have used it also if we wanted to
	// test for specific cases. 
	public static void main(String[] args) {
		
		//Assuming reference day as sunday
		Calendar referenceDate = new GregorianCalendar(2013,11,03);
		int startWeekMin = 0;
		int endWeekMin = 7*24*60;
	
		//Monday 2 to 3 PM
		MeetingTime mt_course1_day1 = new MeetingTime(2280, 2340);
		//Monday 4 to 6
		MeetingTime mt_course2_day1 = new MeetingTime(2400, 2460);
		//tuesday 2 to 3
		MeetingTime mt_Lab1= new MeetingTime(3720,3760);
		//tues 2:30 to 3:30
		MeetingTime mt_course1_day2 = new MeetingTime(3750, 3810);
		//thursday 8:00 to 9:00
		MeetingTime mt_course2_day2 = new MeetingTime(5760, 5820);
		//friday 
		MeetingTime mt_Lab2 = new MeetingTime(7200, 7260);
		
		
	}

}
