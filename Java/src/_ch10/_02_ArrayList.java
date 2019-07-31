package _ch10;

import java.util.*;

public class _02_ArrayList {
	public static void main(String[] args) {
		/*
		 * <면접>
		 * 컬렉션 프레임워크
		 * 
		 * Collection - List 인터페이스 : 클래스는 ArrayList,vector,LinkedList
		 * 			  - set 인터페이스 : 클래스는 HashSet, TreeSet
		 * 
		 * Map 인터페이스 <- HashMap, <- TreeMap
		 * 				<- HashTable <- Properties
		 * 
		 * 
		 * 1.특징
		 * List 인터페이스 : 순서가 있는 자료관리, 중복허용
		 * 				index를 사용하여 요소에 접근한다.
		 * 				리스트에 들어있는 요소들의 인덱스는 0부터 시작한다.
		 * 
		 * Set 인터페이스 : 순서가 없는 자료관리, 중복허용 않는다.
		 * 				클래스 종류는 HashSet, TreeSet
		 * 
		 * [ArrayList]
		 * 2. 선언
		 * ArrayList<데이터타입클래스> = new ArrayList<데이터타입클래스>();
		 * 
		 * 다형성적용
		 * ArrayList<데이터타입클래스> = new ArrayList<데이터타입클래스>();
		 * 
		 * 3. 특징 : 데이터 순서가 있다, 중복허용된다.
		 * 
		 * 4. 추가  : list.add(추가할 위치 index,값); // 지정한 인덱스에 값을 추가하겠다. 그 뒤값은 밀려난다
		 * 			list.add(값); // 앞에서부터 순서대로 추가
		 * 5. 교체  : list.set(교체할 위치 index,값); // 지정한 인덱스의 값을 변경하겠다 그 뒤값은 그대로이다.
		 * 6. 삭제  : list.remove(삭제할 위치 index);
		 * 7. 값 가져오기 : list.get(가져올 index); // list.size()만큼
		 * 8. 검색  : indexOf(검색할 값); // *중요*
		 * 			리스트에서 검색할 값과 똑같은 값을 갖는 첫번쨰 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		 * 9. 전체 삭제 : list.clear();
		 * 10. 반복자 : Iterator<E> iterator(참조변수) : while(hasNext()) {..}
		 */
		List<String> list = new ArrayList<String>(); // 되도록이면 List로 쓰는게 좋다.
		list.add("김치찌개");
		list.add("콩국수");
		list.add("삼겹살");
		list.add("전에막걸리");
		list.add("초코파이");
		list.add(1,"피자");// 인덱스를 통해 값을 추가
		list.add(4,"찜닭");// 인덱스를 통해 값을 추가
		list.add(5,"망고");// set = 전에막걸리 -> 망고로 교체
		//방법 1. for
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		System.out.println("향상된 for문");
		for(String st : list) {
			
		}
		System.out.println(list);
		
		// 방법3 . 반복자(Iterator)사용하기
		/*
		 * 사용목적 : 반복자는 java.util 패키지에 정의되어 있는 Iterator 인터페이스를 구현하는 객체이다.
		 * 			즉 컬렉션의 원소들에 접근하는 것이 목적이다.
		 * 
		 * 사용메소드
		 * hanNext() : 아직 접근하지 않은 요소가 있으면 true를 반환
		 * next() : 다음 요소를 반환... object 타입을 반환
		 * remove() : 최근에 반환된 요소를 삭제한다.
		 */
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("봄");
		list2.add("여름");
		list2.add("가을");
		list2.add("겨울");
		
		// 방법1.for
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		//방법2. 향상된 for문
		for(String st : list2) {
			
		}
		System.out.println(list2);
		
		Iterator iterator = list2.iterator();
		
		//기억
		while(iterator.hasNext()) {//ArrayList의 값이 존재하는지 체크 / hasNext()타입이  boolean
			// 존재하면 반복자는 값을 읽어서 Object타입으로 리턴하므로, String으로 형변환
			String str = (String) iterator.next();
			//Object str = iterator.nect();
			System.out.println(str + " ");
			// 무슨값인지 모르니깐 Object로 받는다.
		}
				
	}
	

}
