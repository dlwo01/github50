package ch10;

import java.util.*;
//P.431
public class _18_MemberTreeSet {
	private TreeSet<_18_Member> treeSet;
	//기본생성자
	public _18_MemberTreeSet() {
		//HashSet생성
		treeSet = new TreeSet<_18_Member>();
		
	}
	//회원추가
	public void addMember(_18_Member member) {
		treeSet.add(member);
		
	}
	//회원삭제
	public boolean removeMember(int memberId) {
		Iterator<_18_Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			_18_Member member = ir.next();//회원을 하나씩 가져와서
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
		//회원조회
		public void showAllMember() {
			for(_18_Member member : treeSet) {
				System.out.println(member);
			}
			System.out.println();
		}
	
}
	
	
