package ch13.sec03;

public class GenericExample {
	public static void main(String[] args) {
		Course.registerCourse1(new Application<Person>(new Person()));
		Course.registerCourse1(new Application<Worker>(new Worker()));
		Course.registerCourse1(new Application<Student>(new Student()));
		Course.registerCourse1(new Application<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Application<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		Course.registerCourse2(new Application<Student>(new Student()));
		Course.registerCourse2(new Application<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Application<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		Course.registerCourse3(new Application<Person>(new Person()));
		Course.registerCourse3(new Application<Worker>(new Worker()));
	}
}
