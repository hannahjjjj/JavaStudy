package ch12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class ReflectionExample {
	   public static void main(String[] args) {
	      Class clz=Car.class;
	      System.out.println("[생성자 정보]");
      Constructor[] constructors=clz.getDeclaredConstructors();
      for(Constructor c:constructors) {
         System.out.print(c.getName()+"(");
         Class[] parameters=c.getParameterTypes();
         printParameters(parameters);
         System.out.println(")");
      }
      System.out.println();
      
      System.out.println("[필드 정보]");
      Field[] fields=clz.getDeclaredFields();
      for(Field f:fields) {
         System.out.println(f.getType().getName()+" "+f.getName());
      }
      System.out.println();
      
      System.out.println("[메소드 정보]");
      Method[] methods=clz.getDeclaredMethods();
      for(Method m:methods) {
         System.out.print(m.getName()+"(");
         Class[] parameters =m.getParameterTypes();
         printParameters(parameters);
         System.out.println(")");
      }
   }

   private static void printParameters(Class[] parameters) {
      for(int i=0;i<parameters.length;i++) {
         System.out.print(parameters[i].getName());
         if(i<parameters.length-1) {
            System.out.print(", ");
         }
      }
   }
}

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
class Car{
   @NonNull
   private String model;
   private String owner;
}
