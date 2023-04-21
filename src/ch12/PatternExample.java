package ch12;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치 합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		 regExp = "\\w+@\\w+\\.\\w+(\\.\\W+)?";
		 data = "angel@mycompanycom";
		 result = Pattern.matches(regExp, data);
			if(result) {
				System.out.println("정규식과 일치 합니다.");
			}else {
				System.out.println("정규식과 일치하지 않습니다.");
			}
			
		String data2 = "홍길동, 서울, 010-1234-5678,30,M";
		String maskedData = data.replaceAll("\\d{3}-\\d{4}-\\d{4}","****-****-****");
		// \\두 번 쓰인 이유: \n 역슬래쉬 뒤는 탈출문자로 간주 그래서 \뒤에 \를 한번 더 해줘야한다. \가 그대로 표현되게 해야하기때문에 java에서는 꼭 하나씩 더 넣어줘야함
	}
}
