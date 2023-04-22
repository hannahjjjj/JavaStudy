package ch15.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello");
		list.add(100);
		list.add(new Board("1", "2", "3"));
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		List<Board> bl = new ArrayList<>();
//		bl.add("Hello"); //에러
		bl.add(new Board("1","2","3"));
		bl.add(new Board("2","2","2"));
		bl.add(new Board("3","3","4"));
		bl.add(new Board("4","4","4"));
		for(Board board : bl) {
			System.out.println(board);
		}
	}
}
