package _ch10;

import java.util.*;
public class _11_MemberHashMap {
	private Map<Integer, _05_Member> hashmap;
	
	//기본생성자
	public _11_MemberHashMap() {
		hashmap = new HashMap<Integer, _05_Member>();
		
	}
	
	//추가
	public void addMember(_05_Member member) {
		hashmap.put(member.getMemberId(),member);
	}
	//삭제
	public boolean removeMember(int memberID) {
		if(hashmap.containsKey(memberID)) {
		hashmap.remove(memberID);
		return true;
	}
		System.out.println(memberID + "가 존재하지 않습니다");
		return false;
	
	}
	// 전체회원출력
	public void showAllMember() {
		Iterator <Integer> iterator = hashmap.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			_05_Member member = hashmap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
}