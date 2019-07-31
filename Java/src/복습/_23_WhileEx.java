package 복습;

public class _23_WhileEx {
	public static void main(String[] args) {
		/*
		 * 구구단 출력
		 * dan = 2; 
		 * i = 1~9
		 * 
		 * ===2단===
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 
		 * 
		 * 2 * 9 = 18
		 * ===========
		 */
		//1. 초기값
		int i = 1;
		int dan = 2;
		System.out.println("===2단===");
		//2. 조건식
		while(i <= 9) {
			int result = dan * i;
			System.out.println(dan + "*" + i + "=" + (dan * i));
			i++; //3.증감식
		}
		System.out.println("=========");
	}

}
/*===2단===
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
=========
*/

