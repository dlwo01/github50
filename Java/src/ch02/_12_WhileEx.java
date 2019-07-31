package ch02;

public class _12_WhileEx {
	public static void main(String[] args) {
		/*
		 * 반목문 : 조건식이 참인 동안 반복(while문,for문)
		 * 		 초기값 ->조건식->증감식
		 * 
		 * 초기값
		 * while(조건식) {
		 * 	수행문1;
		 * 	증감식;
		 * }
		 * 수행문2:
		 */
		//1~10까지 출력(1 2 3 4..10)
		
		int i = 1;
		
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
	}

}
