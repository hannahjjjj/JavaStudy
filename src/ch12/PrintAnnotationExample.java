package ch12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception{
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method m : declaredMethods) {
			PrintAnnotation pa = m.getAnnotation(PrintAnnotation.class);

			printLine(pa);
			m.invoke(new Service());
			printLine(pa);
		}	
	}
	
	public static void printLine(PrintAnnotation pa) {
		if(pa!=null) {
			int number = pa.number();
			for(int i=0; i<number; i++) {
				String value = pa.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
