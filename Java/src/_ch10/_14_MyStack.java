package _ch10;

import java.util.*;
//p.419
public class _14_MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	// stack추가 - push() : 스택의 맨 뒤에 요소를 추가
	public void push(String data) {
		//ArrayList 추가 - add()
		arrayStack.add(data);
	}
	
	//stack 삭제 - pop() : 스택의 맨 뒤에 요소를 삭제
	public String pop() {
		
		int len = arrayStack.size(); // ArrayList의 자료개수
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		//ArrayList 삭제 - remove()
		return arrayStack.remove(len - 1); //맨 뒤에 있는 자료 반환하고 배열에서 제거 
	}
	

}
