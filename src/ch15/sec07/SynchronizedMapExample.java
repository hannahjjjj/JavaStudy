package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
	public static void main(String[] args) {
		Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());
		
		Thread ta = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					map.put(i,"내용"+i);
				}
			}
		};
		
		Thread tb = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=2000; i++) {
					map.put(i,"내용"+i);
				}
			}
		};
		
		ta.start();
		tb.start();
		
		try {
			ta.join();
			tb.join();
		}catch(Exception e) {
			
		}
		
		int size = map.size();
		System.out.println("총 객체수:" + size);
		
	}
}
