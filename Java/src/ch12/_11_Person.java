package ch12;

import java.io.Serializable;

public class _11_Person implements Serializable{
	/*
	 * - implements Serializable : 직렬화
	 * - transient : 해당 변수는 직렬화나 복원과정에서 제외
	 */
	
	// 멤버변수
	private String name;
	private String job;
	//private transient String job; // 실행시 job이 null로 출력됨
	//이름 :안재용직업 :null
	//이름 :김철수직업 :null

	
	//기본생성자
	public _11_Person() {}
	
	//매개변수 생성자
	public _11_Person (String name,String job) {
		this.name = name;
		this.job = job;
		
	}
	//toString
	public String toString() {
		return "이름 :" + name + "직업 :" + job; 
				
	}

}
