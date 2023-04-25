package ch15.sec07;

import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Fruit> ts  = new TreeSet<Fruit>(new FruitComparator());
		
		ts.add(new Fruit("포도", 3000));
		ts.add(new Fruit("수박", 10000));
		ts.add(new Fruit("딸기", 8000));
		
		for(Fruit f : ts) {
			System.out.println(f.name + ":" + f.price);
		}
	}
}
