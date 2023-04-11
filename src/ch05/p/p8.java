package ch05.p;

import java.io.IOException;

public class p8 {
	public static void main(String[] args) throws IOException {
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum=0;
		int total=0;
		double avg=0.;
		for(int i=0;i<array.length;i++) {
			for(int k=0;k<array[i].length;k++) {
				sum+=array[i][k];
			}
			total+=array[i].length;
		}
		avg=(double)sum/total;
		System.out.println("합: "+sum+", 평균: "+avg);
	}
}
