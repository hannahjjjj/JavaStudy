package ch06.sec14;

public class MemberService {
//	boolean login(String id, String password) {
//		if(id.equals("hong") && password.equals("12345")) {
//			return true;
//		}else {
//			return false;
//		}    // 일반적인 방법 null이 들어오면 프로그램이 멈추기 때문에 효율적이지 못함
//	}
	boolean login(String id, String password) {
		if("hong".equals(id) && "12345".equals(password)) {
			return true;
		}else {
			return false;
		} //좀 더 효율적
	}	
		void logout(String id) {
			System.out.println(id + "님이 로그아웃 되었습니다.");
		}
	
	
	
}
