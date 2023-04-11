package ch05.sec12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) throws IOException {
		Week today=null;
		
		Calendar cal= Calendar.getInstance();
		
		int week=cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: today=Week.SUNDAY; break;
		case 2: today=Week.MONDAY; break;
		case 3: today=Week.TUESDAY; break;
		case 4: today=Week.WEDNESDAY; break;
		case 5: today=Week.THURSDAY; break;
		case 6: today=Week.FRIDAY; break;
		case 7: today=Week.SATURDAY; break;
		}
		
		if(today==Week.SATURDAY) {
			System.out.println("토요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바를 공부 하기 싫어요");
		}
		boolean []a=new boolean[3];
		System.out.println(Arrays.toString(a));
	}
}
