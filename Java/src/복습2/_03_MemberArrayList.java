package 복습2;

import java.util.ArrayList;

public class _03_MemberArrayList {
	public ArrayList<_03_Member> arrList;
	
	public _03_MemberArrayList() {
		arrList = new ArrayList<_03_Member>();
	}
	
	public void addMember(_03_Member mem) {
		arrList.add(mem);
	}
	public boolean removeMember(int memberId) {
		for(int i =0; i < arrList.size(); i++) {
			_03_Member member = arrList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "존재하지 않습니다.");
		return false;
	}
	public void showAllMembeer() {
		for(_03_Member mem : arrList) {
			System.out.println(mem);
		}
		System.out.println();
	}
	
}
