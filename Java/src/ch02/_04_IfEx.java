package ch02;

import java.util.Scanner;

public class _04_IfEx {
	public static void main(String[] args) {
		
		
		// 숫자를 입력받은후 입력값이 짝수/홀수/0인지 출력
		// num=입력값, str : 출력변수
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		String str = "";
		
		System.out.println("숫자 입력하세요" );
		num = input.nextInt();
		
		if(num == 0) { // 짝수보다 뒤에 있으면 0이 출력이 안됌
			str = "0";
		}else if(num % 2 == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		System.out.println(str);
		}

}
