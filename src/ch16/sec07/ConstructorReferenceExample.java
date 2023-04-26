package ch16.sec07;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person p = new Person();
		
		Member m1 =  p.getMember1(Member :: new); //생성자 참조
		System.out.println(m1);
		System.out.println();
		
		Member m2 = p.getMember2(Member :: new);
		System.out.println(m2);
	}
}	
