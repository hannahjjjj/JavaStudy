package ch05.p;

import java.io.IOException;
import java.util.Scanner;

public class p9 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] student = null;
		int num=0;
		boolean run=true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");
			int str = sc.nextInt();
			switch (str) {
			case 1:
				System.out.println("학생 수>");
				num=sc.nextInt();
				student=new int[num];
				break;
			case 2:
				for(int i=0;i<num;i++) {
					System.out.print("scores["+i+"]: ");
					int scores=sc.nextInt();
					student[i]=scores;
					System.out.println();
				}
				break;
			case 3:
				for(int i=0;i<num;i++) {
					System.out.println("scores["+i+"]: "+student[i]);
				}
				break;
			case 4:
				int maxScore=Integer.MIN_VALUE;
				int sum=0;
				for(int i=0;i<num;i++) {
					if(student[i]>maxScore) {
						maxScore=student[i];
					}
					sum+=student[i];
				}
				System.out.println("최고 점수: "+maxScore);
				System.out.println("평균 점수: "+(double)sum/student.length);
				break;
			case 5:
				run=false;
			}
		}
	}
}
