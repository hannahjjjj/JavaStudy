package ch15.sec02;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		Thread ta = new Thread() {
		@Override
		public void run() {
			for(int i=1; i<=1000; i++) {
				list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
			}
		}
		};
		
		
		Thread tb = new Thread(){	
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
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
		int size = list.size();
		System.out.println("총 객체수:"+ size);
		System.out.println();
	}
}
