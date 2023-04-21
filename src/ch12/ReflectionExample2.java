package ch12;

import java.lang.reflect.*;

public class ReflectionExample2 {

	public static void main(String[] args) {
		Class c = Car.class;
		System.out.println("[생성자 정보]");
		Constructor[] cons = c.getDeclaredConstructors();
		for(Constructor con : cons) {
			System.out.println(con.getName()+"(");
			Class[] parameters = con.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드정보]");
		Field[] fs = c.getDeclaredFields();
		for(Field f : fs) {
			System.out.println(f.getType().getName()+" "+f.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] ms =c.getDeclaredMethods();
		for(Method m : ms) {
			System.out.println(m.getName() + "(");
			Class[] parameters = m.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	
	}
	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.println(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.println(",");
			}
		}
	}

}
