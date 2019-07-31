package ch10;

import java.util.*;

public class _06_StudentArrayList {
	private List<_06_Student> list;
	//기본생성자
	
	public _06_StudentArrayList() {
		list = new ArrayList<_06_Student>();
		
	}
	//ArrayList에 회원을 추가
	public void addStudent(_06_Student student) {
		list.add(student);
	}
	// ArrayList의 학생을 삭제
	public boolean dleteStudent(String StudentID) {
		for(int i =0; i < list.size(); i++) {
			_06_Student student = list.get(i); // 순차적으로 학생정보 가져오겠다.
			String tempid = student.getStudentID(); //equals로 줘도 삭제가 된다.
			if(tempid == StudentID) {
				list.remove(i);
				return true;
			}
		}
		System.out.println(StudentID+"가 존재하지 않습니다.");
		return false;
	}
	// 모든 학생 정보 출력
	public void showStudentInfo() {
		for(_06_Student stud : list) {
			System.out.println(stud);
			
		}
		System.out.println(); 
	
	}
	
}
