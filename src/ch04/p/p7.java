package ch04.p;

import java.io.IOException;
import java.util.Scanner;

public class p7 {
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		boolean run=true;
		int balance=0;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예끔 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			String selectNum=sc.nextLine();
			switch(selectNum) {
				case "1":
					System.out.print("예금액>");
					String str=sc.nextLine();
					balance+=Integer.parseInt(str);
					break;
				case "2":
					System.out.print("출금액>");
					str=sc.nextLine();
					balance-=Integer.parseInt(str);
					break;
				case "3":
					System.out.println("잔고>"+balance);
					break;
				case "4":
					run=false;
					break;
			}
		}
	}
}
