package ch02;

public class _11_WhileEx {
	public static void main(String[] args) {
		/*
		 * 반복문 : 조건식이 참인 동안 반복(while문 , for문)
		 * 		  초기값 -> 조건식 -> 증감식
		 * 
		 * 초지값 
		 * while(조건식) {
		 * 	수행문1;
		 * 	증감식;
		 * }
		 * 수행문2;(조건문이 거짓일떄)
		 */
		int i=5;
		
		while(i>0) {
			System.out.println("good day" + i);
			i--;
		}
		
	}

}
