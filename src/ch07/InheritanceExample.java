package ch07;

public class InheritanceExample {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 20, "2014280191");
		
		
//		s1.name ="홍길동";//부모객체에게 물려받은 name이 있음
//		s1.age = 20;
//		s1.studentId = "2014280191";
		System.out.println(s1.getDetails()); //주소로 나옴

	}

}
