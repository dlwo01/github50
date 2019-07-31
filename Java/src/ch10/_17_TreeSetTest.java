package ch10;

import java.util.*;

public class _17_TreeSetTest {
	public static void main(String[] args) {
		//p.428
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		/* 오름차순 정렬 - String 클래스에 정렬방식이 이미 구현되어 있음
		강감찬
		이순신
		홍길동
		*/
		
	}

}
