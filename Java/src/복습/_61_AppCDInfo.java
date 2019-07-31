package 복습;

public class _61_AppCDInfo extends _61_CDInfo implements _61_Lendable {
	
	//멤버변수
	private String borrower; // 대출인
	private String checkOutDate; //대출일
	private int state; // 상태코드
	
	//생성자
	public _61_AppCDInfo() {}
	
	public _61_AppCDInfo(String rehisterNO, String title) {
		// 메인 매개변수생성자 값 -> 매개변수 -> 부모의 매개변수 생성자로 전달
		super(rehisterNO,title);
	}
	
	
	//getter
	public String getBorrower() {
		return borrower;
		
	}
	public String getCheckOutDate() {
		return checkOutDate;
		
	}
	
	
	@Override
	// 대출하다
	public void checkOut(String borrower, String checkOutDate) {
		// 대출중이면 "이미 대출중입니다" 출력, 대출안되도록한다.
		if(state == STATE_BORROWED) {
			System.out.println("이미 대출중입니다.");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = STATE_BORROWED;
		System.out.println("대출상태 : 대출중");
		System.out.println("책 제목 :" + super.getTitle());
		System.out.println("대출인 :" + getBorrower());
		System.out.println("대출일 :" + getCheckOutDate());
		
	}

	@Override
	public void checkIn() {
		// 대출중이면 "반납할 수 없습니다" 출력, 반납안되도록 한다.
		if(state == STATE_NORMAL) {
			System.out.println("반납 할 수 없습니다.");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("대출상태 : 반납중");
		System.out.println("책 제목 :" + super.getTitle());
		
	}
	

}
