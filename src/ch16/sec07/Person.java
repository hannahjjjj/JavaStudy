package ch16.sec07;

public class Person {
	public Member getMember1 (Creatable1 c1) {
		String id ="winter";
		Member m = c1.create(id);
		return m;
	}
	
	public Member getMember2 (Creatable2 c2) {
		String id ="winter";
		String name  = "한겨울";
		Member m = c2.create(id,name);
		return m;
	}
}
