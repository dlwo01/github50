package ch10;

import java.util.*;

public class _16_MemberHashSet {
	//HashSet 선언
	private HashSet<_16_Member> hashSet;

	//기본생성자
	public _16_MemberHashSet() {
		//HashSet생성
		hashSet = new HashSet<_16_Member>();
		
	}
	//회원추가
	public void addMember(_16_Member member) {
		hashSet.add(member);
		
	}
	//회원삭제
	public boolean removeMember(int memberId) {
		Iterator<_16_Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			_16_Member member = ir.next();//회원을 하나씩 가져와서
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
		//회원조회
		public void showAllMember() {
			for(_16_Member member : hashSet) {
				System.out.println(member);
			}
			System.out.println();
		}
	
}
