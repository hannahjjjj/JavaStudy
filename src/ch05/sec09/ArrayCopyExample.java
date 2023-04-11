package ch05.sec09;

import java.io.IOException;
import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) throws IOException {
		int[] intArr= {3,5,7,14,11};
		int[] intArr2=intArr;
		int sum=0;
		intArr[0]=300;
		System.out.println(Arrays.toString(intArr));
		Arrays.sort(intArr2);
		for(int i=0;i<intArr.length;i++) {
			sum+=intArr[i];
		}
		System.out.println(sum);

		int sum2=0;
		for(int data:intArr) {
			sum2+=data;
		}
		System.out.println(sum2);
		
		String[] oldStrArray= {"java","array","copy"};
		
		String[] newStrArray=new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(String data:newStrArray) {
			System.out.print(data+", ");
		}
	}
}
