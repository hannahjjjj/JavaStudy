package ch09;

public class A { //Aclass
	class B{ //member class
		//A$Bclass
		void doIt() {
			System.out.println("A.B");
		}
	}
	static class C{ //static member class
		//A$Cclass
		void doIt() {
			System.out.println("A.C");
		}
	}
	void doIt() {
		class B{} //Local class //A$1Bclass
	}
}
