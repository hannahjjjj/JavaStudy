package ch07;

public class ChildExample2 {

	public static void main(String[] args) {
		
		//객체 생성 및 자동 형변환
		Parent p = new Child();   // == Child c = new Child(); Parent p = c;
		
		p.field1 = "data1";
		p.method1();
		p.method2();
		
//		p.field2 = "data2";
//		p.method3();  ==> 불가능 왜? --> 부모객체없어서
		
		//강제 형변환
		Child c = (Child) p;
		
		c.field2 = "data2";
		c.method3();
	}

}
