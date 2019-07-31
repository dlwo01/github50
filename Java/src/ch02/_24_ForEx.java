package ch02;

public class _24_ForEx {
	public static void main(String[] args) {
		
		/*continue 예제
		 * continue문은 반복문과 함께 쓰인다.
		 * 반복문 안에서 continue문을 만나면 이후의 문장을 수행하지 않고,
		 * for문의 처음으로 돌아가 증감식을 수행한다.
		 */
		//1~100까지의 홀수합계
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0) { //짝수
				continue; // 짝수일떄 아래문장 수행하지 않고 for문으로 돌아간다.
			}
				total += num;
			
		}
		System.out.println("1부터 100까지의 짝수의 합은 :" + total + "입니다");
}

}
//1부터 100까지의 짝수의 합은 :2500입니다