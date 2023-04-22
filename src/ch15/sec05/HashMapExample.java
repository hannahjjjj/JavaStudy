package ch15.sec05;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("총 Entry 수:"+map.size());
		System.out.println();
		
		String key="홍길동";
		int value = map.get(key);
		System.out.println(key+":"+value);
		System.out.println();
		Set<String> ks = map.keySet();
		for(String key2 : ks) {
			System.out.println(map.get(key2));
		}
		
		Set<Entry<String,Integer>> es = map.entrySet();
		for(Entry<String,Integer> entry : es) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
