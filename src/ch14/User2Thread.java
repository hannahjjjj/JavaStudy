package ch14;

import lombok.Setter;

@Setter
public class User2Thread extends Thread {
	private Calculator c;
	
	public User2Thread() {
		setName("u2");
	}
	
	@Override
	public void run() {
		c.setMemory2(50);
	}
	

}