package _ch11;
import java.util.*;
public class _06_ThrowException {
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		try {
			int age = readAge();
			System.out.println("나이는 :" + age);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			input.close();
		}
		System.out.println("정상종료");
		
	}

	static int readAge() {
		System.out.println("나이를 입력하세요.");
		int age = input.nextInt();
		
		if(age<0) {
			throw new ArithmeticException("나이는 0세 이상입니다."); //1.예외를 강제로 발생
		}else {
			return age;
		}
	}
	
	
}
