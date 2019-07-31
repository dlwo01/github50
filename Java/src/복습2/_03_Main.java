package 복습2;

public class _03_Main {
	public static void main(String[] args) {
		_03_MemberArrayList mamList = new _03_MemberArrayList();
		
		mamList.addMember(new _03_Member(1001,"이수"));
		mamList.addMember(new _03_Member(1002, "손흥미"));
		mamList.addMember(new _03_Member(1003, "박효신"));
		mamList.addMember(new _03_Member(1004,"홍"));
		
		System.out.println("====전체 회원 출력====");
		mamList.showAllMembeer();
		
		
		mamList.removeMember(1004);
		System.out.println("====홍철 회원 삭제후 전체 회원 출력====");
		mamList.showAllMembeer();
		
	}        
	         
	}        
             
             
           