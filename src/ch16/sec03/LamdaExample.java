package ch16.sec03;

public class LamdaExample {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.action1((name,job)->{
			System.out.println(name + "이");
			System.out.println(job + "을 하고 있습니다.");
		});
		
		p.action2((content)->{
			System.out.println(content+"라고 외칩니다.");
		});
	}
}
