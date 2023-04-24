package ch14;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SumThread extends Thread {
	private long sum;
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
	}
	
}
