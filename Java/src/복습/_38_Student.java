package 복습;

public class _38_Student {
	// private = (멤버변수(캡슐화 : 정보은닉화))
	private int studentID;
	private String studentName;
	private int grade;
	private String address;

	
	//디폴트 생성자 : new 연산자에 의해 메모리에 생성시점에 호출
	
	public _38_Student() {
		System.out.println("기본생성자 호출");
	}
	
	
	//매개변수 생성자
	public _38_Student(int studentID,String studentName,int grade,String address){
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
		}
	
	
	
	//멤버메소드(setter,getter)
	//setter : (매개변수 -> 멤버변수)
	//int studentID = 1000;
	//SET = 값을 설정
	//
	public void setStudentID(int studentID) {
		this.studentID=studentID;
		
	}
	public int getStudentID() {
		return studentID;
		
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
		
	}
	public String getStudentName() {
		return studentName;
		
	}
	public void setGrade(int grade) {
		this.grade = grade;
		
	}
	public int getGrade() {
		return grade;
		
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	public String getAdress() {
		return address;
		
	}
	//출력정보
	public void printInfo() {
		System.out.println("studentID :" + getStudentID());
		System.out.println("studentName :" + getStudentName());
		System.out.println("grade :" + getGrade());
		System.out.println("address :" + getAdress());
		
	}
	

}
