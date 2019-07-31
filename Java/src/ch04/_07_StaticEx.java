package ch04;

public class _07_StaticEx {
	public static void main(String[] args) {
		//1001,이지원
		_07_Student lee = new _07_Student();
		lee.setStudentID(1001);
		lee.setStudentNAME("이지원");
		
		System.out.println("학번 :" + lee.getStudentID());
		System.out.println("이름 :" + lee.getStudentName());
		//클래스명.static 변수
		System.out.println("serialNum :" + _07_Student.serialNum); // 1000
		System.out.println("serialNum :" + lee.serialNum);
		_07_Student.serialNum++; // 1001
		System.out.println();
		
		
		//1002,손수경
		
		_07_Student son = new _07_Student();
		
		son.setStudentID(1002);
		son.setStudentNAME("손수경");
		
		System.out.println("학번 : " + son.getStudentID());
		System.out.println("이름 : " + son.getStudentName());
		System.out.println("serialNum :" + _06_Student.serialNum);
		System.out.println("serialNum :" + son.serialNum);
		System.out.println("serialNum :" + lee.serialNum);
		
		
		
	}

}
