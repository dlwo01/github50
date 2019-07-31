package ch09;

public class _04_Student {
	
	int studentID;
	String studentName;
	
	public _04_Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		}
	
	public String toString() {
		return studentID + "," + studentName;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _04_Student) {
			_04_Student std = (_04_Student)obj;
			if(this.studentID == std.studentID)
				return true;
			else return false;
			}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentID;
	}

}
