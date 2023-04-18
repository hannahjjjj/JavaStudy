package ch07.sec01;

public class AbstractMethodExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		
		Cat c = new Cat();
		c.sound();
		
		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());

	}
	public static void animalSound(Animal a) {
		a.sound();
	}

}
