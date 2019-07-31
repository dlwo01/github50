package _ch11;

import java.util.Scanner;

public class _05_ThrowException {
static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		try {
			String name = readName(); // 예외가 발생
			System.out.println("이름 :" + name);
		} catch (Exception e) { // 3. 호출한 메소드에서 예외를 처리 catch(Exception e)
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());//이름은 2자 이상입니다.
		}finally {
			input.close();
		}
		System.out.println("정상 종료");
	}
	
	
	
	static String readName() throws Exception{ // 2. 상위메소드에게 예외 처리를 미루는 throws
		System.out.println("이름을 입력하세요.");
		String name = input.next();
		
		//1. 강제 예외 발생 : throw new Exception();
		if(name.length() < 2) {
			throw new Exception("이름은 2자 이상입니다."); //Exception의 생성자로 들어가
		}else {
			return name;
		}
		
		
	}

}
