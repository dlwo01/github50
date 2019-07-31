package ch10;

public class _05_Member {
	// 멤버변수
	private int memberId; // 회원아이디
	private String memberName; // 회원 이름
	
	
	//생성자
	public _05_Member() {}
	public _05_Member(int memberId, String memberName) {
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
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는" + memberId + "입니다.";
	}
	

}
