package ch05.sec12;

import java.io.IOException;

public class EnumExample {
	public static void main(String[] args) throws IOException {
		Week day = Week.FRIDAY;
		switch (day) {
		case MONDAY:
			System.out.println("월");
			break;
		case TUESDAY:
			System.out.println("화");
			break;
		case WEDNESDAY:
			System.out.println("수");
			break;
		case THURSDAY:
			System.out.println("목");
			break;
		case FRIDAY:
			System.out.println("금");
			break;
		case SATURDAY:
			System.out.println("토");
			break;
		case SUNDAY:
			System.out.println("일");
			break;
		default:
			System.out.println("주말");
		}
	}
}

class Weekday {
	static final int MONDAY = 1;
	static final int TUESDAY = 2;
	static final int WEDNESDAY = 3;
	static final int THRUSDAY = 4;
	static final int FRIDAY = 5;
}
