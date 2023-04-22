package ch15.sec06;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple",10);
		treeMap.put("forever",60);
		treeMap.put("description",40);
		treeMap.put("ever",50);
		treeMap.put("zoo",80);
		treeMap.put("base",20);
		treeMap.put("guess",70);
		treeMap.put("cherry",30);
		
		Set<Entry<String,Integer>> es = treeMap.entrySet();
		for(Entry<String,Integer> e : es) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
		System.out.println();
		
		//특정된 키 값 가져오기
		Entry<String,Integer> e = null;
		e = treeMap.firstEntry();
		System.out.println("제일 앞단어:" + e.getKey() + "-" + e.getValue());
		e = treeMap.lastEntry();
		System.out.println("제일 뒷단어:" + e.getKey() + "-" + e.getValue());
		e = treeMap.lowerEntry("ever");
		System.out.println("ever 앞 단어"+e.getKey() + "-"+e.getValue());
		
		NavigableMap<String,Integer> dm = treeMap.descendingMap();
		Set<Entry<String,Integer>> des = dm.entrySet();
		for(Entry<String,Integer> ee : des) {
			System.out.println(ee.getKey() + "-" + ee.getValue());
		}
		System.out.println();
		
		System.out.println("[c~h 사이의 단어 검색]");
		NavigableMap<String,Integer> rm = treeMap.subMap("c", true, "h", false);
		for(Entry<String,Integer> ee : rm.entrySet()) {
			System.out.println(ee.getKey() + "-" + ee.getValue());
		}
		
		
	}
}
