package ch05.sec05;

import java.io.IOException;

public class EqualsExample {
	public static void main(String[] args) throws IOException {
		String strVar1="홍길동";
		String strVar2="홍길동";
		
		if(strVar1==strVar2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");
		}else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVal1과 strVal2은 문자열이 같음");
		}
		
		String strVar3=new String("홍길동");
		String strVar4=new String("홍길동");
		
		if(strVar3==strVar4) {
			System.out.println("strVal3과 strVal4는 참조가 같음");
		}else {
			System.out.println("strVal3과 strVal4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVal3과 strVal4은 문자열이 같음");
		}
	}
}
