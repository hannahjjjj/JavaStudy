package ch20.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"hr","hr");	
			String sql ="SELECT userid,username,userpassword,userage,useremail " 
					+ "FROM users "
					+ "WHERE userid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"winter");
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				User u = new User();
				u.setUserId(rs.getString("userid"));
				u.setUserName(rs.getString("username"));
				u.setUserPassword(rs.getString("userpassword"));
				u.setUserAge(rs.getInt(4)); //컬럼순번이용
				u.setUserEmail(rs.getString(5));
				System.out.println(u);
			}else {
				System.out.println("사용자 아이디가 존재하지 않음");
			}
			rs.close();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				}catch(SQLException e) {}
			}
		}
	}
}
