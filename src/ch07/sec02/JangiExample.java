package ch07.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class JangiExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();//테스트 케이스 수
		for(int i=0; i<cnt; i++) {
			int mapsize = scan.nextInt();
			scan.nextLine();
			String [][] array = new String[mapsize][mapsize];
			for(int line=0; line<mapsize; line++) {
				String data = scan.nextLine();
				array[line]=data.split(" "); //한개행을 공백으로 잘라서 배열에 넣는것

			}

			//		System.out.println(Arrays.deepToString(array)); //확인용
			//알고리즘 작성
			int result = 0; //먹은 알의 수

			//x선  구하기

			int px = -1; //X가 있는 x좌표
			int py = -1; //X가 있는 y좌표
			outer: for(int y=0; y<mapsize; y++) {
				for(int x=0; x<mapsize; x++) {
					if(array[y][x].equals("X")) {
						px=x;
						py=y;
						break outer;

					}
				}
			}

			boolean isJumped = false; //처음 H를 만나면 true
			//오른쪽으로 찾아가면서..
			for(int x=px+1; x<mapsize; x++) {
				if(array[py][x].equals("L")) continue;
				if(array[py][x].equals("Y")) break;
				if(array[py][x].equals("H")) {
					if(isJumped) {
						result ++;
						break;
					}else {
						isJumped = true;
					}
				}
			}

			// 왼쪽으로
			isJumped = false; //다시 초기화
			for(int x=px-1; x>=0; x--) {
				if(array[py][x].equals("L")) continue;
				if(array[py][x].equals("Y")) break;
				if(array[py][x].equals("H")) {
					if(isJumped) {
						result ++;
						break;
					}else {
						isJumped = true;
					}
				}
			}
			//아래쪽
			isJumped = false;
			for(int y=py+1; y<mapsize; y++) {
				if(array[y][px].equals("L")) continue;
				if(array[y][px].equals("Y")) break;
				if(array[y][px].equals("H")) {
					if(isJumped) {
						result ++;
						break;
					}else {
						isJumped = true;
					}
				}
			}
			//위쪽
			isJumped = false;
			for(int y=py-1; y>=0; y--) {
				if(array[y][px].equals("L")) continue;
				if(array[y][px].equals("Y")) break;
				if(array[y][px].equals("H")) {
					if(isJumped) {
						result ++;
						break;
					}else {
						isJumped = true;
					}
				}
			}
			System.out.println("#"+(i+1)+" "+result);			
		}
		scan.close();
	}

}

