package ch14;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mt = Thread.currentThread();
		System.out.println(mt.getName()+"실행");

		for(int i=0; i<3; i++) {
			Thread ta = new Thread() {
				@Override
				public void run() {
					System.out.println(getName()+"실행");
				}
			};
			ta.start();
		}
		Thread ct = new Thread() {
			@Override
			public void run() {
				System.out.println(getName()+"실행");
			}
		};
		ct.setName("chat-thread");
		ct.start();

	}
}
