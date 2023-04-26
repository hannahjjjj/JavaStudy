package ch16.sec02;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		//매개값으로 람다식 주입
		btnOk.setCl(()->{
			System.out.println("Ok 버튼을 클릭했습니다.");
		});
		
		btnOk.click(); //ok버튼 클릭하기
		Button btnCancel = new Button();
		
		btnCancel.setCl(()->{
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		btnCancel.click();
	}
}
