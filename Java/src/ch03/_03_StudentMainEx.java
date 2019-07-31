package ch03;

public class _03_StudentMainEx {
	public static void main(String[] args) {
		
	
	
	// 객체생성
		_03_Student stu = new _03_Student();
		
		
		// 방법1. set메소드를 통해서 학생정보 설정
		//stu.studentID = 1000;
		stu.setStudentID(1916);
		System.out.println(stu.getStudentID());//중간에 확인하는 방법
		stu.setStudentName("이재동");
		stu.setGrade(1);
		stu.setAddress("경기도 안산시");
		
		
	// 방법2. 매개변수 생성자를 통해서 학생정보 설정
		_03_Student st2 = new _03_Student(2000,"리재순",3,"평안북도 신의주");
		System.out.println("매개변수 생성자 이용한 출력");
		st2. printInfo();
	

	// 출력메소드 호출
	System.out.println("sette 메소드를 이용한 출력");
	stu.printInfo();

}
}