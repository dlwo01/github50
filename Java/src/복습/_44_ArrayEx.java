package 복습;

public class _44_ArrayEx {
	public static void main(String[] args) {
		
		// 방법2)선언과 생성을 동시에 한다.
		// 		 배열자료형[] 배열명 = new 배열자료형[배열개수];
		// 		 배열명[index] = 값;
		
		//fruits -> 과일명5개
		
		String[] fruits = new String[5];
		fruits[0] = "사과";
		fruits[1] = "바나나";
		fruits[2] = "딸기";
		fruits[3] = "키위";
		fruits[4] = "망고";
		
		for(int i = 0; i<fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}
		System.out.println();
		
		
		// 방법3) 선언과 할당을 동시에 한다.. 제일 많이 사용한다.
		// 		  배열자료형[] 배열명 = {값1, 값2, 값3, ...};

		//fruits2 -> 과일명5개
		String[] fruits2 = {"사과","바나나","딸기","키위","망고"};
		for(int i = 0; i<fruits2.length; i++) {
			System.out.print(fruits[i] + " ");
		}
			
	}
		
}
/*
사과 바나나 딸기 키위 망고 
사과 바나나 딸기 키위 망고 
*/
