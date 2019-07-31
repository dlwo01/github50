package ch04;
		//클래스는 설계도(디자인)이며 
		// 객체는 이 설계도를 바탕으로 만들어진 힙메모리(일부에) 공간
		// 참조변수: 주소값
		//참조변수안에 멤버변수,멤버메서드가 있다.
public class _01_Student {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인, 틀, 청사진
	 * 			-멤버변수(속성,필드)+멤버메소드(기능,동작)+생성자
	 * 클래스는 설계도(디자인)이며, 객체는 이 설계도를 바탕으로 만들어진 힙메모리(일부) 공간이다.
	 * 그 결과 주소값이 만들어지며, 참조변수에 할당된다.
	 */
	// 멤버변수 => 속성
	int studentID;	// 학번
	String studentName;	// 이름
	int grade;	// 학년
	String address;	// 주소
	String email;
	int score;
	
	
	// 생성자 - 클래스명과 동일, 리턴타입이 없다.
	public _01_Student() {}
	
	//멤버메서드 => 기능
	public void showStudentInfo() { // 기본메서드
		System.out.println("studentName : " + studentName );
		System.out.println("address: " + address);
		System.out.println("grade: " + grade);
		System.out.println("studentID: " + studentID);
		System.out.println("email: " + email);
		System.out.println("score: " + score + "점");
		
		}
}
