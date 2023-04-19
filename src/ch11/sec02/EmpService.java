package ch11.sec02;

import java.sql.SQLException;

public class EmpService implements IEmpService {

	@Override
	public void insert(EmpVO vo) {
		try{
			if(vo==null) {
				throw new SQLException("객체가 null입니다.");
			}			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
