package ch12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class _08_ImageCopy {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.print("원본 파일이름을 입력하세요 :");
		String inputFileName = input.next();
		
		System.out.println("복사 파일이름을 입력하세요 :");
		String outputFileName = input.next();
		
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream(inputFileName);
			out = new FileOutputStream(outputFileName);
			
			int i;
			while( (i=in.read()) != -1) {
				out.write(i);
			}
			System.out.println(inputFileName + "를" + outputFileName + "으로 복사하였습니다.!!" );

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
