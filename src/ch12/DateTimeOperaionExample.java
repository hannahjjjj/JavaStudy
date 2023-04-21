package ch12;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperaionExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH.mm.ss");
		System.out.println("현재시간" + now.format(dtf));
		
		LocalDateTime r1 = now.plusYears(1);
		System.out.println("1년 덧셈:" + r1.format(dtf));
		LocalDateTime r2 = now.minusMonths(2);
		System.out.println("2월 뺄셈:" + r2.format(dtf));
		LocalDateTime r3 = now.plusDays(7);
		System.out.println("7일 덧셈:" + r3.format(dtf));
	}
}
