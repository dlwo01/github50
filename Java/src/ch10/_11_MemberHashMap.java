package ch10;

import java.util.*;

public class _11_MemberHashMap {
	//Map<key데이터타입 , value 데이터타입> hashMap;
	private Map<Integer, _05_Member> hashMap;//HashMap 선언
	
	//기본생성자
	public _11_MemberHashMap() {
		hashMap = new HashMap<Integer, _05_Member>(); //HashMap선언
	}
	
	// 회원정보 추가
	public void addMember(_05_Member member) {
		// hashMap.put(key, value);
		hashMap.put(member.getMemberId(), member);
	}
	// 회원정보 삭제
	public boolean removeMember(int memberID) {
		// hashMap에 매개변수로 받은 key에 해당하는 회원아이디가 있다면 삭제
		if(hashMap.containsKey(memberID)) {
			hashMap.remove(memberID);
			return true;
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
		
	}
	
	// 전체 회원정보 출력
	public void showAllMember() {
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) { // 다음 key가 있으면
			int key = iterator.next(); // key값을 가져와서
			_05_Member member = hashMap.get(key); // key로 부터 value 가져오기
			System.out.println(member); //.toString 생략
			}
		System.out.println();
		
	}
	}
