package ch10;
//1) 클래스에 추가 : implements Comparable<_18_Member>
//2) compareTO()를 추가해서 오버라이드 해야한다.
public class _18_Member implements Comparable<_18_Member>{
	// 멤버변수
	private int memberId; // 회원아이디
	private String memberName; // 회원 이름
	
	
	//생성자
	public _18_Member() {}
	public _18_Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberName() {
		return memberName;
	}
	// treeSet 추가 시작
	/*
	 * 추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교함
	 * 비교대상은 this.memberId는 새로 추가한 회원 아이디와 compareTo() 메소드의 매개변수로 전달된 회원아이디
	 * 새로 추가한 회원 아이디가 더 크면 양수, 그렇지 않으면 음수, 같으면 0을 반환
	 * 출력 결과값은 오름차순 정렬이다. -1을 곱하면 내림차순 정렬
	 */
	@Override
	public int compareTo(_18_Member member) {
		return this.memberId - member.memberId; // 오름차순 정렬
		//return (this.memberId - member.memberId) * (-1); // 내림차순 정렬
	}
	// treeSet 추가 종료
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는" + memberId + "입니다.";
	}
	
	
	

}
