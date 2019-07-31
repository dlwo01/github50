package ch01;

import java.util.Scanner;

public class _04_InOutEx {
	public static void main(String[] args) {
		/*
		 *  변수
		 *  1. 기초형(primitive Type) : 실제값이 저장
		 *  - 데어터타입 변수명 = 값;
		 *  int a = 5;
		 *  
		 *  
		 *  2. 참조형(Reference Type) : 실제 객체를 가리키는 주소 저장
		 *  - 클래스, 인터페이스, 배열
		 *  - 클래스인 경우
		 *    클래스명 참조변수명 = new 클래서명();
		 *    ex) Scanner inpun = new Scanner(System.in);
		 *    - 참조변수명에는 객체를 가리키는 주소값이 들어있다.
		 */
		//참조변수 : input
		//nextInt() 호출
		// https://docs.oracle.com/javase/8/docs/api/index.html 가이드
		
		Scanner input = new Scanner(System.in);
		
		
		int x = 0; // 첫번째 숫자저장
		int y = 0; // 두번재 숫자 저장
		int sum = 0; // 두수의 합을 저장	
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		x = input.nextInt();// 콘솔에서 입력받은 첫번째 숫자를 읽어서 x에 저장
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		y = input.nextInt();// 
		
		sum = x + y;
		System.out.println("두수의 합을 구하세요 : " + sum);
		
	
		
		
		System.out.print("끝내시요 : ");
		input.close();
		
		
		
		
		
		
	
		

}
}