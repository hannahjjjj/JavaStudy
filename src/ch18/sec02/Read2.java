package ch18.sec02;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read2 {
	public static void main(String[] args) {
		List<Member> ml = new ArrayList<>();
		FileInputStream r = null;
		DataInputStream d = null;
		
		try {
			r = new FileInputStream("member.data");
			d = new DataInputStream(r);
			while(true) {
				if(d.available()<=0) break;
				String name = d.readUTF();
				if(name==null || name.trim().length()==0) {
					break;
				}
				int age = d.readInt();
				double salary = d.readDouble();
				String email = d.readUTF();
				Member m = new Member(name, age, salary, email);
				System.out.println(m);
				ml.add(m);
			}
			System.out.println(ml.size());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {r.close();}catch(Exception e) {}
		}
	}
}


