package ch02;

import java.util.Scanner;

public class _21_ForEx {
	public static void main(String[] args) {
		/*
		 * 반복문 - 조건이 만족하는 동안 실해
		 * 
		 * 출력할 구구단을 입력(dan)
		 * for(초기값; 조건식; 증감식) {
		 * 		수행문;
		 */
		//몇단? 5
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("몇단 :");// 단을 입력받겠다
		int dan = input.nextInt();// 입력받은 dan
		
		System.out.println("===================");
		System.out.println("*****" + dan + "단*****");
		System.out.println("===================");
		for(int i = 1; i <= 9; i++ ) {
			System.out.println(dan + " * "+ i + " = " + (dan*i));
		}
			
		System.out.println("===================");
		
		
	
	}
	

}
/*몇단 :
6
===================
*****6단*****
===================
6*1=6
6*2=12
6*3=18
6*4=24
6*5=30
6*6=36
6*7=42
6*8=48
6*9=54
===================

 */ 
