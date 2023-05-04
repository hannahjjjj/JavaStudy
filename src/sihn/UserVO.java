package sihn;

import lombok.Data;

@Data
public class UserVO {
	private String userId;
	private String userName;
	private String userPassword;
	private int userage;
	private String useremail;


public String [] toArray() {
	return new String[] {
			userId +"" + userName + "" + userPassword + "" + userage + "" + useremail};
	}
}
