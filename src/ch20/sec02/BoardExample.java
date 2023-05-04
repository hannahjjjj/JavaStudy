package ch20.sec02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample {
	private Scanner scan = new Scanner(System.in);
	private Connection conn ;
	public BoardExample() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"hr","hr");	
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("====================================================");
		System.out.printf("%-6s%-12s%-16s%-40s\n","no","writer","date","title");
		System.out.println("====================================================");
		
		try {
			String sql = "" +
						"SELECT bno, btitle, bcontent, bwriter, bdate " +
						"FROM boards " +
						"ORDER BY bno DESC";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Board b = new Board();
				b.setBno(rs.getInt("bno"));
				b.setBtilte(rs.getString("btitle"));
				b.setBcontent(rs.getString("bcontent"));
				b.setBwriter(rs.getString("bwriter"));
				b.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s\n",
						b.getBno(),
						b.getBwriter(),
						b.getBdate(),
						b.getBtilte()
						);
				}
			rs.close();
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
			exit();
		}
		mainMenu();
		
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("====================================================");
		System.out.println("메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.println("메뉴 선택: ");
		System.out.println();
		String menuNo = scan.nextLine();
		switch(menuNo) {
		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();
		}
	}
	
	public void create() {
		Board b = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.println("제목: ");
		b.setBtilte(scan.nextLine());
		System.out.println("내용: ");
		b.setBcontent(scan.nextLine());
		System.out.println("작성자: ");
		b.setBwriter(scan.nextLine());
		
		System.out.println("====================================================");
		System.out.println("보조 메뉴: 1.OK | 2.Cancel");
		System.out.println("메뉴 선택: ");
		String menuNo = scan.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = ""+
						"INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate)" +
						"VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, b.getBtilte());
				pstmt.setString(2, b.getBcontent());
				pstmt.setString(3, b.getBwriter());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		list();
	}
	public void read() {
		System.out.println("[게시물 읽기]");
		System.out.println("bno: ");
		int bno = Integer.parseInt(scan.nextLine());
		try {
			String sql = "" +
					"SELECT bno, btitle, bcontent, bwriter, bdate " +
					"FROM boards " +
					"WHERE bno=?";
			PreparedStatement pstmt;
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Board b = new Board();
				b.setBno(rs.getInt("bno"));
				b.setBtilte(rs.getString("btitle"));
				b.setBcontent(rs.getString("bcontent"));
				b.setBwriter(rs.getString("bwriter"));
				b.setBdate(rs.getDate("bdate"));
				System.out.println("############");
				System.out.println("번호: " + b.getBno());
				System.out.println("제목: " + b.getBtilte());
				System.out.println("내용: " + b.getBcontent());
				System.out.println("작성자: " + b.getBwriter());
				System.out.println("날짜: " + b.getBdate());
				System.out.println("############");
				System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
				System.out.println("메뉴 선택: ");
				String menuNo = scan.nextLine();
				System.out.println();
				
				if(menuNo.equals("1")) {
					update(b);
				}else if(menuNo.equals("2")) {
					delete(b);
				}
			}
			rs.close();
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		
		
		list();
	}
	public void clear() {
		System.out.println("====================================================");
		System.out.println("보조 메뉴: 1.OK | 2.Cancel");
		System.out.println("메뉴 선택: ");
		String menuNo = scan.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = "TRUNCATE TABLE boards";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}
	
	public void exit() {
		if(conn!=null) {
			try {
				conn.close();
			}catch(SQLException e) {
				
			}
		}
		System.out.println("**게시판 종료**");
		System.exit(0);
	}
	public void update(Board b) {
		System.out.println("[수정 게시물 입력]");
		System.out.println("제목: ");
		b.setBtilte(scan.nextLine());
		System.out.println("내용: ");
		b.setBcontent(scan.nextLine());
		System.out.println("작성자: ");
		b.setBwriter(scan.nextLine());
		
		System.out.println("====================================================");
		System.out.println("보조 메뉴: 1.OK | 2.Cancel");
		System.out.println("메뉴 선택: ");
		String menuNo = scan.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = ""+
						"UPDATE boards SET btitle=?,bcontent=?, bwriter=?" + 
						"WHERE bno=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, b.getBtilte());
				pstmt.setString(2, b.getBcontent());
				pstmt.setString(3, b.getBwriter());
				pstmt.setInt(4, b.getBno());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}
	
	public void delete(Board b) {
		try {
			String sql = "DELETE FROM boards WHERE bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b.getBno());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		list();
	}
	public static void main(String[] args) {
		BoardExample e  = new BoardExample();
		e.list();
	}
}
