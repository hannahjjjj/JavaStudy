package ch03.sec06;

import java.io.IOException;

public class CompareOperatorExample {
	public static void main(String[] args) throws IOException {
		int num1= 10;
		int num2=10;
		boolean result1=(num1==num2);
		boolean result2=(num1!=num2);
		boolean result3=(num1<=num2);
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		
		char char1='A';
		char char2='B';
		boolean result4=(char1<char2);
		System.out.println("result4: "+result4);
		
		int num3=1;
		double num4=1.0;
		boolean result5=(num3==num4);
		System.out.println("result5: "+result5);
		
		float num5=0.1f;
		double num6=0.1;
		result1=(num5==num6);
		System.out.println("result6: "+result1);
		result1=(num5==(float)num6);
		System.out.println("result7: "+result1);
		
		String str1="자바";
		String str2="Java";
		result1=(str1.equals(str2));
		System.out.println("result8: "+result1);
		result1=(!str1.equals(str2));
		System.out.println("result9: "+result1);
		
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello");
		
		System.out.println();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}
}
