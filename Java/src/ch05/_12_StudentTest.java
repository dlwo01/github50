package ch05;

public class _12_StudentTest {
	public static void main(String[] args) {
		_12_Student lee = new _12_Student(1001, "Lee");
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 50);
		
		_12_Student kim = new _12_Student(1002, "kim");
		kim.addSubject("국어", 70);
		kim.addSubject("수학", 85);
		kim.addSubject("영어", 100);
		
		
		lee.showStudentInfo();
		System.out.println("==============================");
		kim.showStudentInfo();
				
	}

}
/*
학생Lee의국어과목성적은100입니다.
학생Lee의수학과목성적은50입니다.
학생Lee의 총점은150입니다.
==============================
학생kim의국어과목성적은70입니다.
학생kim의수학과목성적은85입니다.
학생kim의영어과목성적은100입니다.
학생kim의 총점은255입니다.
*/