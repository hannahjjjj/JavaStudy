package test;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Hello extends Exception {
	public static void main(String[] args) {
		LinkedList<Character> l = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n, m;
		n = Integer.parseInt(str);
		str=sc.next();
		m = Integer.parseInt(str);
		str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			l.add(str.charAt(i));
		}
		ListIterator<Character> it = l.listIterator(l.size());
		for (int i = 0; i < m; i++) {
			str = sc.next();
			switch (str) {
			case "L": // 맨 앞이면 무시 아니면 앞의 위치로 이동
				if(it.hasPrevious()) {
					it.previous();
				}
				break;
			case "R": // 맨 뒤라면 무시 아니면 뒤의 위치로 이동
				if(it.hasNext()) {
					it.next();
				}
				break;
			case "D": // 맨 뒤라면 무시, 바로 뒤에 있는 빵 제거
				if(it.hasNext()) {
					it.next();
					it.remove();
				}
				break;
			case "P":
				String str1=sc.next();
				it.add(str1.charAt(0));
				break;
			}
		}
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i));
		}
	}

	public static void bread(String str,ListIterator<Character> it) {
		
	}
}