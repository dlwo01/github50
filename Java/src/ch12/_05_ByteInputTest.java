package ch12;

import java.io.FileInputStream;
import java.io.IOException;

public class _05_ByteInputTest {
	public static void main(String[] args) {

		FileInputStream in = null;
		FileInputStream out = null;
		
		try {
			in = new FileInputStream("C:\\Dve50\\fileTest\\inputStream.txt");
			out = new FileInputStream("C:\\Dve50\\fileTest\\inputStream.txt");
			
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