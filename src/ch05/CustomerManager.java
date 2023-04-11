package ch05;

import java.io.IOException;
import java.util.Scanner;

public class CustomerManager {
	static final int MAX = 100;
	static String[] nameList = new String[MAX];
	static char[] genderList = new char[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthYearList = new int[MAX];

	static int index = -1;
	static int count = 0;

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.printf("\n고객	수: %d, 인덱스: %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, " + "(C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
			String menu = scanner.next();
			menu = menu.toLowerCase(); // 입력한 문자열을 소문자로 변환
			switch (menu.charAt(0)) {
			case 'i':
				if (MAX < count) {
					System.out.println("더 이상 등록 불가능");
				} else {
					System.out.println("고객정보 입력을 시작합니다.");
					insertCustomerData();
				}
				break;
			case 'p':
				System.out.println("이전	데이터를	출력합니다.");
				if (index <= 0) {
					System.out.println("이전	데이터가	존재하지	않습니다.");
				} else {
					index--;
					printCustomerInfo();
				}
				break;
			case 'n':
				System.out.println("다음	데이터를	출력합니다.");
				if (index >= count - 1) {
					System.out.println("다음	데이터가	존재하지	않습니다.");
				} else {
					index++;
					printCustomerInfo();
				}
				break;
			case 'c':
				System.out.println("현재	데이터를	출력합니다.");
				if ((index >= 0) && (index < count)) {
					printCustomerInfo();
				} else {
					System.out.println("데이터가	선택되지	않았습니다.");
				}
				break;
			case 'u':
				System.out.println("데이터를	수정합니다.");
				if ((index >= 0) && (index < count)) {
					System.out.println(index + "번째	데이터를	수정합니다.");
					updateCustomerData();
				} else {
					System.out.println("데이터가	선택되지	않았습니다.");
				}
				break;
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if ((index >= 0) && (index < count)) {
					System.out.println(index + "번째	데이터를 삭제합니다.");
					deleteCustomerData();
				} else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'q':
				System.out.println("프로그램을 	종료합니다.");
				scanner.close(); // Scanner 객체를 닫아줍니다.
				System.exit(0); // 프로그램을 종료시킵니다.
				break;
			default:
				System.out.println("메뉴를 잘못	입력했습니다.");
			}// end switch
		} // end while

	}

	private static void deleteCustomerData() {
		// TODO Auto-generated method stub
		for (int i = index; i < count - 1; i++) {
			nameList[i] = nameList[i + 1];
			genderList[i] = genderList[i + 1];
			emailList[i] = emailList[i + 1];
			birthYearList[i] = birthYearList[i + 1];
		}
		count--;
	}

	private static void insertCustomerData() {
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("성별(M/F) : ");
		char gender = scanner.next().charAt(0);
		System.out.print("이메일 : ");
		String email = scanner.next();
		System.out.print("출생년도	 : ");
		int birthYear = scanner.nextInt();
		// 고객 객체를 배열에 저장
		// count 번째 배열에 저장 후 count 값을 증가시켜야 함
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count++;
	}

	private static void printCustomerInfo() {
		System.out.println("==========CUSTOMER	INFO================");
		System.out.println("이름 : " + nameList[index]);
		System.out.println("성별 : " + genderList[index]);
		System.out.println("이메일 : " + emailList[index]);
		System.out.println("출생년도 : " + birthYearList[index]);
		System.out.println("=======================================");
	}

	private static void updateCustomerData() {
		System.out.println("---------UPDATE	CUSTOMER INFO----------");
		System.out.print("이름(" + nameList[index] + ") :");
		nameList[index] = scanner.next();
		System.out.print("성별(" + genderList[index] + ")	:");
		genderList[index] = scanner.next().charAt(0);
		System.out.print("이메일(" + emailList[index] + ") :");
		emailList[index] = scanner.next();
		System.out.print("출생년도(" + birthYearList[index] + ") :");
		birthYearList[index] = scanner.nextInt();
	}
}
