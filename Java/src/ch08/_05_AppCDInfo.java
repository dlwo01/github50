package ch08;

public class _05_AppCDInfo extends _05_CDInfo implements _05_Lendable {

	//멤버변수
	private String borrower; //대출인 
	private String checkOutDate; // 대출일
	private int state; //상태코드
	
	//생성자
	public _05_AppCDInfo() {}
	// 메인 매개변수생성자 값 -> 매개변수 -> 부모의 매개변수 생성자로 전달
	public _05_AppCDInfo(String rehisterNO, String title) {
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
	//대출하다
	public void checkOut(String borrower, String checkOutDate) {
		// 대출증이면 "이미 대출중입니다" 출력, 대출안되도록 한다.
		if(state == STATE_BORROWED) {
			System.out.println("이미 대출중입니다");
			return; // 작업종료.. 아래 문장을 안탄다.
		}
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = STATE_BORROWED; // 대출중 (상수값을넣는다)
		System.out.println("대출상태 : 대출중"  );
		System.out.println("책 제목 : " + super.getTitle() + "이 대출되었습니다.");
		System.out.println("대출인 : " + getBorrower());
		System.out.println("대출일 : " + getCheckOutDate());
		
	}

	@Override
	//반납하다
	public void checkIn() {
		// 대출증이면 "반납할 수 없습니다" 출력, 반납안되도록 한다.
		if(state == STATE_NORMAL) {
			System.out.println("반납 할 수 없습니다");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("대출상태 : 반납중"  );
		System.out.println("책 제목 : " + super.getTitle());
		
		
	}

}
