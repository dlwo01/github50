package test;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		
		while(true) {// while은 반복문인데 조건은 항상 참이다
			Scanner input = new Scanner(System.in);
			// 
			String lee = input.next();
			//  
			
		
		
			//1. q나Q를 입력한다
			
			char j = lee.charAt(0);
			System.out.println(j);
			
			
			//2. 문자열 길이가 1이여야한다.
			
			

			int i = lee.length();
			System.out.println(lee + "," + i);
			
			
			
			
			
		}
		
		
		
	}
	

}
