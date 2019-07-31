package ch02;

public class _14_WhileEx {
	public static void main(String[] args) {
	 
		//1. 초기값
		int i = 1;
		int dan = 2;
		System.out.println("===2단===");
		//2. 조건식
		while(i<=9) {
			int result = dan * i;
			System.out.println(dan + "*" + i + "=" +  (dan*i));
			i++;//3.증감식 
			}
		System.out.println("==========");
		
		
	}

}
