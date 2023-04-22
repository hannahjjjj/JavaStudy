package ch15.sec07;

public class Main {
	public static void main(String[] args) {
		CounterRunner cr = new CounterRunner();
		Thread t1 = new Thread(cr);
		t1.start();
		
		QuestionRunner qr = new QuestionRunner();
		Thread t2 = new Thread(qr);
		t2.start();
	}
}
