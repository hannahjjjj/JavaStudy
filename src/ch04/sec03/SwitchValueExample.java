package ch04.sec03;

import java.io.IOException;

public class SwitchValueExample {
	public static void main(String[] args) throws IOException {
		String grade="B";
		
		//java 11 이전 문법
		int score1=0;
		switch(grade) {
			case "A":
				score1=100;
				break;
			case "B":
				int result=100-20;
				score1=result;
				break;
			default:
				score1=60;
		}
		System.out.println("score1: "+score1);
		
		//Java 12부터 가능
		int score2=switch(grade) {
			case "A"->100;
			case "B"->{
				int result =100-20;
				//java13부터 가능
				yield result;
			}
			default->60;
		};
		System.out.println("score2: "+score2);
	}
}
