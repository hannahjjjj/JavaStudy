package ch13.sec02;

public class GenericExample {
	public static <T>Box<T> boxing(T t){
		Box<T> b = new Box<T>();
		b.setT(t);
		return b;
	}
	
	public static void main(String[] args) {
		Box<Integer> b1 = boxing(100);
		int intValue = b1.getT();
		System.out.println(intValue);
		
		Box<String> b2 = boxing("홍길동");
		String strValue = b2.getT();
		System.out.println(strValue);
	}
}
