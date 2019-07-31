package 복습;

import java.util.Scanner;

public class _29_ForEx2 {
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
		System.out.println("단을 입력");//단을 입력받겠다
		int dan = input.nextInt();
		System.out.println("---------");
		System.out.println("---"+dan+"단---");
		System.out.println("---------");
		for(int i = 1; i<=9; i++) {
			System.out.println(dan+" * "+ i + " = "+(dan*i));
			
		}
		System.out.println("---------");
	}

}
/*단을 입력
5
---------
---5단---
---------
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
---------

*/ 
