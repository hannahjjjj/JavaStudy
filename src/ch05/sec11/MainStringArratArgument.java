package ch05.sec11;

import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class MainStringArratArgument {
	public static void main(String[] args) throws IOException {
		System.out.println(Arrays.deepToString(args));
		String data=JOptionPane.showInputDialog("입력하세요.");
		System.out.println(data);
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
		String strNum1=args[0];
		String strNum2=args[1];
		
		int num1=Integer.parseInt(strNum1);
		int num2=Integer.parseInt(strNum2);
		
		int result =num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
	}
}
