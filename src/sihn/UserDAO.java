package sihn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO implements IUserDAO {


	@Override
	public ArrayList<UserVO> getAllusers() {
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
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				userList.add(user);
			}   
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} finally {
			EMPDataSource.closeConnection(con);
		}
		return userList;
	}

	@Override
	public UserVO getUser(String userId) {
		UserVO vo = null; 
		String sql = "SELECT userid,username,userage, useremail FROM users WHERE userid=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = EMPDataSource.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, userId);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				vo = new UserVO();
				vo.setUserId(rs.getString("userid"));
				vo.setUserName(rs.getString("username"));
				vo.setUserAge(rs.getInt("userage"));
				vo.setUserEmail(rs.getString("useremail"));
			}
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			EMPDataSource.closeConnection(con);
			if(stmt!=null)try{stmt.close();}catch(Exception e) {}
		}
		return vo;
	}

	@Override
	public int insertUser(UserVO vo) {
		int count=0;
		String sql = "insert into users (userid, username, userpassword, userage, useremail)" +
				" values (?, ?, ?, ?, ?)";
		Connection con = null;
		try {
			con = EMPDataSource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, vo.getUserId());
			stmt.setString(2, vo.getUserName());
			stmt.setString(3, vo.getUserPassword());
			stmt.setInt(4, vo.getUserAge());
			stmt.setString(5, vo.getUserEmail());
			count = stmt.executeUpdate();
		} catch(Exception e) {
			throw new RuntimeException(e);
		} finally {
			EMPDataSource.closeConnection(con);
		}
		return count;
	}

	@Override
	public int updateUser(UserVO vo) {
		int count=0;
		String sql = "update users set username=?, useremail=? where userid=?";
		Connection con = null;
		try {
			con = EMPDataSource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, vo.getUserName());
			stmt.setString(2, vo.getUserEmail());
			stmt.setString(3, vo.getUserId());
			count = stmt.executeUpdate();
		} catch(SQLException e) {
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
			stmt.setString(1, vo.getUserId());
			deleteRow = stmt.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			EMPDataSource.closeConnection(con);
		}
		return deleteRow;
	}

}
