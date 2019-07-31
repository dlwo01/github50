package ch12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _06_FileReaderTest {
	public static void main(String[] args) throws IOException {
		// 문자를 읽어서 콘솔에 출력
		FileReader fr = null;
		
		
		try {
			int i;
			fr = new FileReader("C:\\Dve50\\fileTest\\reader.txt");//직접 생성 //저장시 UTF-8로 저장할것
			while((i = fr.read()) != -1 ) {
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}
		
	}

}
