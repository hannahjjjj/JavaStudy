package ch14;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread wa = new WorkThread("wa");
		WorkThread wb = new WorkThread("wb");
		wa.start();
		wb.start();
		
		try {Thread.sleep(5000);}catch(InterruptedException e) {}
		wa.work = false;
		try {Thread.sleep(5000);}catch(InterruptedException e) {}
		wa.work = true;
	}
}
