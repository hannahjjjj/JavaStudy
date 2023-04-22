package ch15.sec07;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {//LIFO방법
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin c = coinBox.pop();
			System.out.println("꺼내온 동전"+c.getValue()+"원");
		}
	}
}
