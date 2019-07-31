package ch12;

import java.io.IOException;

public class _03_ByteInputTest {
	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요 :");
		
		
		try {
			while(true) { // 무한루프
				int i = System.in.read(); // 데이터를 1byte씩 읽어들인다
				
				if(i==-1) {// 파일의 끝
					System.out.println("출력완료");
					break; // 파일의 끝이면 while문을 빠져나간다.
					
				}
				System.out.print((char)i);
			}
//			while((i = System.in.read()) != -1) {
//				System.out.print((char)i);
//				
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
/*
알파벳 여러개를 쓰고 [Enter]를 누르세요 :
hello
hello
*/