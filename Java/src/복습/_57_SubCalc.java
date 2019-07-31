package 복습;

public class _57_SubCalc extends _57_Calc {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2 ;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 !=0) {
			return num1 / num2;
		}else {
			return _57_Calcmpl.ERROR;// 인터페이스명.상수(static 이므로)
		}
		
		}
		public void showInfo() {
			System.out.println("CalcImpl 인터페이스를 구현하였습니다.");
		}
	
}
