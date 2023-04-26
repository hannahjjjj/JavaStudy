package ch17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("김자바");
		
		//stream을 쓰는 이유는 다른 stream과 연결이 용이
		Stream<String> s = set.stream();
		s.forEach(name->System.out.println(name));
		
		List<String> list = new ArrayList<>();
		list.add("kosa");
		list.add("Hello");
		list.add("World");
		
		Iterator<String> listIter = list.iterator();
		while(listIter.hasNext()) {
			String data = listIter.next();
			System.out.println(data);
		}
		
		//1.5 Enhanced for loop
		for(String data : list) {
			System.out.println(data);
		}
		
		//1.8
		Stream<String> s2 = list.stream();
		s2.forEach(item->System.out.println(item));
		
		//길이가 4보다 큰 list의 문자열 구하기
		
		   int sum = 0;
		      for(String data : list) {
		    	  if(data.length()>4) {
		    		  sum = sum + data.length();		    		  
		    	  }
		      }
		      System.out.println(sum);
		      Stream<String> s3 = list.stream();
		      Stream<String> filterStream = s3.filter(item -> item.length()>4);
		      IntStream mapStream = filterStream.mapToInt(item -> item.length());
		      int result = mapStream.sum();
		      System.out.println(result);
		      
		      int result2 = list.stream()
		    		  		.filter(item -> item.length()>4)
		    		  		.mapToInt(item -> item.length())
		    		  		.sum();
		      System.out.println(result2);
		
	}
}
