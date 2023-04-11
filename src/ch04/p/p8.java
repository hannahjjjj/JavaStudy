package ch04.p;

import java.io.IOException;
import java.util.Scanner;

public class p8 {
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int testCase=sc.nextInt();// 총 테스트 케이스
		for(int i=0;i<testCase;i++) {
			int num=sc.nextInt();// 케이스별 넣을 데이터의 수
			int num2;
			int sum=0;
			for(int j=0;j<num;j++) {
				num2=sc.nextInt();
				sum+=num2; // 합
			}
			System.out.println("#"+(i+1)+" "+sum);
			
		}
	}
}
