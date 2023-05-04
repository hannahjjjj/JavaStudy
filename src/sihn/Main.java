package sihn;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner scan = new Scanner(System.in);
	private Connection con ;
	EMPDataSource ds;
	UserDAO dao = new UserDAO(); 
	
	
	public void mainMenu() {
		System.out.println();
		System.out.println("====================================================");
		System.out.println("메인메뉴: 1.회원 조회 | 2.회원 수정 | 3.회원 탈퇴 | 4.회원 전체 조회  | 5.종료");
		System.out.println("메뉴 선택: ");
		System.out.println();
		String menuNo = scan.nextLine();
		switch(menuNo) {
		case "1" -> getUser();
		case "2" -> updateUser();
		case "3" -> deleteUser();
		case "4" -> getAlluser();
		case "5" -> ds.closeConnection(con);
		}
	}
	public void getUser() {
		String userid = scan.nextLine();
		UserVO uservo = new UserVO();
		uservo = dao.getUser(userid);
		System.out.println(uservo);
		
		
	}
	
	public void updateUser() {
		String userid = scan.nextLine();
		UserVO uservo = new UserVO();
	
		System.out.println(uservo);
	}
	
	public void deleteUser() {
		
	}
	
	public void getAlluser(){
		 dao.getAlluser();
	}
	
	
	

	public static void main(String[] args) {
		Main m = new Main();
		m.mainMenu();
		
	}

}
