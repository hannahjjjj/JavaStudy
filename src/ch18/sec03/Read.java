package ch18.sec03;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Read {
	public static void main(String[] args) {

		List<Member> ml = new ArrayList<>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("member.ser");
			ois = new ObjectInputStream(fis);
			ml = (List<Member>)ois.readObject();   //오브젝트로 리턴되기때문에 형변환 필수

		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(ml.size());
	}
}

