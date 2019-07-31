package ch08;

public class _01_Main {
	public static void main(String[] args) {
		//_01_Calc cal2 = new _01_Calc(); 오류 : _01_Calc가 추상클래스이므로 객체생성 불가
		//_01_CalcImpl cal3 = new _01_CalcImpl() 오류 : _01_Calc가 인터페이스 이므로 객체생성불가
			
		int num1 = 8;
		int num2 = 0;
		
		// 자식 = 자식
		_01_SuBCalc sub = new _01_SuBCalc();
		System.out.println("덧셈 :" + sub.add(num1, num2));
		System.out.println("뺄셈 :" + sub.sub(num1, num2));
		System.out.println("곱셈 :" + sub.times(num1, num2));
		System.out.println("나눗셈 :" +sub.divide(num1, num2));
		sub.showInfo();
		sub.description();
		
		
		
		System.out.println("================");
		// 다형성적용 : 인터페이스  참조변수 = new 자식클래스();
		_01_CalcImpl cal = new _01_SuBCalc();
		System.out.println(cal.add(num1, num2));
		System.out.println(cal.sub(num1, num2));
		System.out.println(cal.times(num1, num2));
		System.out.println(cal.divide(num1, num2));
		//다운캐스팅
		_01_SuBCalc subcalc = (_01_SuBCalc)cal;
		subcalc.showInfo();
		// 자식타입 자식타입참조변수 = (자식타입)인터페이스참조변수
		
		
		System.out.println("================");
		//다형성적용 : 부모클래스 참조변수  = new 자식클래스();
		_01_Calc cal1 = new _01_SuBCalc();
		System.out.println(cal1.add(num1, num2));
		System.out.println(cal1.sub(num1, num2));
		System.out.println(cal1.times(num1, num2));
		System.out.println(cal1.divide(num1, num2));
		// 다운캐스팅
		_01_SuBCalc subcalc1 = (_01_SuBCalc)cal1;
		subcalc1.showInfo();
		// 자식타입 자식타입참조변수 = (자식타입)부모타입참조변수
	}

}
