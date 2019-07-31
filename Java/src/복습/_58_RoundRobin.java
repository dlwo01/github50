package 복습;

public class _58_RoundRobin implements _58_SchedulerImpl {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
	

}
