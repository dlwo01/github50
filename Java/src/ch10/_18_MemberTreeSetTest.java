package ch10;

public class _18_MemberTreeSetTest {
	public static void main(String[] args) {
		_18_MemberTreeSet memberTreeSet = new _18_MemberTreeSet();
		_18_Member memberLee = new _18_Member(1001,"이지원");
		_18_Member memberSon =  new _18_Member(1002,"손흥민");
		_18_Member memberPark = new _18_Member(1003,"박효신");
		
		// HashSet에 회원정보 추가
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		
		// 회원정보 조회
		memberTreeSet.showAllMember();
		
		
		//1명 추가(중복id로)
		_18_Member memberHong = new _18_Member(1003,"홍길동");
		memberTreeSet.addMember(memberHong);
		
		// 회원정보 조회
		memberTreeSet.showAllMember();
	
		/*
		 * Comparable 인터페이스를 구현하지 않았다는 오류 발생
		 * -> 어떤 기준으로 노드를 비교하여 트리를 형성해야 하는지를 구현하지 않았다는 뜻이다.
		 * 따라서 회원을 TreeSet에 추가할 때 어떤 기준으로 비교할 것인지 구현해 주어야 한다.
		 * 
		 * -> _18_Member 클래스가 가진 회원 아이디를 기준으로 오름차순 정렬하기 위해
		 * -> Comparable 인터페이스 : 자기 자신과 전달받은 매개변수를 비교하는 인터페이스
		 * 							comapteTO() 추상메소드를 오버라이드 해야 한다.
		 */
		
		/*오버라이드 후 데이터가 오름차순 정렬됨
		이지원회원님의 아이디는1001입니다.
		손흥민회원님의 아이디는1002입니다.
		박효신회원님의 아이디는1003입니다.

		이지원회원님의 아이디는1001입니다.
		손흥민회원님의 아이디는1002입니다.
		박효신회원님의 아이디는1003입니다.
		*/
		
}
}
