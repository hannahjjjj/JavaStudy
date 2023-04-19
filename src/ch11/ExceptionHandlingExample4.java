package ch11;

public class ExceptionHandlingExample4 {
	public static void main(String[] args) {
		String [] array = {"100","1oo"};

		for(int i=0; i<=array.length; i++) {
			try {
				int v = Integer.parseInt(array[i]);
				System.out.println("array[" + i +"]:" + v);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨"+e.getMessage());
			}catch(Exception e) {
				System.out.println("실행에 문제가 있습니다.");
			}
		}
	}
}
