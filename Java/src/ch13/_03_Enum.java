package ch13;

enum Animal{CAT, DOG, FISH}

public class _03_Enum {
	/*
	 * enum : 열거형
	 * 1. 정의 : 여러개의 상수들을 모아서 만든 객체를 의미한다.
	 * 2. 작성방법 : enum 열거형명{상수1,상수2,상수3...}
	 * 3. 용도 : 제한된 상수값을 사용하고자 할 때
	 * 4. 접근방법 : 열거형명.상수
	 * 5. 특징 : switch(변수)에서 변수타입으로 enum을 사용할 수 있다.
	 * 			ordinal() 메소드를 이용해서 순서값을 얻어올 수 있다.
	 * 			ordinal()은 0부터 시작한다.
	 */
	// 멤버변수
	private Animal kind;
	private String name;
	
	// 기본생성자
	public _03_Enum() {}
	
	// 매개변수 생성자
	public _03_Enum(Animal kind,String name) {
		this.kind = kind;
		this.name = name;
		
	}
	
	//setter,getter
	public void setKind(Animal kind) {
		this.kind = kind;
	}
	public Animal getKind() {
		return kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "종류 :" + kind + "이름 :" + name; 
	}
	

}
