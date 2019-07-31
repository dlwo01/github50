package ch03;

public class _04_MemberMainEx {
	public static void main(String[] args) {
	
		
		_04_Member mem = new _04_Member();
		
		
		
		mem.setName("이재동");
		System.out.println(mem.getName());
		mem.setHobby("숨쉬기");
		mem.setSalary("일억");
		mem.setEmail("dlwoehd01@naver.com");
		
		
		mem.printInfo();
		
		
		_04_Member mem2 = new _04_Member("리재순","격파","백원","없음");
		System.out.println("매개변수 생성자를 출력");
		mem2.printInfo();
		}

}
