package ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;


//필드 초기화하는 방법 => 생성자 선언,set메서드
public class ConnectionPoolExample {
	//set메서드로 만들어져 있음 
	//datasource 설정 (db가 여러개면 여러개 선언)
	private static BasicDataSource dataSource;
	static {
		//내부적으로 DB연결할 때 발생하는 예외는 RuntimeException으로 넘어가줌 
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("hr");
		dataSource.setPassword("hr");
		dataSource.setInitialSize(10);
		dataSource.setMaxTotal(20); //최대 커넥션 할 수 있는~
	}
	public static void main(String[] args) {
		System.out.println(getEmpCount());
	}
	public static int getEmpCount() {
		String sql = "SELECT count (*) FROM employees";
		//원래는..
		Connection con = null;
		int rowCount = 0;
		try {
//			con=DriverManager.getConnection(url); 이거였다면..
			con = dataSource.getConnection(); //이제는 이렇게
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			rowCount = rs.getInt(1);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(con!=null) 
				try {con.close();}catch(Exception e) {}
				
		}
		return rowCount;
	}
}
