package ch14;

import lombok.Getter;

@Getter
public class Calculator {
	private int memory;
	
	public synchronized void setMemory1(int memory) { //동기화 메소드
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory); // 메모리값 읽기
	}
	
	public  void setMemory2(int memory) { //동기화 블록
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
}
