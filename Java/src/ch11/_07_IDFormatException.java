package ch11;

// 사용자 정의 예외 클래스 : 반드시 extends Exception 해야 한다.
public class _07_IDFormatException extends Exception{
	// 사용자 정의 예외 구현
	// throw new 사용자정의 예외에서 호출
	public _07_IDFormatException(String message) {
		super(message); //부모 매개변수생성자로 message 전달 -> 멤버변수 -> getMessage()에서 리턴(호출가능)
		
		
	}
}
