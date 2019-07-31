package ch12;

import java.io.FileWriter;
import java.io.IOException;

//p.538
public class _07_FileWriterTest {
	public static void main(String[] args) {
		// 문자를 읽고 연결해가면서 콘솔에 출력
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\Dve50\\fileTest\\Writer.txt");
			fw.write('A');
			char buf[] = {'B','C','D','E','F','G'};
			
			fw.write(buf);
			fw.write("안녕하세요,반갑습니다");
			fw.write(buf,1,2);
			fw.write("65");
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("출력이 완료되었습니다.");
		
	}

}
