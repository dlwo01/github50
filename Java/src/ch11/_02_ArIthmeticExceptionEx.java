package ch11;
import java.util.*;
public class _02_ArIthmeticExceptionEx {
	public static void main(String[] args) {
		
			System.out.println("== 두개의 정수를 입력 ==");
			 
			Scanner input = new Scanner(System.in);
			System.out.println("첫번재 값 입력 : ");
			int num1 = input.nextInt();
			
			System.out.println("두번째 값 입력 : ");
			int num2 = input.nextInt();
			try {
			System.out.println("몫 : "+ (num1/num2));
			System.out.println("나머지 : "+(num1%num2));
			}catch(ArithmeticException e){
				System.out.println("예외처리부분"); 
				System.out.println(e); //java.lang.ArithmeticException: / by zero
				System.out.println(e.getMessage()); // 왜 예외인지 알려줌 
				
			System.out.println("정상 종료");
		}
		
	}		

}
