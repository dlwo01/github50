package ch03;

public class _02_CalculatorEx {
	/*
	 * 함수 : 하나의 기능을 수행하는 일련의 코드
	 * 메소드 : 클래스 안에 정의된 함수
	 *        특정한 작업을 수행하는 문장들의 모임
	 *        입력을 받아서 처리결과를 반환하는 상자
	 *        메소드 호출시 메소드명이 일치해야 하며, 매개변수 갯수와 type이 일치해야 한다.(중요)
	 *       
	 *	public 반환형 메소드명(매개변수1, 매개변수2, ..) {
	 *		return 반환값; // 처리결과를 반환하며, 반환형과 일치해야 한다.
	 * 	}
	 * 반환형이 void로 선언된 메소드는 결과값을 반환하지 않는다.
	 */
	
	public double add(double i, double j) {
		double result = i + j;
		return result;
	}
	
	public double sub(double i , double j) {
		double result = i - j;
		return result;
	}
	public double mul(double i, double j) {
		double result = i * j;
		return result;
	}
	public double div(double i, double j) {
		double result = i / j;
		return result;
	}
	
	}
