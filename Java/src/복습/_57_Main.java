package 복습;

public class _57_Main {
	public static void main(String[] args) {
		//_57_Calc cal2 = new _57_Calc(); 오류 : _57_Calc가 추상클래스이므로 객체생성 불가
		//_57_CalcImpl cal3 = new _57_CalcImpl() 오류 : _57_Calc가 인터페이스 이므로 객체생성불가
		
		
		int num1 = 10;
		int num2 = 5;
		
		// 자식 = 자식
		_57_SubCalc sub = new _57_SubCalc();
		System.out.println(sub.add(num1, num2));
		System.out.println(sub.sub(num1, num2));
		System.out.println(sub.times(num1, num2));
		System.out.println(sub.divide(num1, num2));
		sub.showInfo();
		
		
		System.out.println("==============");
		//인터페이스 = 자식
		_57_Calcmpl cal = new _57_SubCalc();
		System.out.println(sub.add(num1, num2));
		System.out.println(sub.sub(num1, num2));
		System.out.println(sub.times(num1, num2));
		System.out.println(sub.divide(num1, num2));
		//다운캐스팅
		_57_SubCalc subcalc = (_57_SubCalc)cal;
		subcalc.showInfo();
		
		
		System.out.println("**************");
		// 부모클래스 = 자식
		_57_Calc cal1 = new _57_SubCalc();
		System.out.println(sub.add(num1, num2));
		System.out.println(sub.sub(num1, num2));
		System.out.println(sub.times(num1, num2));
		System.out.println(sub.divide(num1, num2));
		//다운캐스팅
		_57_SubCalc subcalc1 = (_57_SubCalc)cal1;
		subcalc1.showInfo();
		
		
		
	}

}

/*
15
5
50
2
CalcImpl 인터페이스를 구현하였습니다.
==============
15
5
50
2
CalcImpl 인터페이스를 구현하였습니다.
**************
15
5
50
2
CalcImpl 인터페이스를 구현하였습니다.
*/