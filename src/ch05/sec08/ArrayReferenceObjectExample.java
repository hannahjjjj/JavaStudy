package ch05.sec08;

import java.io.IOException;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) throws IOException {
		String[] strArray=new String[3];
		strArray[0]="Java";
		strArray[1]="Java";
		strArray[2]=new String("Java");
		
		System.out.println(strArray[0]==strArray[1]);//true -같은 객체 참조
		System.out.println(strArray[0]==strArray[2]);//false -같은 객체 참조
		System.out.println(strArray[0].equals(strArray[2]));//true -문자열이 동일
		
	}
}
