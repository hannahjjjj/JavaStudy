package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		//List컬렉션 생성
		List<Product> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			Product p = new Product(i, "상품"+i, "멋진 회사", (int)(10000*Math.random()));
			list.add(p);
		}
		
		//객체 스트림 얻기
		Stream<Product> s = list.stream();
		s.forEach(p2-> System.out.println(p2));
	}
}
