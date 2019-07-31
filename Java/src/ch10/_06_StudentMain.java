package ch10;

public class _06_StudentMain {
	public static void main(String[] args) {
		_06_StudentArrayList stu = new _06_StudentArrayList();
		
		_06_Student a = new _06_Student("1001" , "둘리" , "a@naver.com");
		_06_Student b = new _06_Student("1002" , "또치" , "b@naver.com");
		_06_Student c = new _06_Student("1003" , "짱구" , "c@naver.com");
		_06_Student d = new _06_Student("1004" , "코난" , "d@naver.com");
		//ArrayList에 학생을 추가
		stu.addStudent(a);
		stu.addStudent(b);
		stu.addStudent(c);
		stu.addStudent(d);
		//모든 학생 정보 출력
		stu.showStudentInfo();
		
		//학생정보 삭제
		stu.dleteStudent("1004");
		// 삭제 후 학생 정보 출력
		stu.showStudentInfo();
	}

}
