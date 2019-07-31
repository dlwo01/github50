package ch01;

import java.util.Scanner;// ctrl+shift+O ->


public class _05_InOutEx {
	public static void main(String[] args) {
		
		
		// 이름입력 : 이재동
		// 핸드폰 번호 : 010-2006-1916
		// 프로그램 종료
		
		Scanner dong = new Scanner(System.in);
		// 변수 선언
		
		String name = dong.next();
		System.out.println(name);
		
		String phone_number = dong.next();
		System.out.println(phone_number);
		
		
		System.out.println("당신의 이름은" + name + ", 당신의 핸드폰 번호는"+ phone_number);
		
		
		System.out.println("프로그램 종료~");
		dong.close();
		
		
			
		
	}
	
	
}
