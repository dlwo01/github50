package ch11;

import _ch11._07_IDFormatException;

public class _07_IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws _07_IDFormatException {
		if(userID == null) {
			throw new _07_IDFormatException("아이디는 null일 수 없습니다.");
			
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new _07_IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}
	public static void main(String[] args) { // throws 선언시 자바가상머신에게 떠넘긴다. 비정상종료
		_07_IDFormatTest test = new _07_IDFormatTest();
		
		String userID = null;
		
		try {
			test.setUserID(userID); // 예외가 발생할 수 있는 코드부분
		} catch (_07_IDFormatException e) {// 예외처리
			//e.printStackTrace();
			System.out.println(e.getMessage());// getMessage때문에 아이디는 null일 수 없습니다.출력
		}finally {
			
		}
		System.out.println("정상종료");
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (_07_IDFormatException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			
		}
	}

}
