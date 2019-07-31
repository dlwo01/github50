package _ch10;

public class _05_Main {
	public static void main(String[] args) {
		_05_MemberArrayList memList = new _05_MemberArrayList();
		
		//매개변수 생성자 호출
		/*
		_05_Member memberKim = new _05_Member(1001, "김범수");
		_05_Member memberNa =  new _05_Member(1002, "나얼");
		_05_Member memberPark = new _05_Member(1003, "박효신");
		_05_Member memberLee = new _05_Member(1004, "이수");
		*/
		//회원추가
		memList.addMember(new _05_Member(1001, "김범수"));
		memList.addMember(new _05_Member(1002, "나얼"));
		memList.addMember(new _05_Member(1003, "박효신"));
		memList.addMember(new _05_Member(1004, "이수"));
		
		//전체회원 출력
		System.out.println("***********전체회원 출력***********");
		memList.showAllMember();
		
		//이수 회원 삭제
		//memList.removeMember(memberLee.getMemberId());
		memList.removeMember(1004);
		System.out.println("**********이수 회원 삭제후 전체 회원 출력***********");
		memList.showAllMember();
	}

}
/*
***********전체회원 출력***********
김범수회원님의 아이디는1001입니다.
나얼회원님의 아이디는1002입니다.
박효신회원님의 아이디는1003입니다.
이수회원님의 아이디는1004입니다.

**********이수 회원 삭제후 전체 회원 출력***********
김범수회원님의 아이디는1001입니다.
나얼회원님의 아이디는1002입니다.
박효신회원님의 아이디는1003입니다.

*/