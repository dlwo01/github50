package ch10;

public class _16_Member {
	// 멤버변수
	private int memberId; // 회원아이디
	private String memberName; // 회원 이름
	
	
	//생성자
	public _16_Member() {}
	public _16_Member(int memberId, String memberName) {
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
	
	// 추가 시작
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _16_Member) {
			_16_Member member = (_16_Member)obj; //다운캐스팅
			// 값 비교 : 자신의 회원아이디와 매개변수로 받은 회원아이디가 같다면 true를 반환
			if(this.memberId == member.getMemberId()) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	// 추가 종료
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는" + memberId + "입니다.";
	}
	

}
