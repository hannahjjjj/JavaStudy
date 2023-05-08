package sihn;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	Connection con ;
	EMPDataSource ds;
	IUserDAO dao = new UserDAO(); 
	UserVO vo = new UserVO();

	public void mainMenu() {
		try {
			while(true) {
				System.out.println();
				System.out.println("====================================================");
				System.out.println("메인메뉴: 1.회원 조회 | 2.회원 수정 | 3.회원 탈퇴 | 4.회원 전체 조회  | 5.회원가입 | 6.종료	");
				System.out.println("메뉴 선택: ");
				System.out.println();
				String menuNo = scan.nextLine();
				switch(menuNo) {
				case "1" -> getUser();
				case "2" -> updateUser();
				case "3" -> deleteUser();
				case "4" -> getAllusers();
				case "5" -> insertUser();
				case "6" -> System.exit(0);
				}
			}
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	public void getUser() {
		System.out.println("ID를 입력하세요.");
		String userid = scan.nextLine();
		UserVO uservo = new UserVO();
		uservo = dao.getUser(userid);
		System.out.println(uservo);

	}

	public void updateUser() {
		System.out.println("ID를 입력하세요.");
		String userid = scan.nextLine();
		vo.setUserId(userid);
		System.out.println("이름: ");
		vo.setUserName(scan.nextLine());
		System.out.println("이메일: ");
		vo.setUserEmail(scan.nextLine());
		System.out.println();

		dao.updateUser(vo);
		System.out.println(vo);

	}

	public void deleteUser() {
		System.out.println("ID를 입력하세요.");
		String userid = scan.nextLine();
		vo.setUserId(userid);

		dao.deleteUser(vo);
		System.out.println( userid + "삭제완료" );

	}


	public void getAllusers(){

		ArrayList<UserVO> vo = dao.getAllusers();
		for(UserVO data:vo) {
			System.out.println(data);
		}
	}

	public void insertUser() {

		System.out.println("ID를 입력해주세요.");
		vo.setUserId(scan.nextLine());
		System.out.println("비밀번호를 입력해주세요");
		vo.setUserPassword(scan.nextLine());
		System.out.println("이름을 입력해주세요.");
		vo.setUserName(scan.nextLine());
		System.out.println("나이를 입력해주세요.");
		vo.setUserAge(scan.nextInt());
		scan.nextLine();
		System.out.println("이메일을 입력해주세요.");
		vo.setUserEmail(scan.nextLine());

		dao.insertUser(vo);

	}




	public static void main(String[] args) {
		Main m = new Main();
		m.mainMenu();

	}

}