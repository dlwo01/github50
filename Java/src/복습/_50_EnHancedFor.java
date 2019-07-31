package 복습;

public class _50_EnHancedFor {
	public static void main(String[] args) {
		
		
		

		/*
		 * 향상된 for문
		 * - 배열의 처음부터 끝까지 모든 요소를 참조할 때 사용하는 편리한 반목문
		 * - 향상된 for문은 배열 요소값을 순서대로 하나씩 가져와서 변수에 대입한다.
		 * - 초기화와 종료조건이 없기 때문에 모든 배열의 시작요소부터 끝요소까지 실행한다.
		 * - 문법
		 *   for(변수 : 배열) {
		 *   	반복 실행문;
		 *   }
		 */
		String[] langArray = {"Java","Jsp","Spring","Android","python"};
		
		for(String lang : langArray) {
			System.out.println(lang);
		}
		
		System.out.println();
		
		int[] numArray = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i : numArray) {
			System.out.print(i + " ");
		}
	}

}
/*
Java
Jsp
Spring
Android
python

1 2 3 4 5 6 7 8 9 10 
*/