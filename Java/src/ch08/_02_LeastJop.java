package ch08;

public class _02_LeastJop implements _02_SchedulerImpl {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당됩니다.");
		
	}
	

}
