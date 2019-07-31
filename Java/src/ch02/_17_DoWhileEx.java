package ch02;

import java.util.Scanner;

public class _17_DoWhileEx {
	public static void main(String[] args) {
		
		// 월입력[1~12]만 입력, 12보다 크거나 1보다 작으면 : 월은 잘못된 월입니다.
		// 계속받기 => 초과  잘못된입력 => 끝
		int month = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		
	
		do {
			System.out.println("월입력[1~12]");
			month = input.nextInt();
		}while((1<=month) && (month<= 12)); // 1~12월은 조건식이 참이며.do문장으로 올라간다. 거짓이면  do블럭을 빠져나간다.
		
		System.out.println(month + "월은 잘못된 월입니다.");
		input.close();
	}

	}
