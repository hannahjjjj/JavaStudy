package ch17.sec03;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		String[] arr = {"홍길동","신용권","김미나"};
		Stream<String> strStream = Arrays.stream(arr);
		strStream.forEach(item->System.out.print(item+","));
		System.out.println();
		
		int[] intArr = {1,2,3,4,5};
		IntStream is = Arrays.stream(intArr);
		is.forEach(item->System.out.print(item+","));
		System.out.println();
		
	}
}
