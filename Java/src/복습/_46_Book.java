package 복습;

public class _46_Book {
	// 멤버변수 -> getter
	private String bookName; // 책이름
	private String author; // 저자
	
	//디폴트 생성자
	public _46_Book() {}
	
	//매개변수 생성자(값전달 : 생성자 -> 매개변수 -> 멤버변수)
	
	public _46_Book(String bookName,String author) {
		
		this.bookName = bookName;
		this.author = author;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
		
	}
	public String getBookName() {
		return bookName;
		
	}
	public void setAuthor(String author) {
		this.author = author;
		
	}
	public String getAuthor() {
		return author;
		
	}
	public void showBookInfo() {
		System.out.println("책 제목 :" + getBookName() + " 저자 :" + getAuthor());
	}

}
