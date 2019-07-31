package 복습;

import java.util.ArrayList;

public class _63_MemberArrayListTest {
	
	public ArrayList<_63_Member>arrList; //ArrayList선언
	
	//디폴트생성자
	public _63_MemberArrayListTest() {
		arrList = new ArrayList<_63_Member>(); // _63_Member형으로 선언한 ArrayList 생성
	}
	//회원추가 메소드
	public void addMember(_63_Member mem) {
		arrList.add(mem);
	}
	// 회원 삭제 메소드
	public boolean removeMember(int memberID) {
		for(int i = 0; i < arrList.size(); i++) {
			_63_Member mem = arrList.get(i);
			int tempId = mem.getMemberID();
			if(tempId == memberID) {
				arrList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
		}
	public void showAllMember() {
		for(_63_Member member : arrList) {
			System.out.println(member);
		}
	}
		
	

}
