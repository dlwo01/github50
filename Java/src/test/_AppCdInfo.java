package test;

public class _AppCdInfo extends _CDInfo implements _LendableImpl{
	
	

	private String borrower; // 대출인
	private String checkOutDate; // 대출일
	private int state; // 상태코드
	
	public _AppCdInfo() {}
	public _AppCdInfo(String registerNo, String title) {
		super(registerNo, title);
		
		}
	
	public String getBorrower() {
		return borrower;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	
	@Override
	public void checkOut(String borrower, String checkOutDate) {
		if(state == STATE_BORRDWED) {
			System.out.println("이미 대출중입니다");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = STATE_BORRDWED;
		System.out.println("대출상태 : 대출중");
		System.out.println("책 제목 : " + super.getTitle());
		System.out.println("대출인 :" + getBorrower());
		System.out.println("대출일 :" + getCheckOutDate());
		
		
		
	}
	@Override
	public void checkIn() {

		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		System.out.println("대출상태 : 반납중");
		System.out.println("책 제목 :" + super.getTitle());
		
	}
	
}
