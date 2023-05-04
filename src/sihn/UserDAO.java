package sihn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO implements IUserDAO {
	

	@Override
	   public ArrayList<UserVO> getAlluser() {
	      ArrayList<UserVO> userList = new ArrayList<UserVO>();
	      String sql = "select * from users";
	      Connection con = null;
	      try {
	         con = EMPDataSource.getConnection();
	         PreparedStatement stmt = con.prepareStatement(sql);
	         ResultSet rs = stmt.executeQuery();
	         while(rs.next()) {
	            UserVO user = new UserVO();
	            user.setUserId(rs.getString("userid"));
	            user.setUserName(rs.getString("username"));
	            user.setUserPassword(rs.getString("userpassword"));
	            user.setUserage(rs.getInt("userage"));
	            user.setUseremail(rs.getString("useremail"));
	            userList.add(user);
				System.out.printf("%-12s%-12s%-12s%-12s%-8S\n",
						user.getUserId(),
						user.getUserName(),
						user.getUserPassword(),
						user.getUserage(),
						user.getUseremail()
						);
	         }   
	      } catch(SQLException e) {
	         e.printStackTrace();
	      } finally {
	         EMPDataSource.closeConnection(con);
	      }
	      return userList;
	   }

	@Override
	public UserVO getUser(String userId) {
		UserVO vo = new UserVO(); 
		String sql = "SELECT userid,username,userage, useremail FROM users WHERE userid=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = EMPDataSource.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, userId);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				vo.setUserId(rs.getString("userid"));
				vo.setUserName(rs.getString("username"));
				vo.setUserage(rs.getInt("userage"));
				vo.setUseremail(rs.getString("useremail"));
			}
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			if(stmt!=null)try {stmt.close();}catch(Exception e) {}
			if(con!=null)try {con.close();}catch(Exception e) {}
		}
		return vo;
	}

	@Override
	   public int insertUser(UserVO vo) {
	      int count=0;
	      String sql = "insert into user (userid, username, userpassword, userage, useremail)" +
	               " values (?, ?, ?, ?, ?)";
	      Connection con = null;
	      try {
	         con = EMPDataSource.getConnection();
	         PreparedStatement stmt = con.prepareStatement(sql);
	         stmt.setString(1, vo.getUserId());
	         stmt.setString(2, vo.getUserName());
	         stmt.setString(3, vo.getUserPassword());
	         stmt.setInt(4, vo.getUserage());
	         stmt.setString(5, vo.getUseremail());
	         count = stmt.executeUpdate();
	      } catch(Exception e) {
	         throw new RuntimeException(e);
	      } finally {
	         EMPDataSource.closeConnection(con);
	      }
	      return count;
	   }

	@Override
	   public int updateUser(String userId) {
		UserVO vo = new UserVO(); 
	      int count=0;
	      String sql = "update user set username=?, useremail=? where userid=?";
	      Connection con = null;
	      try {
	         con = EMPDataSource.getConnection();
	         PreparedStatement stmt = con.prepareStatement(sql);
	         stmt.setString(1, vo.getUserName());
	         stmt.setString(2, vo.getUseremail());
	         stmt.setString(3, vo.getUserId());
	      } catch(Exception e) {
	         throw new RuntimeException(e);
	      } finally {
	         EMPDataSource.closeConnection(con);
	      }
	      return count;
	   }

	@Override
	public int deleteUser(UserVO vo) {
		int deleteRow = 0;
		String sql = "DELETE FROM users WHERE userid=?";
		Connection con = null;
		
		try {
			con=EMPDataSource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "userId");
			deleteRow = stmt.executeUpdate();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			EMPDataSource.closeConnection(con);
		}
		return deleteRow;
	}
	
}
