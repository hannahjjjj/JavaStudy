package ch20.sec01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"hr","hr");	
			String sql = "" + 
						"SELECT bno, btitle,bcontent, bwriter, bdate, bfilename, bfiledata "
					+	"FROM boards "
					+	"WHERE bwriter=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"winter");
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Board b = new Board();
				b.setBno(rs.getInt("bno"));
				b.setBtilte(rs.getString("btitle"));
				b.setBcontent(rs.getString("bcontent"));
				b.setBwriter(rs.getString("bwriter"));
				b.setBdate(rs.getDate("bdate"));
				b.setBfilename(rs.getString("bfilename"));
				b.setBfiledata(rs.getBlob("bfiledata"));
				
				System.out.println(b);
				
				Blob bl = b.getBfiledata();
				if(bl!=null) {
					InputStream is = bl.getBinaryStream();
					OutputStream os = new FileOutputStream(b.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}
			}
			rs.close();
			pstmt.close();
			
		}catch(Exception e) {
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
