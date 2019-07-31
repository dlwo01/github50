package ch12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _10_DataStreamTest {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream("C:\\Dve50\\fileTest\\data.txt");
			dos = new DataOutputStream(fos);
			
			
			//각 자료형에 맞게 data를 작성
			dos.write(100);
			dos.writeChar('A');
			dos.write(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("TEST");
			
			fis = new FileInputStream("C:\\Dve50\\fileTest\\data.txt");//파일명이 동일
			dis = new DataInputStream(fis);
			
			
			// 자료형에 맞게 자료를 읽어서 출력함. 파일에 쓴 순서와 같은 순서, 같은 메소드로 읽어야 함
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
					
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
