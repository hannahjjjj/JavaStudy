package ch11.sec01;

public class InsufficientException extends Exception {
	public InsufficientException(){
		
	}
	public InsufficientException(String message) {
		super(message);
	}
}
