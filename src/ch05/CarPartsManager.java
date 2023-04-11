package ch05;

import java.io.IOException;
import java.util.Scanner;

public class CarPartsManager {
	static final int MAX = 100;
	static String[] store = new String[MAX];
	static int[] tireList = new int[MAX];
	static int[] bumperList = new int[MAX];
	static int[] bulbList = new int[MAX];

	static int index = 0;
	static int count = 0;

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.printf("\n고객	 수: %d, 인덱스: %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (S)erch, " + "(U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력: ");
			String menu = scanner.next();
			menu = menu.toLowerCase(); // 입력한 문자열을 소문자로 변환
			switch (menu.charAt(0)) {
			case 'i':// 정보를 입력하는 기능
				System.out.println("재고정보입력을 시작");
				if (count >= MAX) {
					System.out.println("저장공간이 가득참");
				} else {
					insertStoreData();
					System.out.println("입력완료");
				}
				break;
			case 's':// 조회하는 기능
				System.out.println("재고 정보를 조회합니다.");
				index++;
				if ((index >= 0) && (index < count)) {
					printStoreData();
				} else {
					System.out.println("데이터 미지정됨");
				}
				break;
			case 'u':
				System.out.println("데이터를	수정합니다.");
				if (count > 0) {
					updateStoreData();
				} else {
					System.out.println("데이터가 없습니다.");
				}
				break;
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if (count > 0) {
					deleteStoreData();
				} else {
					System.out.println("데이터가 없습니다.");
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

	// 수정 삭제
	private static void deleteStoreData() {
		scanner.nextLine();
		System.out.print("삭제하실 매장을 입력해주세요: ");
		String str = scanner.nextLine();

		for (int i = 0; i < count; i++) {
			if (str.equals(store[i])) {
				for (int j = i; j < count - 1; j++) {
					store[i] = store[i + 1];
					tireList[i] = tireList[i + 1];
					bumperList[i] = bumperList[i + 1];
					bulbList[i] = bulbList[i + 1];
				}
				System.out.println("삭제가 완료 되었습니다.");
				count--;
				break;
			}
			if (i == count - 1) {
				System.out.println("삭제하실 매장이 존재하지 않습니다.");
			}
		}

	}

	private static void updateStoreData() {
		scanner.nextLine();
		System.out.print("수정하실 매장을 입력해주세요: ");
		String str = scanner.nextLine();
		for (int i = 0; i < count; i++) {
			if (str.equals(store[i])) {
				index = i;
				System.out.println("수정하실 부품을 골라주세요.");
				System.out.println("1. 타이어 | 2. 범퍼 | 3. 전구");
				System.out.print("선택>");
				int menu = scanner.nextInt();
				scanner.nextLine();
				updatePartsData(menu);
				System.out.println("수정이 완료 되었습니다.");
				break;
			}
			if (i == count - 1) {
				System.out.println("수정하실 매장이 존재하지 않습니다.");
			}
		}
	}

	private static void updatePartsData(int parts) {
		System.out.print("수정하실 갯수를 입력하세요: ");
		int cnt = scanner.nextInt();
		switch (parts) {
		case 1:
			tireList[index] = cnt;
			break;
		case 2:
			bumperList[index] = cnt;
			break;
		case 3:
			bulbList[index] = cnt;
			break;
		default:
			System.out.println("잘 못 선택하셨습니다.");
		}
		System.out.println("-------storeData--------");
		System.out.println("매장이름 :" + store[index]);
		System.out.println("타이어갯수:" + tireList[index]);
		System.out.println("범퍼갯수:" + bumperList[index]);
		System.out.println("전구갯수:" + bulbList[index]);
		System.out.println("------------------------");
	}

	private static void insertStoreData() {
		scanner.nextLine();
		System.out.println("매장이름:");
		String name = scanner.next();
		scanner.nextLine();
		System.out.println("타이어갯수:");
		int tirecount = scanner.nextInt();
		scanner.nextLine();
		System.out.println("범퍼갯수:");
		int bumpercount = scanner.nextInt();
		scanner.nextLine();
		System.out.println("전구갯수:");
		int bulbcount = scanner.nextInt();
		scanner.nextLine();
		store[count] = name;
		tireList[count] = tirecount;
		bumperList[count] = bumpercount;
		bulbList[count] = bulbcount;
		count++;

	}

	// 입력된 정보를 출력하는 함수 구현
	private static void printStoreData() {
		for (int i = 0; i < count; i++) {
			System.out.println("-------storeData--------");
			System.out.println("매장이름 :" + store[i]);
			System.out.println("타이어갯수:" + tireList[i]);
			System.out.println("범퍼갯수:" + bumperList[i]);
			System.out.println("전구갯수:" + bulbList[i]);
			System.out.println("------------------------");
		}
	}
}
