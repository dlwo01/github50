package _ch11;

public class _01_ArrayExcePtionEx {
	public static void main(String[] args) {
		/*
		 * 예외 처리 목적 : 정상종료
		 * try {
		 * 		예외가 발생할 수 있는 코드 부분
		 * } catch(처리할 예외 타입e) {
		 * 		try 블록안에서 예외가 발생했을 때 예외를 처리하는 부분
		 * } finally {
		 * 		항상 수행되는 부분, 주로 자원해제를 위한 close() 문장이 온다.
		 * }
		 */
		int[] array = new int[5];
		try {
			for(int i = 0; i <= array.length; i++) {
				array[i] = i;
				System.out.println(array[i]); // 예외가 발생
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: 5
			//System.out.println(e.getMessage());
			System.out.println("예외 처리 부분");
		}
		System.out.println("종료합니다.");
	}

}
//예외처리는 비정상처리를 막아주는 역할
