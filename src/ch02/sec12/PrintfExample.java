package ch02.sec12;

import java.util.Date;

public class PrintfExample {
	public static void main(String[] args) {
		int value=123;
		System.out.printf("상품의 가격:%d원\n",value);
		System.out.printf("상품의 가격:%6d원\n",value);
		System.out.printf("상품의 가격:%-6d원\n",value);
		System.out.printf("상품의 가격:%06d원\n",value);

		double area=3.141592*10*10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);
		
		String name="홍길동";
		String job="도적";
		System.out.printf("%6d | %-10s | %10s\n",1,name,job);
		
		
		Date d=new Date();
		Date a=new Date(100000000L);
		
		
		//연도 출력 
		System.out.printf("%ty \n",d);
		//연,월,일 출력
		System.out.printf("%ty-%tm-%td \n",d,d,d);
		System.out.printf("%1$ty-%1$tm-%2$td \n",d,a);
	}
}
