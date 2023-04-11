package ch05.sec10;

import java.io.IOException;

public class AdvancedForExample {
	public static void main(String[] args) throws IOException {
		int[] scores= {95,71,84,93,87};
		int sum=0;
		for(int data:scores) {
			sum+=data;
		}
		System.out.println("점수 총합="+sum);
		double avg=(double)sum/scores.length;
		System.out.println("점수 평균 = "+avg);
	}
}
