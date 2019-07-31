package interview;

public class _02_SuBCalc extends _02_Calc {

	@Override
	public int times(int num1, int num2) {
	
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 !=0) {
			return num1 / num2;
		}else {
			return _02_CalcImpl.ERROR; // 인터페이스명.상수(static 이므로)
		}
		
		
		//int mul = num1 / num2;
		//return mul; 이렇게 변수에 값을 넣어서 할 수 있음
	}
	
	public void showInfo() {
		System.out.println("CalcImol 인터페이스를 구현하였습니다.");
	}

}
