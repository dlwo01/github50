package ch12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _09_BufferedReader {
	public static void main(String[] args) throws IOException {
		
		// 한줄 단위로 입출하겠다.
		BufferedReader in = null;
		PrintWriter out = null;
		
		// 직접생성시 한글이 깨지니 UTF-8로 바꾼다
		try {
			in = new BufferedReader(new FileReader("C:\\Dve50\\fileTest\\_09_FileReader.txt"));
			out = new PrintWriter(new FileWriter("C:\\Dve50\\fileTest\\_09_FileWriter.txt"));//직접생성
			
			int c;
			while ((c=in.read()) != -1) {
				out.write(c);
			}
			System.out.println("출력완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}finally {
			if(in != null)in.close();
			if(out != null)out.close();
		}
		
		
		
	}

}
