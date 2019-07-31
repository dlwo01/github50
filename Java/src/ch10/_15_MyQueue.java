package ch10;

import java.util.*;

public class _15_MyQueue {
	// 큐는 먼저 추가된 데이터부터 꺼내서 사용하는 방식(First In First Out : FIFO)
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	// 큐의 맨 뒤에 추가
	public void enQueue(String data) {
		//ArrayList에 추가
		arrayQueue.add(data);
	}
	
	// 큐의 맨 앞의 자료를 반환하고 배열에서 제거
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arrayQueue.remove(0);
	}

}
