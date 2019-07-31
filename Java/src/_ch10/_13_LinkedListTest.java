package _ch10;

import java.util.*;

public class _13_LinkedListTest {
	//p.416
	public static void main(String[] args) {
		/*
		 * 사용하는 자료의 변동(삽입,삭제)이 많은 경우에는 링크드 리스트를
		 * 자료변동이 거의 없는 경우에는 배열을 사용하는 것이 효율적이다.
		 * 
		 * 링크드 리스트의 맨 앞 또는 맨 뒤에 요소를 추가, 삭제하는 addLast(),removeFirst(),removeLast()메소드가 있다
		 */
		
		//링크드리스트 생성
		LinkedList<String> myList = new LinkedList<String>();
		
		//링크드리스트 데이터 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//리스트 전체 출력
		System.out.println(myList); // toString()생략 //[A, B, C]

		//링크드리스트의 첫번째 위치에 D 추가
		myList.add(1,"D");
		//리스트 전체 출력
		System.out.println(myList);// toString()생략 //[A, D, B, C]
		
		//링크드리스트 맨앞에 0추가
		myList.addFirst("0"); //toString()생략 //[0, A, D, B, C]
		//데이터가 스티링타입이여서 숫자여도""를 줘야함
		
		//리스트 전체출력
		System.out.println(myList);
		
		//링크드리스트의 맨뒤요소 삭제 후 리스트 출력
		System.out.println(myList.removeLast());//C
		//리스트 전체 출력
		System.out.println(myList);// toString()생략 // [0, A, D, B]
	}
}
