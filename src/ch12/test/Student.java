package ch12.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor//생성자 선언
//@Data//해쉬코드 equals 만들어줌

public class Student {
	private String studentNum;
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(s.getStudentNum().equals(this.studentNum)) {
				return true;
			}
		}
		return false;
	}
}
