package _ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_IOExceptionEx {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
			try {
				fis = new FileInputStream("a.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace(e);// 예외는 나는 출력하겠다 전체적으로 오류를 보여줌 헷갈리수있다
				System.out.println(e);
				//System.out.println(e.getMessage());
				return; //함수종료
			} finally {
				if(fis != null) {
					try {
						fis.close();
					}catch(IOException e) {
						e.printStackTrace();
					}//catch
				}//if
				System.out.println("finally 문장이므로 항상 수행됩니다.");
			}//finally
			System.out.println("여기도 수행됩니다.");// return에 의해서 출력안됌
		
			
		
	}

}
