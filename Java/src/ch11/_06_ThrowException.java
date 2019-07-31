package ch11;

import java.util.*;

public class _06_ThrowException {
	static Scanner input = new Scanner(System.in);
		
	
	public static void main(String[] args) {
		try {
			int age = readAge();
			System.out.println("나이는 :" +  age);
		} catch (ArithmeticException e) {// 3. 호출한 메소드에서 예외를 처리 catch(Exception e)
				// ArithmeticException = new ArithmeticException("나이는 0세 이상입니다.");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(Exception e){//Exception e = new ArithmeticException("나이는 0세 이상입니다."); //다형성
			System.out.println(e.getMessage());
			
		}finally {
			input.close();
		}
		System.out.println("정상종료");
		
	}
	
	

	static int readAge() throws ArithmeticException {// 2. 상위메소드에게 예외 처리를 미루는 throws
		System.out.println("나이를 입력하세요.");
		int age = input.nextInt();
		
		if(age<0) {
			throw new ArithmeticException("나이는 0세 이상입니다."); // 1.예외를 강제로 발생
		}else {
			return age;
		}
		
	}
	
}
