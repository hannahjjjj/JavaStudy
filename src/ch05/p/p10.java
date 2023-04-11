package ch05.p;

import java.io.IOException;

public class p10 {
	public static void main(String[] args) throws IOException {
		int[] array= {2,3,5,7,11,13,17,0,0,0};
		
		int index=2;
		
		int count=9;
		
		/*
		 * for(int i=index;i<count-1;i++) { array[i]=array[i+1]; } count--;
		 */
		
		for(int i=count;i>index;i--) {
			array[i]=array[i-1];
		}
		array[index]=2;
		count++;
	}
}
