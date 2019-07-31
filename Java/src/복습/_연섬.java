package 복습;

public class _연섬 {
	public static void main(String[] args) {
		/* 
		 * 구구단 출력(2~9단)
		 * dan = 2~9단;
		 * i = 1~9
		 * 
		 * 1.초기값
		 * 2.조건식
		 * 3.증감식
		 */
	int dan = 2;
	
	while(dan<=9) {
		System.out.println("------");
		System.out.println("-----"+dan+"단"+"-----");
		System.out.println("------");
	
	int i = 1;
	while(i <= 9) {
		System.out.println(dan + "*" + i + "=" + (dan*i));
		i++;
	}dan++;
	}System.out.println("------");
	}
}


