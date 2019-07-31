package ch04;

public class _03_BankMainEx {
	public static void main(String[] args) {
		
		// 인스턴스 생성
		_03_Bank ban = new _03_Bank();
		/*ban.setBankName("기업은행");
		ban.setAccountNumber("01020061916");
		ban.setDeposit(10000);
		ban.setWihtdraw(2000);
		*/
		ban.printInfo();
		
		
		System.out.println("---------------");
		
		//매개변수 생성자 호출
		
		_03_Bank ban2 = new _03_Bank("기업은행",
									"01020061916",
									10000,
									3000);
		ban2.printInfo();
		
	}

}
