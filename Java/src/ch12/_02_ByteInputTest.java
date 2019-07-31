package ch12;

import java.io.IOException;

public class _02_ByteInputTest {
	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요 :");
		
		int i;
		try {
			while((i = System.in.read()) != -1) {
				System.out.print((char)i);
				
			}
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