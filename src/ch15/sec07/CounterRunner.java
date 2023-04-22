package ch15.sec07;

public class CounterRunner implements Runnable {
	@Override
	public void run() {
		for(int i=30; i>0; i--) {
			if(FlagData.isOk) {
				System.out.println("정답을 맞춰 폭탄이 해체됨");
				return; //메서드 종료
			}
			if(FlagData.isFail) {
				System.out.println("선을 잘못 잘랐습니다.");
				break; //반복문 빠져나가기
			}
			System.out.println(i);
			try {Thread.sleep(10000);}catch(InterruptedException e) {}
			System.out.println("빵");
			System.exit(0);
		}
	}
}
