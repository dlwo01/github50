package ch02;

import java.util.Scanner;

public class _05_IfEx {
	public static void main(String[] args) {
		/*
		 * age : 나이 ==> 입력받는다.
		 * ticketing
		 * 1~8세일경우 : "취학전 아동", charge : 요금 : 2000
		 * ~13세 일경우 : "초등학생", charge : 2500
		 * ~19세 일경우 : "중,고등학생" , charge : 3000
		 * ~64세 일경우 : "일반인", charge : 4000
		 * 65세 이상일경우 : "경로우대" charge : 무료
		 * 
		 *  출력형식 : ~세이며, 취학전 아동, 요금: 요금~~
		 */
		int age = 0;
		int charge = 0;
		int adultCharge = 4000;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("나이를 입력하세요~");
		age = input.nextInt();
		
		if(age <= 8) {
			charge = 2000;
			System.out.println("취학전 아동");
		}else if(age <= 13) {
			charge = 2500;
			System.out.println("초등학생");
		}else if(age <= 19) {
			charge = 3000;
			System.out.println("중,고등학생");
		}else if(age <= 64) {
			charge = 4000;
			System.out.println("일반인");
		}else {
			charge = adultCharge / 2;
			System.out.println("경로우대");
		}
		System.out.println("나이" + age + "요금" +charge );
	}
}

