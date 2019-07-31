package test;

public interface _LendableImpl {
	 int STATE_BORRDWED = 1;
	 int STATE_NORMAL = 0;
	
	
	void checkOut(String borrower,String checkOutDate);
	void checkIn();
	

}
