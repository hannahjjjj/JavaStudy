package ch15.sec07;

import javax.swing.JOptionPane;

public class QuestionRunner implements Runnable {
	String [] question = {"1+2", "100-1", "2의16제곱은?"};
	String [] answer = {"3","99","65536"};
	@Override
	public void run() {
		System.out.println("문제를 풀어 폭탄을 해체하세요.기회는 3번");
		int failCount = 3;
		while(true) {
			int index = (int)(Math.random()*3); //question.lenth이라고 해도됨 3대신
			System.out.println(failCount + "번 기회가 남음");
			String input = JOptionPane.showInputDialog(question[index]);//문제의 index번째꺼를 내보내줌
			if(answer[index].equals(input)) {
				System.out.println("폭찬이 해체되었습니다.");
				FlagData.isOk = true;
				return;
			}else {
				failCount--;
				if(failCount<=0) {
					FlagData.isFail = true;
					return;
				}
			}
		}
	}
	

}
