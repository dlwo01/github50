package 복습;

public class _41_Student {
	/*
	 * static변수 : 프로그램이 실행되어 메모리에 올라갔을 때 딱 한번 데이터영역 메모리 공간에 할당된다.
	 * 	 		    그 값은 모든 인스턴스가 공유한다.
	 * 			    따라서 모든 인스턴스가 동일한 static 변수를 가리킨다.
	 * 			   한마디로 금수저
	 */
	public static int serialNum = 1000;
	public int studentID; //학번
	public String studentName; //이름
	
	//기본생성자
	public _41_Student( ) {}
	
	
	//학번
	public void setStudentID(int studentID) {
		this.studentID = studentID;
		
	}
	public int getStudentID() {
		return studentID;
		
	}
	
	//이름
	public void setStudnetNAME(String studentName ) {
		this.studentName = studentName;
		
	}
	public String getStudentName() {
		return studentName;
		
	}
}
