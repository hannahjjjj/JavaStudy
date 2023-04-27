package ch18.sec02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {
	public static void main(String[] args) {
		List<Member> ml = new ArrayList<>();
		FileReader r = null;
		BufferedReader b = null;
		
		try {
			r = new FileReader("member.csv");
			b = new BufferedReader(r);
			while(true) {
				String line=b.readLine();
				if(line==null||line.trim().length()==0)  //trim()은 앞뒤 공백 없애는 것 
					break;				
				String[] datas = line.split(",");
				String name = datas[0];
				int age = Integer.parseInt(datas[1]);
				double salary = Double.parseDouble(datas[2]);
				String email = datas[3];
				ml.add(new Member(name,age,salary,email));
			}
			System.out.println(ml.size());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {b.close();}catch(Exception e) {}
		}
	}
}
