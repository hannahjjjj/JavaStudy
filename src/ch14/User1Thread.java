package ch14;

import lombok.Setter;

@Setter
public class User1Thread extends Thread {
	private Calculator c;
	
	public User1Thread() {
		setName("u1");
	}
	
	@Override
	public void run() {
		c.setMemory1(100);
	}
	

}
