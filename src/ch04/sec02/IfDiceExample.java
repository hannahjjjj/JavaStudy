package ch04.sec02;

import java.io.IOException;

public class IfDiceExample {
	public static void main(String[] args) throws IOException {
		int score=93;
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score<90)
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B입니다.");
	}
}
