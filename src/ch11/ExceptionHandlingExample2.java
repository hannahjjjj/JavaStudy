package ch11;

public class ExceptionHandlingExample2 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String이 존재합니다");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			Class.forName("java.lang.String2");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
