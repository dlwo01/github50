package 복습;

public class _51_TwoArray {
	public static void main(String[] args) {
		/*
		 * 이차원 배열
		 * 방법1. 자료형[][] 배열이름 = new 자료형[행 개수][열 개수];
		 * 		 배열명[행][열] = 값1,
		 * 	         배열명[행][열] = 값2,....
		 * 
		 * 방법2. 자료형[][] 배열명 = {
		 * 							{값1, 값2, 값3} ,
		 * 							{값1, 값2, 값3} ,
		 * 						 }; // 2행 3열 
		 */
		//방법 2.
		int[][] arr = {{1,2,3},{4,5,6}}; // 2행 3열
		
		
		for(int i =0; i<arr.length; i++) { //행 길이 구함([0]행,[1]행
			for(int j = 0; j < arr[i].length; j++) {//열길이 구함(0행일떄=[0][0],[0][1],[0][2])(1행일때=[1][0],[1][1],[1][2])이리돌아라
				System.out.println(i + " : " + j +" = " + arr[i][j]);
			}
		
	}
		/*
		0 : 0 = 1
		0 : 1 = 2
		0 : 2 = 3
		1 : 0 = 4
		1 : 1 = 5
		1 : 2 = 6
		*/
		
		
		// 행 길이
		
		System.out.println("행길이 :" + arr.length);
		System.out.println("열길이 :" + arr[0].length);

}
}
/*
  행길이 :2
 열길이 :3
 */
