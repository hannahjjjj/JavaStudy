package ch15.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Board> bl = new ArrayList<>();
		
		bl.add(new Board("제목1","내용1","글쓴이1"));
		bl.add(new Board("제목2","내용2","글쓴이2"));
		bl.add(new Board("제목3","내용3","글쓴이3"));
		bl.add(new Board("제목4","내용4","글쓴이4"));
		bl.add(new Board("제목5","내용5","글쓴이5"));
		
		int size = bl.size();
		System.out.println("총 객체수:" + size);
		System.out.println();
		
		//특정 인덱스 객체 가져오기
		for(int i=0; i<bl.size(); i++) {
			Board b = bl.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		System.out.println();
		Board list =new Board("제목5","내용5","글쓴이5555");
		bl.add(list);
		for(Board b : bl) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
//		bl.remove(2);
//		bl.remove(2);
		bl.remove(list);
		
		for(Board b : bl) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
	}
}
