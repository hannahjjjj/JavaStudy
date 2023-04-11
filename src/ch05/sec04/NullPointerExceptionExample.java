package ch05.sec04;

import java.io.IOException;

public class NullPointerExceptionExample {
	public static void main(String[] args) throws IOException {
		int[] intArray=null;
		//intArray[0]=10;//NullPointException
		String str=null;
		//System.out.println("총 문자 수: "+str.length());
	}
}
