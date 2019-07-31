package 복습;

public class _63_Main {
	public static void main(String[] args) {
		_63_MemberArrayListTest memList = new _63_MemberArrayListTest();
		memList.addMember(new _63_Member(1001, "김태우"));
		memList.addMember(new _63_Member(1002, "이동훈"));
		memList.addMember(new _63_Member(1003, "이주법"));
		memList.addMember(new _63_Member(1004, "이명섭"));
		
		
		memList.showAllMember();
		
		memList.removeMember(1004);
		memList.showAllMember();
		
		
	}
}
/*
 김태우님의 아이디는1001입니다.
이동훈님의 아이디는1002입니다.
이주법님의 아이디는1003입니다.
이명섭님의 아이디는1004입니다.
김태우님의 아이디는1001입니다.
이동훈님의 아이디는1002입니다.
이주법님의 아이디는1003입니다.
*/
