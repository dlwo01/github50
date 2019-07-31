package 복습;

public class _27_ForEx {
	public static void main(String[] args) {
		/*
		 * 반복문
		 * for문의 기본 구조
		 * for(초기값; 조건식 ; 증감식;) {
		 * 		수행문장1;
		 * 		수행문장2;
		 * 		...
		 */
		// Hello 10번출력
		for(int i = 0; i<10; i++) {
			System.out.println("Hello~" + i);
		}
		
		//Hello 무한반복
		for(; ;) {
			System.out.println("Hello");
		}
	}

}
