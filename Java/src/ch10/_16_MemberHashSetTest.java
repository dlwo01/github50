package ch10;

public class _16_MemberHashSetTest {
	public static void main(String[] args) {
		_16_MemberHashSet memberHashSet = new _16_MemberHashSet();
		_16_Member memberLee = new _16_Member(1001,"이지원");
		_16_Member memberSon =  new _16_Member(1002,"손흥민");
		_16_Member memberPark = new _16_Member(1003,"박효신");
		
		// HashSet에 회원정보 추가
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		
		// 회원정보 조회
		memberHashSet.showAllMember();
		/*
	 	박효신회원님의 아이디는1003입니다.
		이지원회원님의 아이디는1001입니다.
		손흥민회원님의 아이디는1002입니다.
		*/
		
		
		//1명 추가(중복id로)
		_16_Member memberHong = new _16_Member(1003,"홍길동");
		memberHashSet.addMember(memberHong);
		
		// 회원정보 조회
		memberHashSet.showAllMember();
		
		// 1003번 회원 박효신, 홍길동이 그대로 출력
		// HashSet은 중복으로 출력이 안됌 원래
		// 이유 :  주소값을 비교해서 주소가 다름 -> 다른 객체로 인식
		// 따라서 _16_Member 클래스에 hashCode(),equals() 메소드를 오버라이드 하면
		// 값비교가 되어, 주소가 다르더라도 값을 비교하여, 값이 같을 경우 중복되지 않도록 반환
		
		/*
		_16_Meber에 hashCode(), equals() 메소드 오버라이드 반영 전
		박효신회원님의 아이디는1003입니다.
		이지원회원님의 아이디는1001입니다.
		손흥민회원님의 아이디는1002입니다.
		홍길동회원님의 아이디는1003입니다.
		*/
		
		
		/*
		_16_Meber에 hashCode(), equals() 메소드 오버라이드 반영 전 .. 중복된 아이디가 추가되지 않음	
		이지원회원님의 아이디는1001입니다.
		손흥민회원님의 아이디는1002입니다.
		박효신회원님의 아이디는1003입니다.
		*/

		

	}

}
