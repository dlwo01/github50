package _ch10;

public class _06_Student {
	//멤버변수
	private String studentID;//학번
	private String studetnName; //이름
	private String email; //이메일
	
	//기본생성자
	public _06_Student() {}
	//매개변수생성자
	public _06_Student(String studentID,String studetnName,String email) {
		this.studentID = studentID;
		this.studetnName = studetnName;
		this.email = email;
		
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudetnName(String studetnName) {
		this.studetnName = studetnName;
	}
	public String getStudetnName() {
		return studetnName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public String toString() {
		return "학번은 :" + studentID + "이름 :" + studetnName + "이메일 :" + email;
	}
	

}
