package ch13.sec03;

public class Course {
	//모든 사람이면 등록 가능
	public static void registerCourse1(Application<?> app) {
		System.out.println(app.kind.getClass().getSimpleName()+"이(가) Course1을 등록함");
	}
	
	//학생만
	public static void registerCourse2(Application<? extends Student>app) {
		System.out.println(app.kind.getClass().getSimpleName()+"이(가) Course2를 등록함");
	}
	
	//직장인 일반인만 등록가능 
	public static void registerCourse3(Application<? super Worker> app) {
		System.out.println(app.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
	}
}
