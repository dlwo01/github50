package 복습2;

public class _03_Member {
	
	//멤버변수
	private int memberId;
	private String memberName;
	
	
	public _03_Member () {}
	public _03_Member(int memberId,String memberName ) {
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
	public String toString() {
		return memberName+ "님의 아이디는" + memberId + "입니다.";
	}
	

}
