package ch08;

public interface _05_Lendable {
	
	
	//상수
	int STATE_BORROWED = 1; // 대출중
	int STATE_NORMAL = 0; // 비대출(반납)
	
	
	//추상메소드
	public void checkOut(String borrower, String checkOutDate); // 대출하다
	public void checkIn(); // 반납하다

}
