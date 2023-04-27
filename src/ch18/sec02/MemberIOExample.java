package ch18.sec02;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
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
//		FileWriter w = null;
//		BufferedWriter o = null; //성능 향상
		
		FileOutputStream fos = null;
		DataOutputStream out = null;
		try {
			fos = new FileOutputStream("member.data");
			out = new DataOutputStream(fos);
			for(Member m : ml) {
				out.writeUTF(m.getName());
				out.writeInt(m.getAge());
				out.writeDouble(m.getSalary());
				out.writeUTF(m.getEmail());
			}
			System.out.println("File saved");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {out.close();}catch(Exception e) {}
		}
		
		
	}
}

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
class Member{
	private String name;
	private int age;
	private double salary;
	private String email;

	public String toCSV() {
		return name+","+age+","+salary+","+email;
	}
}
