package 복습;

public class _41_StaticEx {
	public static void main(String[] args) {
		//1001,이지원
		_41_Student lee = new _41_Student();
		lee.setStudentID(1001);
		lee.setStudnetNAME("이지원");
		
		System.out.println("학번 :" + lee.getStudentID());
		System.out.println("이름 :" + lee.getStudentName());
		//클래스명.static변수
		System.out.println("serialNum :" + _41_Student.serialNum);//1000
		System.out.println("serialNum :" + lee.serialNum);
		_41_Student.serialNum++;//1001
		System.out.println();
		
		
		//1002,손수경
		
		_41_Student son = new _41_Student();
		
		son.setStudentID(1002);
		son.setStudnetNAME("손수경");
		
		System.out.println("학번 : " + son.getStudentID());
		System.out.println("이름 : " + son.getStudentName());
		System.out.println("serialNum :" + _41_Student.serialNum);
		System.out.println("serialNum :" + son.serialNum);
		System.out.println("serialNum :" + lee.serialNum);
		
		
	}

}
/*
학번 :1001
이름 :이지원
serialNum :1000
serialNum :1000

학번 : 1002
이름 : 손수경
serialNum :1001
serialNum :1001
serialNum :1001
*/