package ch10;

import java.util.*;

public class _03_ArrayList {
	public static void main(String[] args) {
		/*
		 * 8. 검색 : indexOf(검색할 값); // *중요*
		 * 			리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		 * 			만약에 검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
		 */
		List<String> list = new ArrayList<String>();
		list.add("L");//0
		list.add("e");
		list.add("e");
		list.add("J");
		list.add("a");
		list.add("e");
		list.add("D");
		list.add("o");
		list.add("n");
		list.add("g");//9
		
		//일치하는 첫번째 데이터를 찾아서 그 인덱스를 리턴한다.
		System.out.println("g문자의 인덱스 :" + list.indexOf("g") );//J문자의 인덱스 :3
		System.out.println("n문자의 인덱스 :" + list.indexOf("n"));//n문자의 인덱스 :8
		
		
		//일치하는 첫번째 데이터를 찾아서 그 인덱스를 리턴한다.
		System.out.println("g문자의 마지막 인덱스 :" + list.lastIndexOf("g"));
		System.out.println("z문자의 마지막 인덱스 :" + list.indexOf("z"));
		// 전체 리스트 출력
		for(String str : list) {
			System.out.println(str + " ");
		}
		//list 삭제
		list.clear();
		System.out.println("리스트 삭제후");
		System.out.println("list" +list);
		
		
	}

}
