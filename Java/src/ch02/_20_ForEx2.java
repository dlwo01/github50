package ch02;

public class _20_ForEx2 {
	public static void main(String[] args) {
		/*
		 * 반복문
		 * for문의 기본 구조
		 * for(초기값; 조건식 ; 증감식;) {
		 * 		수행문장1;
		 * 		수행문장2;
		 * 		...
		 */
		//1~10까지의 합
		int sum = 0;
		
		for(int num = 1; num <=10; num++ ) {
			sum += num;  //sum = sum + num;
		}
		System.out.println("1부터 10까지의 합은" + sum);
		
	}

}




	

