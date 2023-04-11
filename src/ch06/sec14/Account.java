package ch06.sec14;

public class Account {
	
	//6장 19번
	
	private int balance ;
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 100;
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;			
		}//조건 반대로 해도 가능
		
//		if(balance<MIN_BALANCE || balance > MAX_BALANCE) {
//			return;
//		}
//		this.balance = balance;
	
	}
	
}
