package 복습;

public class _25_DoWhileEx {
	public static void main(String[] args) {
		/*
		 * do=while문 : 반드시 1번은 수행해야 하는 경우 사용,
		 * 			   조건이 만족하지 않을 때 블럭을 빠져 나간다.
		 * 				데이터를 처리하기 전에 사용자로부터 메뉴나 데이터를 입력받아야 하는 경우 만이 사용
		 * do {
		 *		수행문1;
		 *		수행문2;
		 *		....
		 * }while(조건식);
		 */
		
		int i = 20;
		do {
			System.out.println("i의 값 : " + i);// i의 값 : 20
			i++; //21
		}while(i < 10);
		
	}

}
//i의 값 : 20