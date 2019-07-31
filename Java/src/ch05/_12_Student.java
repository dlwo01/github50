package ch05;

import java.util.ArrayList;

public class _12_Student {
	
	int studentID;
	String studentName;
	ArrayList<_12_Subject> subjectList;
	
	public _12_Student(int studentID,String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<_12_Subject>();
		
	}
	
	public void addSubject(String name,int scorePoint) {
		_12_Subject subject = new _12_Subject();
			subject.setName(name);
			subject.setScorePoint(scorePoint);
			subjectList.add(subject);
			
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(_12_Subject sub : subjectList) {
		total += sub.getScorePoint();
		System.out.println("학생" + studentName + "의" + sub.getName() + "과목성적은" + sub.getScorePoint() + "입니다.");
			
		}
		System.out.println("학생" + studentName + "의 총점은" + total + "입니다.");
	}
	

}
