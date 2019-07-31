package ch11;
import java.util.*;
public class _08_MemberMain {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		// readMember() 호출, 예외 처리, Member정보출력
		
		readMemberInfo();
	}
	
	static void readMemberInfo() {
		_08_MemberInfo mem = null;
		
		// 예외 미루기
		try {
			String name = readName();
			int age = readAge();
			
			mem = new _08_MemberInfo(name, age);
			
		} catch (Exception e) {
			System.out.println(e);
			return;
		}
		mem.showMemberInfo();
	}
	
	
	static int readAge() throws  {
		// 나이 입력 받고 예외를 강제발생 및 예외 미루기
		System.out.println("나이를 입력하세요");
		int age = input.nextInt();
		if(age<0) {
			throw new _08_InvalidAgeException(age);
		}else {
			return age;
		}
	}
	
	static String readName() throws _08_InvalidAgeException {
		// 이름 입력 받고 예외를 강제발생 및 예외 미루기
		System.out.println("이름을 입력하세요.");
		String name = input.next();
		
		if(name.length()<2) {
			throw new _08_InvalidAgeException(name);
		}else {
			return name;
		}
	}
	

}
