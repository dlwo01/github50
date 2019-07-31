package _ch10;

public class _11_MemberHashMapTest {
	public static void main(String[] args) {
		
		_11_MemberHashMap memHashMap = new _11_MemberHashMap();
		
		// member 정보 생성
		_05_Member memberKim = new _05_Member(1001, "김범수");
		_05_Member memberNa = new _05_Member(1002, "나얼");
		_05_Member memberPark = new _05_Member(1003, "박효신");
		_05_Member memberLee = new _05_Member(1004, "이수");
		
		//member정보를 hashMap에 추가
		//memHashMap.addMember(new _05_Member(1001, "김범수"));
		
		memHashMap.addMember(memberKim);
		memHashMap.addMember(memberNa);
		memHashMap.addMember(memberPark);
		memHashMap.addMember(memberLee);
		
		//모든회원정보조회
		memHashMap.showAllMember();
		/*
		김범수회원님의 아이디는1001입니다.
		나얼회원님의 아이디는1002입니다.
		박효신회원님의 아이디는1003입니다.
		이수회원님의 아이디는1004입니다.
		*/
		
		System.out.println("====삭제 후 조회====");
		// 회원아이디(key값)가 1004인 회원정보 삭제
		memHashMap.removeMember(1004);
		
		//모든 회원정보 조회
		memHashMap.showAllMember();
		/*
		====삭제 후 조회====
		김범수회원님의 아이디는1001입니다.
		나얼회원님의 아이디는1002입니다.
		박효신회원님의 아이디는1003입니다.
		*/


	
	}

}
