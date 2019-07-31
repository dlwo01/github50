package ch04;

public class _07_Student {
	/*
	 * static 변수 = 정적변수 = 공유변수 = 클래스변수
	 * static변수 : - 프로그램이 실행되어 메모리에 올라갔을 때 딱 한번 데이터영역 메모리 공간에 할당된다.
	 * 			    - 객체생성하지 않고 바로 클래스명으로 접근가능하다.
	 * 			    - 그 값은 모든 인스턴스가 공유한다. 
	 * 			    - 따라서 모든 인스턴스가 동일한 static 변수를 가리킨다.
	 * 				- 클래스명.멤버변수 / 클래스명.멤버메소드 	
	 *  -static 메소드나 변수는 static 메소드에서 호출가능
	 *  (정적메소드에서 인스턴스 변수나 메소드를 호출할 경우 컴파일 오류가 난다.)
	 *  -static 메소드는 실행시 자동으로 메모리에 올라가나, 일반 메소드는 객체를 생성해야 메모리에 올라간다.
	 *  따라서 멤버변수는 객체생성을 안했으므로 메모리에 안올라간 상태임
	 */
	public static int serialNum = 1000;
	// 멤버변수
	public int studentID;  // 학번
	public static String studentName; // 이름
	
	//기본생성자
	public _07_Student() {}
	
	//serilaNum
	public static int getSerilaNum() {
		int i = 10; // 로컬(지역)변수
		//String studentName = "홍길동";// 로컬(지역)변수
		
		//멤버변수 studentName은 객체생성을 안했으므로 메모리에 안올라간 상태임
		//따라서 static 메소드에서 일반 멤버변수에 접근 불가
		//studentName = "홍길동"; // 오류 
		return serialNum;
		//static변수는 static을 통해서 접근
		
	}
	
	
	// 학번
	public void setStudentID(int studentID) {
		this.studentID = studentID;
		
	}
	public int getStudentID() {
		return studentID;
		
	}
	
	// 이름
	public void setStudentNAME(String studentName) {
		this.studentName = studentName;
		
	}
	public String getStudentName() {
		return studentName;
		
	}
	

}
