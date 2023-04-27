package ch18.sec03;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class MemberIOExample {
	public static void main(String[] args) {
		List<Member> ml = new ArrayList<>();
		ml.add(new Member("홍길동",20,300000,"hong@hong.com"));
		ml.add(new Member("홍길서",22,200000,"hong@hong.com"));
		ml.add(new Member("홍길남",28,350000.2,"hong@hong.com"));
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("member.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ml);
			System.out.println("data saved");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
class Member implements Serializable{ 
	private static final long serialVersionUID = -7793420755155740104L;
	private String name;
	private int age;
	private double salary;
	private String email;

	public String toCSV() {
		return name+","+age+","+salary+","+email;
	}
}
