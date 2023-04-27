package ch17.sec07;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample2 {
	public static void main(String[] args) {
		int [] intArray = {1,2,3,4,5};
		
		IntStream is = Arrays.stream(intArray);
		is.asDoubleStream()
			.forEach(d->System.out.println(d));
		System.out.println();
		is = Arrays.stream(intArray);
		is.boxed()
			.forEach(obj ->System.out.println(obj.intValue()));
	}
}
