package ch05.sec09;

import java.io.IOException;

public class ArrayCopyByForExample {
	public static void main(String[] args) throws IOException {
		int[] oldintArray= {1,2,3};
		
		int[] newIntArray=new int[5];
		
		for(int i=0;i<oldintArray.length;i++) {
			newIntArray[i]=oldintArray[i];
		}
		
		for(int i=0;i<newIntArray.length;i++) {
			System.out.print(newIntArray[i]+", ");
		}
	}
}
