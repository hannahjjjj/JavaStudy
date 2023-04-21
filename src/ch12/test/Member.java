package ch12.test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.regex.Pattern;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() { //this붙여도 되고 안붙여도 됨
		return this.id + ": " + this.name;
	}
	public static void main(String[] args) {
		//15번
		LocalDateTime startD = LocalDateTime.now();
		LocalDateTime endD = LocalDateTime.of(2023,12,31,0,0,0);
		System.out.println(startD.until(endD, ChronoUnit.DAYS));
		//16번
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(f.format(new Date()));
		//17번
		String regexp  = "[a-zA-Z][0-9a-zA-Z]{7,11}";
		System.out.println(Pattern.matches(regexp, "5Angel004"));
	}
	
}
