package _ch10;

import java.util.*;

public class _12_HashMapEx {
	public static void main(String[] args) {
		Map<String, _05_Member> map = new HashMap<String,_05_Member>();
		
		//hashMap에 추가
		map.put("M001", new _05_Member(1,"홍길동"));
		map.put("M002",new _05_Member(2,"이몽룡"));
		map.put("M003", new _05_Member(3,"성춘향"));
		
		System.out.println(map.toString());// 중복값이 없어 순서대로 출력 x
		//{M003=성춘향회원님의 아이디는3입니다., M002=이몽룡회원님의 아이디는2입니다., M001=홍길동회원님의 아이디는1입니다.}
		
		//멤버삭제
		map.remove("M002");
		System.out.println(map);
		//{M003=성춘향회원님의 아이디는3입니다., M001=홍길동회원님의 아이디는1입니다.}
		
		//멤버추가
		//해쉬맵은 원래 오류지만 오류를 뱉어내지 못함
		//그래서 오버라이드로 돌려
		map.put("M003", new _05_Member(3,"짱구"));
		System.out.println(map);
		//{M003=짱구회원님의 아이디는3입니다., M001=홍길동회원님의 아이디는1입니다.}
		
		//조회
		/*
		 * Map.Extry<String, _05_Member> str => 인터페이스<key타입,value타입> 변수명
		 * entrySet() 메소드 : map을 구성하는 기본단위인 Entry를 java.util.set의 형태로 변환한다.
		 * Entry 인터페이스는 하나의 Key와value를 나타낸다.
		 */
		for(Map.Entry<String, _05_Member> str : map.entrySet()) {
			String key = str.getKey();
			_05_Member value = str.getValue();
			System.out.println("key :" + key + " , value :" + value);
			 
			/*
			 key :M003 , value :짱구회원님의 아이디는3입니다.
			 key :M001 , value :홍길동회원님의 아이디는1입니다.
			 */
		}
		
	}

}
