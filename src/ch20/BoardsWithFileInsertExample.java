package ch20;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardsWithFileInsertExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"hr","hr");	
			
			String sql = "" + 
			"INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata)"
					+ "VALUES (SEQ_BNO.NEXTVAL, ?, ?, ? , SYSDATE, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno"});
			pstmt.setString(1, "눈 오는날");
			pstmt.setString(2, "함박눈이 내려요");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpg");
			pstmt.setBlob(5, new FileInputStream("src/ch20/snow.jpg"));
			
			pstmt.setString(1, "눈 오는날");
			pstmt.setString(2, "눈 사람을 만들어요");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpg");
			pstmt.setBlob(5, new FileInputStream("src/ch20/snow.jpg"));
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수:" + rows);
			
			if(rows==1) {
				ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				int bno = rs.getInt(1);
				System.out.println("저장된 bno:" + bno);
			}
			rs.close();
			}
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				}catch(SQLException e) {}
			}
		}
	}
}
