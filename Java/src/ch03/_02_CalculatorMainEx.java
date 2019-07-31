package ch03;

public class _02_CalculatorMainEx {
	public static void main(String[] args) {
		
		// 객체 생성
		
		// 호출
		
		_01_CalculatorEx cal = new _01_CalculatorEx(); 
			
		double addR = cal.add(10,5);
		double subR = cal.sub(10,5);
		double mulR = cal.mul(10,5);
		double divR = cal.div(10,5);
		System.out.println("add: "+ addR);
		System.out.println("sub: "+ subR);
		System.out.println("mul: "+ mulR);
		System.out.println("div: "+ divR);
			
	}
}