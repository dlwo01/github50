package interview;
// *중요*
import java.util.*;
public class _07_HashMap {
	/*
	 * 면접
	 * 
	 * 해싱(hashing) : 키를 이용해서 해시테이블(키가 접근하기 편하도록 정리되어있는곳)로부터 데이터를 가져오는 과정
	 * 
	 * HashMap
	 * 1) 특징
	 * - 데이터의 순서를 보장하지 않는다.
	 * - key와 value 쌍으로 저장한다.
	 * - key는 중복되면 안된다.
	 * - key를 이용해서 value를 가져올 수 있다.
	 * - List 계열과 달리 index가 필요없다.
	 * - Map 이라는 인터페이스를 구현한 클래스이다.
	 * 
	 * 2) 선언
	 * - HashMap<key 타입, value 타입> map(참조변수) = new HashMap<key 타입 , value타입>();
	 * - Map<key 타입, value 타입> map(참조변수) = new HashMap<key 타입 , value타입>(); // 다형성적용\
	 *
	 * 3) 메서드
	 * 데이터 추가 : put(key,value)
	 * 데이터 가져오기 : get(key)
	 * 데이터 삭제  : remove(key)
	 * 데이터 비어있는지 여부  : isEmpty()
	 * 해당 키가 있는 여부 : containsKey(key)
	 * 해당 값이 있는지 여부 : containsVale(value)
	 * 해당 갯수 : size() 
	 */
	
	// Map 생성
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "홍길동");
		map.put(2, "김범수");
		map.put(3, "이수");
		map.put(4, "박효신");
		map.put(5, "손흥민");
		//map 전체출 력
		for(int i =1; i <= map.size(); i++) {
			System.out.println(map.get(i) + " ");
		}
		
		System.out.println("==========");
		// "박효신" 데이터 가져오기
		System.out.println(map.get(4));
		
		System.out.println("==========");
		//삭제
		map.remove(3);
		// 삭제후 전체출력
		for(int i =1; i<=map.size() +1 ; i++) {
			System.out.println(map.get(i));
		}
		
		System.out.println("데이터가 비어있는지 여부 : isEmpty()");
		// 데이터가 비어있는지 여부 : isEmpty()
		System.out.println(map.isEmpty());//false;
		
		System.out.println("해당키가 존재하는지 여부 : cotainsKey(key)");
		//해당키가 존재하는지 여부 : cotainsKey(key);
		System.out.println(map.containsKey(2));//true;
		System.out.println(map.containsKey(3));// false; 삭제해서
		
		System.out.println(" 해당값이 존재하는지 여부 : containsValue(값)");
		// 해당값이 존재하는지 여부 : containsValue(값)
		System.out.println(map.containsValue("손흥민"));// true;
		System.out.println(map.containsValue("이수")); // false;
		
		
		System.out.println("====갯수====");
		//갯수 : size()
		System.out.println(map.size()); // 4
		
		
	}

	
	
	
}
