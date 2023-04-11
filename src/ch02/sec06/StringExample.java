package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		String name="홍길동";
		String job="프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str="나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		
		String str2="Hello\rWorld";
		System.out.println(str2);
		
		str="번호\t직업\t이름";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
		System.out.println();
//		str="""
//				나는 자바를 \
//				학습합니다.
//				나는 자바 고수가 될 것 입니다.
//				""";
//		System.out.println(str);
	}
}
