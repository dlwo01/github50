package ch11;
import java.util.*;
public class _08_MemberMain2 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// readMember() 호출, 예외 처리, Member정보출력
		
				try {
					_08_MemberInfo2 member = readMemberInfo();
					member.showMemberInfo();
					
				} catch (_08_InvalidAgeException2 e) {
					//e.printStackTrace();
					e.showError();
				} catch (_08_InvalidAgeException e) {
					//e.printStackTrace();
					e.showError();;
				} catch (Exception e) {
					//e.printStackTrace();
					System.out.println(e.getMessage());
				} finally {
					input.close();
				}
		
		
		
	}
	
	static _08_MemberInfo2 readMemberInfo() throws _08_InvalidAgeException2, _08_InvalidAgeException {
		int age = readAge();
		String name = readName();
		
		return new _08_MemberInfo2(name,age);// 매개변수 생성자로 return
		
	}
	
	
	static int readAge() throws _08_InvalidAgeException2  {
		// 나이 입력 받고 예외를 강제발생 및 예외 미루기
		System.out.println("나이를 입력하세요");
		int age = input.nextInt();
		if(age<1) {
			throw new _08_InvalidAgeException2(age); //1.강제 예외 발생 : throw new 예외
		}
			return age;
		
	}
	
	static String readName() throws _08_InvalidAgeException  {
		// 이름 입력 받고 예외를 강제발생 및 예외 미루기
		System.out.println("이름을 입력하세요.");
		String name = input.next();
		
		if(name.length()<2) {
			throw new _08_InvalidAgeException(name);
		}
			return name;
		
	}
	

}
