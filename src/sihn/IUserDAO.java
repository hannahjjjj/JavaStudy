package sihn;

import java.util.ArrayList;

public interface IUserDAO {
	public ArrayList<UserVO> getAllusers();
	public UserVO getUser(String userId);
	public int insertUser (UserVO vo);
	public int updateUser (UserVO vo);
	public int deleteUser (UserVO vo);
	
}
