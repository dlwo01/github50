package _ch10;

public class _06_StudentMain {
	public static void main(String[] args) {
		_06_StudentArrayList stu = new _06_StudentArrayList();
		//학생추가
		stu.addMember(new _06_Student("1001","둘리","a@naver.com"));
		stu.addMember(new _06_Student("1002","또치","b@naver.com"));
		stu.addMember(new _06_Student("1003","짱구","c@naver.com"));
		stu.addMember(new _06_Student("1004","코난","b@naver.com"));
		
		stu.showStudentInfo();
		
		//학생삭제
		System.out.println("삭제후");
		stu.deleteStudent("1004");
		stu.showStudentInfo();
		
		
	}

}
/*
학번은 :1001이름 :둘리이메일 :a@naver.com
학번은 :1002이름 :또치이메일 :b@naver.com
학번은 :1003이름 :짱구이메일 :c@naver.com
학번은 :1004이름 :코난이메일 :b@naver.com
삭제후
학번은 :1001이름 :둘리이메일 :a@naver.com
학번은 :1002이름 :또치이메일 :b@naver.com
학번은 :1003이름 :짱구이메일 :c@naver.com
*/