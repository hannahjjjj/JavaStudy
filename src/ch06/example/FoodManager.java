package ch06.example;

import java.util.Scanner;

public class FoodManager {
	static final int MAX = 100;
	static Food[] fl = new Food[MAX];
	static int index = -1; // 0부터 시작하면 이미 값이 있는걸로 인식
	static int count = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	private static void insertFood() {
		Food f = new Food();
		System.out.println("식품이름:");
		f.foodName = scan.next();
		System.out.println("수량:");
		f.count = scan.nextInt();
		System.out.println("유통기한:");
		f.expDate = scan.next();
		System.out.println("설명:");
		f.etc = scan.next();
		fl[count++] = f;
	}
	
	
	private static void printFoodList() {
		System.out.println("==========================");
		System.out.println("이름\t수량\t유통기한\t설명");
		System.out.println("==========================");
		for(int i=0; i<count; i++) {
			System.out.printf("%s\t%d\t%s\t%s", fl[i].foodName,fl[i].count,fl[i].expDate,fl[i].etc);
			System.out.println("==========================");
}
	}
	
	public static void updateFoodCount() {
		System.out.println("수정 할 식자재 이름을 입력하세요.");
		String food = scan.next();
		for(int i=0; i<count; i++) {
			if(fl[i].foodName.equals(food)) {
				System.out.println("수량을 입력하세요");
				int cnt = scan.nextInt();
				if(cnt==0) {
					for(int j=i; j<count-1; j++) {
						fl[j] = fl[j+1];
					}
					count --;
				}else {
					fl[i].count = cnt;
				}
				return;
			}
		}
		System.out.println("수정할 식자재가 없습니다");
	}

	private static void deleteFood() {
		System.out.println("삭제 할 식자재 이름을 입력하세요.");
		String food = scan.next();
		for(int i=0; i<count; i++) {
			if(fl[i].foodName.equals(food)) {
				for(int j=i; j<count-1; j++) {
					fl[j] = fl[j+1];
				}
				count--;
				return;
			}
		}
		System.out.println("삭제할 식자재가 없습니다.");
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1.추가, 2.목록보기, 3.수정, 4.삭제, 0.종료");
			System.out.println("메뉴:");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("새로운 식자재를 추가합니다.");
				insertFood();
				break;
			case 2:
				System.out.println("식자재 목록을 출력합니다.");
				printFoodList();
				break;
			case 3:
				System.out.println("식자재 목록을 수정합니다.");
				updateFoodCount();
				break;
			case 4:
				System.out.println("식자재 정보를 삭제합니다.");
				deleteFood();
				break;
			case 0:
				System.out.println("식자재 관리 프로그램을 종료합니다.");
				System.exit(0);
				scan.close();
				break;
			default:
				System.out.println("잘못된 메뉴입니다");
				break;
		}
		
		
		
		
		}
	}




}

