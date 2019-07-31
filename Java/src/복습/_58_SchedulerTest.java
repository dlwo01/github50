package 복습;

import java.io.IOException;

public class _58_SchedulerTest {
	public static void main(String[] args) throws IOException {// JMV에게 예외처리를 떠넘긴다.
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read(); // 콘솔에서 입력을 받는 아스키코드값으로만 받는다.
		// System.in.read()를 쓰기 위해서 throws IOException이 필요하다.
		
		
		_58_SchedulerImpl scheduler = null; //  null값으로 초기화
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new _58_RoundRobin(); //다형성
		}else if(ch == 'L' || ch == 'l') {
			scheduler = new _58_RoundRobin();
		}else if(ch == 'P' || ch == 'p') {
			scheduler = new _58_PriorityAllocation();
			
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall(); // 인터페이스의 추상메소드 -> 자식의 구현메소드 호출
		scheduler.sendCallToAgent();
		
	}

}
/*
전화 상담 할당 방식을 선택하세요.
R : 한명씩 차례로 할당
L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당
P : 우선순위가 높은 고객 먼저 할당
l
상담 전화를 순서대로 대기열에 가져옵니다.
다음 순서 상담원에게 배분합니다.
*/