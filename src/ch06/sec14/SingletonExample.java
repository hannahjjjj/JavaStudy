package ch06.sec14;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton o1 = Singleton.getInstance();
		Singleton o2 = Singleton.getInstance();
		
		if(o1==o2) {
			System.out.println("같은 Singleton객체 입니다.");
		}else {
			System.out.println("다른 Singleton객체 입니다.");			
		}
	}

}
