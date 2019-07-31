package ch04;

public class _06_StaticEx {
	public static void main(String[] args) {
		//1001,이지원
		_06_Student lee = new _06_Student();
		lee.setStudentID(1001);
		lee.setStudentNAME("이지원");
		
		System.out.println("학번 :" + lee.getStudentID());
		System.out.println("이름 :" + lee.getStudentName());
		//클래스명.static 변수
		System.out.println("serialNum :" + _06_Student.serialNum); // 1000
		System.out.println("serialNum :" + lee.serialNum);
		_06_Student.serialNum++; // 1001
		System.out.println();
		//1002,손수경
		
		_06_Student son = new _06_Student();
		
		son.setStudentID(1002);
		son.setStudentNAME("손수경");
		
		System.out.println("학번 : " + son.getStudentID());
		System.out.println("이름 : " + son.getStudentName());
		System.out.println("serialNum :" + _06_Student.serialNum);
		System.out.println("serialNum :" + son.serialNum);
		System.out.println("serialNum :" + lee.serialNum);
		
		
		
	}

}
