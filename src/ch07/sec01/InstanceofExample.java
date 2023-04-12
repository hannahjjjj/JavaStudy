package ch07.sec01;



public class InstanceofExample {
	//main()메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(ch07.sec01.Person p) {
		System.out.println("name:" + p.name);
		p.walk();
		//person이 참조하는 객체가 Student 타입인지 확인
		if(p instanceof Student) {
			Student s = (Student) p;
			System.out.println("studentNo:" + s.studentNo);
			s.study();
		}
		
		// == java12버전 이상부터는
//		if(p instanceof Student s) {
//			System.out.println("studentNo:"+s.studentNo);
//			s.study();
//		} //이 방법이 있음
		
	
	}
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		System.out.println();
		Person p2 = new Student("김길동",10);
		personInfo(p2);
	}
}
