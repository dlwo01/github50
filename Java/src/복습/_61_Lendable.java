package 복습;

public interface _61_Lendable {
	
	//상수
	int STATE_BORROWED = 1; //대출중
	int STATE_NORMAL = 0; // 비대출(반납)
	
	//추상메소드
	
	void checkOut(String borrower, String checkOutDate); //대출하다
	void checkIn(); // 반납하다

}
