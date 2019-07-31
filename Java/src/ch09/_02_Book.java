package ch09;

public class _02_Book { // extends Object 가 생략
	
	// 멤버변수
	private int bookNumber;
	private String bookTitle;
	
	//생성자
	public _02_Book() {}
	
	public _02_Book(int bookNumber,  String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() { // Object 클래스의 toString() 메소드를 재정의
		return bookTitle + "," + bookNumber;
	}


}
