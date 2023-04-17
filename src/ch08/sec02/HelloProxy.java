package ch08.sec02;

public class HelloProxy extends Hello { //대리인의 클래스라고 생각

	@Override
	public void sayHello(String name) {
		HelloLog.log(); //2타고 //그래서 먼저 call
		super.sayHello(name);  //1타고 //2번째 콜
	}
	
}

