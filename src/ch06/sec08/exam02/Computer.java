package ch06.sec08.exam02;

public class Computer {
	int sum(int ... values) {
		int sum=0;
		for(int data:values) {
			sum+=data;
		}
		return sum;
	}
}