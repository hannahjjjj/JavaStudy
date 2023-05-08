package sihn;

import lombok.Data;

@Data
public class UserVO {
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;


	public String [] toArray() {
		return new String[] {
				userId +"" + userName + "" + userPassword + "" + userAge + "" + userEmail};
	}


	@Override
	public String toString() {
		return " ID = " + userId + ", 이름 = " + userName + ", Password = " + userPassword + ", 나이 = "
				+ userAge + ", Email = " + userEmail + "";
	}


}
