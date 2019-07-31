package ch10;

public class _05_Main {
	public static void main(String[] args) {
		_05_MemberArrayList memList = new _05_MemberArrayList();
		
		
		// 매개변수 생성자 호출
		/*
		_02_Member memberLee = new _02_Member(1001,"이수"); 
		_02_Member memberSon = new _02_Member(1002, "손흥민");
		_02_Member memberPark = new _02_Member(1003, "박효신");
		_02_Member memberHong = new _02_Member(1004, "홍철");
		*/
		// 회원추가
		memList.addMember( new _05_Member(1001,"이수"));
		memList.addMember(new _05_Member(1002, "손흥민"));
		memList.addMember(new _05_Member(1003, "박효신"));
		memList.addMember(new _05_Member(1004, "홍철"));
		
		
		// 전체회원 출력
		System.out.println("====전체 회원 출력====");
		memList.showAllMember();
		
		
		//홍철 회원 삭제
		//memList.removeMember(memberHong.getMemberId());
		memList.removeMember(1004);
		System.out.println("====홍철 회원 삭제후 전체 회원 출력====");
		memList.showAllMember();
		
		
		
		
	}

}
