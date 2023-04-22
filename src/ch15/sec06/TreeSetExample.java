package ch15.sec06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<>();
		
		score.add(87);
		score.add(98);
		score.add(75);
		score.add(95);
		score.add(80);
		
		for(Integer s : score) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("가장 낮은 점수:" + score.first());
		System.out.println("가장 높은 점수:" + score.last());
		System.out.println("95점 아래 점수:" + score.lower(95));
		System.out.println("95점 위의 점수:" + score.higher(95));
		System.out.println("95점이거나 바로 아래 점수:" + score.floor(95));
		System.out.println("85점이거나 바로 위의 점수:" + score.ceiling(85));
	
		NavigableSet<Integer> ds = score.descendingSet();
		for(Integer s: ds) {
			System.out.print(s+" ");
		}
		System.out.println();
		//범위검색 (80<=)
		NavigableSet<Integer> rs = score.tailSet(80, true);
		for(Integer s : rs) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		rs = score.subSet(80, true, 90, false);
		for(Integer s: rs) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
