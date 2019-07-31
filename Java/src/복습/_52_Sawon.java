package 복습;

public class _52_Sawon extends _52_Employee {
	
	private int sudang;
	
	public _52_Sawon() {
		
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
		
	}
	public int getSudang() {
		return sudang;
		
	}
	/*
	 * 면점
	 * @Override
	 * 오버라이딩 : 자식클래스의 메소드가 부모클래스의 메소드를 오버라이드(재정의)한다라고 말한다.
	 * 			 오버라이드 : 부모메소드의 기능을 무시한다는 의미이다.
	 * 			 - 상속에서 부모클래스의 메소드를 변경하고자 할 때 사용
	 * 			 - 메소드의 이름, 매개변수, 반환형은 모두 동일해야한다.(동일하지 않으면 컴파일러가 다른 메소드로 인식한다.)
	 * 			 - 호출시 오버라이딩한 자식의 메소드가 호출된다.
	 * 				(오버라이드 목적 : 부모클래스의 메소드를 변경해서 자식쪽에서 호출하고자 하는 의도)
	 */
	
	@Override
	public void printInfo() {
		System.out.println("사번 :" + getSabun());
		System.out.println("이름 :" + getName());
		System.out.println("부서명 :" + getDeptName());
		System.out.println("급여 :" + getSalary());
		System.out.println("수당 :" + getSudang());
	}

}
