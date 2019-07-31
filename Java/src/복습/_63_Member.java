package 복습;

public class _63_Member {
	//멤버변수
	private int memberID; //회원아이디
	private String memberName; // 회원 이름
	
	//생성자
	public _63_Member() {}
	public _63_Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
		
	}
	
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberName() {
		return memberName;
	}
	public String toString() {
		return memberName + "님의 아이디는" + memberID + "입니다.";
	}

}
