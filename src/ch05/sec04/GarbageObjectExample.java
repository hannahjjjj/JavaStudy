package ch05.sec04;

import java.io.IOException;

public class GarbageObjectExample {
	public static void main(String[] args) throws IOException {
		String hobby="여행";
		hobby=null;
		
		String kind1="자동차";
		String kind2=kind1;
		kind1=null;
		System.out.println("kind2: "+kind2);
		
	}
}
