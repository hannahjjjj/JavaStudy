package ch03.sec09;

import java.io.IOException;

public class BitShiftExample {
	public static void main(String[] args) throws IOException {
		int pixel = 0xA400A5FF;// red:0xA4, green:0,blue 0xA5
		// red 성분만 뽑아내고싶다
		int red = pixel >>> 24;
		System.out.println(red);

		// blue값만 뽑아내고싶다
		int blue = pixel >>> 8;
		// 00000000 10100100 00000000 10101011 = 0x00A400A5
		// 00000000 00000000 00000000 11111111 = 0x000000FF &
		// 00000000 00000000 00000000 10101011 = 0x000000A5
		// Mask 연산방법...??
		System.out.println(blue);

		byte Key = 0b00000100;
		// 컨트롤키는 4, 알트키는 2, 쉬프트키는 1이라는 값을 할당 했다고 가정
		// key 컨트롤키가 눌려진것으로 간주
		if(Key==4) {
			System.out.println("컨트롤키");
		}
		
		byte key2= 0b00000110;
		if((key2 & 0x04)>0) {
			System.out.println("컨트롤키 눌러짐");
		}
		
	}
}
