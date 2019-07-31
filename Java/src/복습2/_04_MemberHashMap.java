package 복습2;
import java.util.*;




public class _04_MemberHashMap {
	//Map<key데이터타입, value 데이터타입> hashMap;
	private Map<Integer , _03_Member>hashMap;
	
	public _04_MemberHashMap() {
		hashMap = new HashMap<Integer, _03_Member>();
	}
	public void addMember(_03_Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
	}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	//전체회원 출력
	public void showAllMember() {
		Iterator iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			
		}
	}
	

}
