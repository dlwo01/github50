package 복습;

public class _39_StudentManiEx {
	public static void main(String[] args) {

		// 객체생성
		 _38_Student stu = new  _38_Student();
		 
		

		// 방법2. set메소드를 통해서 학생정보 설정
		 stu.setStudentID(1813);
		 stu.setStudentName("이재동");
		 stu.setGrade(1);
		 stu.setAddress("안산");
		 stu.printInfo();
		 
			
		
		 
		// 방법1. 매개변수 생성자를 통해서 학생정보 설정
		 
		
		 _38_Student stu2 = new _38_Student(10210,"리재순",9,"평양");
			 System.out.println("매개변수 생성자 호출");
			 
			 stu2.printInfo();
		 
	
		// 출력메소드 호출
		
			 
	}
	
}
