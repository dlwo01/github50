package ch02;

public class _23_ForEx {
	public static void main(String[] args) {
		//2~20까지의 짝수(i)의 합계 (sum) =>출력값i=?,sun=?
		
		int sum = 0;
		for(int i = 2; i <= 20; i+=2) {
			sum += i;
			System.out.println(" i= " + i + " sum= "+ sum);
			
			
		}
	}

}
/*i= 2 sum= 2
 i= 4 sum= 6
 i= 6 sum= 12
 i= 8 sum= 20
 i= 10 sum= 30
 i= 12 sum= 42
 i= 14 sum= 56
 i= 16 sum= 72
 i= 18 sum= 90
 i= 20 sum= 110
 */

