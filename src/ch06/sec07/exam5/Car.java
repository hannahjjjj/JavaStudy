package ch06.sec07.exam5;

public class Car {
	String company="현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car(String model) {
		this(model,"은섹",250);
	}

	public Car(String model, String color) {
		this(model,color,250);
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
}