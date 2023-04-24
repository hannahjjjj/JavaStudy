package ch14;

public class JoinExample {
	public static void main(String[] args) {
		SumThread s = new SumThread();
		s.start();
		try {
			s.join();
		}catch(InterruptedException e) {
			
		}
		System.out.println("1~10까지의 합: "+s.getSum());
	}
}
