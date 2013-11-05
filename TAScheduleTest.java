//Submitted By: Surya Bhatt

import static org.junit.Assert.*;

import java.util.*;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;


public class TAScheduleTest {

	public TAScheduleTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void getDay(){
		//int startTime;
		Calendar date = new GregorianCalendar(2013,9,20);
		System.out.println(date.getTime());
		
	}
	
	@Test
	public void testOverlapPositive(){ //for overlapping times
		
		MeetingTime mt_Lab1= new MeetingTime(3720,3760);
		//tues 2:30 to 3:30
		MeetingTime mt_course1_day2 = new MeetingTime(3750, 3810);
		System.out.println("test1 executed");
		assertEquals(true, mt_Lab1.overlap(mt_course1_day2));
	}
	@Test
	public void testOverlapPositive2(){    //for non- overlapping times
		MeetingTime mt_course1_day2 = new MeetingTime(3750, 3810);
		MeetingTime mt_Lab2 = new MeetingTime(7200, 7260);
		System.out.println("test1 executed again");
		assertEquals(false, mt_Lab2.overlap(mt_course1_day2));
	}	
	@Test
	public void testNonOverLap(){	//for overlapping times
		MeetingTime mt_Lab1= new MeetingTime(3720,3760);
		MeetingTime mt_course1_day2 = new MeetingTime(3750, 3810);
		System.out.println("t2 executed");
		assertNotEquals(false, mt_Lab1.overlap(mt_course1_day2));
	}
	@Test
	public void testNonOverLap2(){  // for non overlapping
		MeetingTime mt_course1_day1 = new MeetingTime(2280, 2340);
		MeetingTime mt_Lab2 = new MeetingTime(7200, 7260);
		System.out.println("test 2 executed again");
		assertNotEquals(true, mt_Lab2.overlap(mt_course1_day1));
		
	}
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
