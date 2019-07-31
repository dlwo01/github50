package ch11;

//사용자 정의 Exception : extends Exception
public class _08_InvalidAgeException2 extends Exception{
	
	//매개변수 생성자
	private static  int wrongAge;
	
	//기본생성자
	public _08_InvalidAgeException2() {}
	
	//매개변수 생성자\
	public _08_InvalidAgeException2(int wrongAge) {
		this.wrongAge = wrongAge;
		
		
	}
	


	//getter
	public int getWrongAge() {
		return wrongAge;
	}
	
	
	//출력문
	
	public void showError(){
		System.out.println("잘못 입력된 나이 :" +  wrongAge );
	}
	
}
