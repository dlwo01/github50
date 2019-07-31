package ch02;

public class _01_IfEx {
	public static void main(String[] args) {
		/*
		 * if - else if - else문
		 * if(조건식1) {  // 조건식1이 참인 경우 수행
		 * 		수행문1;
		 * }else if(조건식2) {  // 조건식2가 참인 경우
		 *		수행문2; 
		 * }else if(조건식3) {  // 조건식3이 참인 경우
		 * 		수행문3;
		 * }else {  // 위의 조건이 모두 해당되지 않는 경우 수행
		 * 		수행문4;
		 * }
		 */
		int num = -5;
		// num은 음수 입니다.
		
		if(num>0) {
			System.out.println(num+"은 양수입니다");
			}else if(num == 0) {
				System.out.println(num+"은 0입니다");
			}else if(num<0) {
				System.out.println(num+"은 음수입니다");
			}
		
		}
		
	}


