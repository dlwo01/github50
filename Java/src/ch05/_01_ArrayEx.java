package ch05;

public class _01_ArrayEx {
	public static void main(String[] args) {
		/*
		 * 배열(Array) : 같은 타입의 대량의 데이터를 저장할 수 있는 저장장소이다.
		 * 				배열의 인덱스는 0부터 시작한다.
		 * 방법1) 선언과 생성을 따로 한다.
		 * 		 int[] score; //선언
		 * 		 score = new int[개수]; //생성
		 * 방법2) 선언과 생성을 동시에 한다.
		 * 		 배열자료형[] 배열명 = new 배열자료형[배열개수];
		 * 		 배열명[index] = 값;
		 * 		 
		 * 
		 * 방법3) 선언과 할당을 동시에 한다. 제일 많이 사용한다.
		 * 		 배열자료형[] 배열명 = {값1, 값2, 값3, ...};
		 * 
		 * 
		 * 오류) int[] score = new int[5]{1,2,3,4,5}; // 오류발생
		 * 		 배열자료형[] 배열명;
		 * 		 배열명 = {값1, 값2, 값3, ...}; //오류발생
		 */
		
		// 방법2)선언과 생성을 동시에 한다.
		// 		 배열자료형[] 배열명 = new 배열자료형[배열개수];
		// 		 배열명[index] = 값;
		int[] scores = new int[5];
		scores[0] = 70;
		scores[1] = 80;
		scores[2] = 90;
		scores[3] = 100;
		scores[4] = 90;
		
		for(int i = 0; i<scores.length; i++) { // i<배열명.길이
		
		System.out.print(scores[i] + " ");
		}
		
		System.out.println();
			
		// 방법3) 선언과 할당을 동시에 한다.. 제일 많이 사용한다.
		// 		  배열자료형[] 배열명 = {값1, 값2, 값3, ...};
		
			
			int[] scores2 = {70,80,90,100,90};
			
			for(int i = 0; i<scores.length; i++) {
				
				System.out.print(scores[i] + " ");
			}
		}
		

		
	}


