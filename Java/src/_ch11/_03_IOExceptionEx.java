package _ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _03_IOExceptionEx {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			
		}catch (FileNotFoundException e) {
			//e.printStackTrace();// 예외는 나는 출력하겠다 전체적으로 오류를 보여줌 헷갈리수있다
			//System.out.println(e);// java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)
			System.out.println(e.getMessage());
		}
		System.out.println("여기도 수행됩니다.");
	}
	

}
