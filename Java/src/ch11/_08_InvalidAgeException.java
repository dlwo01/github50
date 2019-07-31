package ch11;

//사용자 정의 Exception : extends Exception
public class _08_InvalidAgeException extends Exception{
	
	//매개변수 생성자
	
	private static String wrongName;
	
	//기본생성자
	public _08_InvalidAgeException() {}
	
	//매개변수 생성자\
	public _08_InvalidAgeException(String wrongName) {
		
		this.wrongName = wrongName;
		
	}
	


	//getter
	
	public String getWrongName() {
		return wrongName;
	}
	
	//출력문
	
	public void showError(){
		System.out.println("잘못 입력된 이름 :" + wrongName);
	}
	
}
