package ch10;

public class _11_MemberHashMapTest {
	public static void main(String[] args) {
		
		_11_MemberHashMap memHashMap =  new _11_MemberHashMap();
		
		// member정보 생성
		_05_Member memberlee = new _05_Member(1001,"이지원");
		_05_Member memberSon = new _05_Member(1002,"손민국");
		_05_Member memberPark = new _05_Member(1003,"박서준");
		_05_Member memberHong = new _05_Member(1004, "홍석천");
		
		// member 정보를 hashMap에 추가
		//memHashMap.addMember(new _05_Member(1001,"이지원"));
		memHashMap.addMember(memberlee);
		memHashMap.addMember(memberSon);
		memHashMap.addMember(memberPark);
		memHashMap.addMember(memberHong);
		
		
		// 모든 회원정보 조회
		memHashMap.showAllMember();
		
		/*
		이지원회원님의 아이디는1001입니다.	
		손민국회원님의 아이디는1002입니다.
		박서준회원님의 아이디는1003입니다.
		홍석천회원님의 아이디는1004입니다.
		*/
		
		
		System.out.println("====삭제 후 조회====");
		// 회원아이디(key값)가 1004인 회원정보 삭제
		memHashMap.removeMember(1004);
		
		// 모든 회원정보 조회
		memHashMap.showAllMember();
		
		/*
		 ====삭제 후 조회====
		이지원회원님의 아이디는1001입니다.
		손민국회원님의 아이디는1002입니다.
		박서준회원님의 아이디는1003입니다.
		*/
		
	}
	

}
