package ch05;

import java.io.IOException;
import java.util.Arrays;

public class MemoryExample {
	public static void main(String[] args) throws IOException {
		// 배열 - 크기를 변경할 수없다. 동종모음
		// 배열을 사용하려면 데이터의 개수를 기억하는 변수, 현재 위치를 기억하는 변수
		int[] array = new int[10];
		int count = 0;
		int index = -1;

		// 배열에 데이터 추가하기
		array[count] = 30;
		count++;
		array[count++] = 40;
		array[count++] = 50;
		System.out.println(Arrays.toString(array));

		// 배열 데이터 전체 출력
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		//배열 데이터 검색
		for (int i = 0; i < count; i++) {
			if (array[i] == 80) {
				index=1;
			}
		}
		System.out.println(index);
		try {
			array[index]=60;//수정
			System.out.println(array[index]);
		} catch (Exception e) {
			System.out.println("엾음");
		}
	}
}
