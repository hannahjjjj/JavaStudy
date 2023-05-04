package sihn;

import java.util.ArrayList;

public interface IUserDAO {
	public ArrayList<UserVO> getAlluser();
	public UserVO getUser(String userId);
	public int insertUser (UserVO vo);
	public int updateUser (String userId);
	public int deleteUser (UserVO vo);
	
}
