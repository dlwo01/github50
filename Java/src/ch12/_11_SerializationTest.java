package ch12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class _11_SerializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*
		 * 직렬화
		 * - 인스턴스의 어느 순간 상태를 그대로 저장하거나 네트워크를 통해 전송
		 * - 인스턴스 내용(인스턴스 변수값)을 연속 스티림으로 만드는 것이다.
		 * - 스티림으로 만들어야 파일에 쓸수도 있고 네트워크로 전송할 수 있다.
		 * - 인스턴스 변수
		 * -implements Serializable을 작성해야 직렬화가 된다.
		 * - transient : 해당 변수는 직렬화나 복원과정에서 제외
		 * 
		 * 역질렬화
		 * - 저장된 내용이나 전성받은 내용을 다시 복원하는 것
		 */
		
		_11_Person personAhn = new _11_Person("안재용","대표이사");
		_11_Person personKim = new _11_Person("김철수","상무이사");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
		try {
			fos = new FileOutputStream("C:\\Dve50\\fileTest\\_11_serial.out");
			oos = new ObjectOutputStream(fos);
			//personAhn ,personKim의 값을 파일에 씀(직렬화)
			
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
			
		
			fis = new FileInputStream("C:\\Dve50\\fileTest\\_11_serial.out");
			ois = new ObjectInputStream(fis);
			
			
			//위에서 작성한 파일을 읽어들임
			_11_Person p1 = (_11_Person)ois.readObject();//다운캐스팅
			_11_Person p2 = (_11_Person)ois.readObject();//다운캐스팅
			
			System.out.println(p1); //p1.toString();
			System.out.println(p2);//p2.toString();
			//이름 :안재용직업 :대표이사
			//이름 :김철수직업 :상무이사

			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
	}
	}
}
