package ch03;

public class _01_CalculatorMainEx {
	public static void main(String[] args) {
		
		// 객체 생성
		
		// 호출
		
		_01_CalculatorEx cal = new _01_CalculatorEx(); 
			
		int addR = cal.add(10,5);
		System.out.println("add: " + addR);
		int subR = cal.sub(10, 5);
		System.out.println("sub: "+ subR);
		int mulR = cal.mul(10,5);
		System.out.println("mul:" + mulR);
		int divR = cal.div(10,5);
		System.out.println("div: " + divR);
	}
}