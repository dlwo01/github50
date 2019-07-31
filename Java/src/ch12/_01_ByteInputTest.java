package ch12;

import java.io.IOException;
//P.516
public class _01_ByteInputTest {
	public static void main(String[] args) {
		System.out.println("알바벳 하나를 쓰고[Enter]를 누르세요");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
/*
알바벳 하나를 쓰고[Enter]를 누르세요
A
65
A
*/