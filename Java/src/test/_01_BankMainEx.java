package test;

public class _01_BankMainEx {
	public static void main(String[] args) {

		_01_Bank ban = new _01_Bank();
		ban.setBankName("기업은행");
		ban.setAccountNumber("01020061916");
		ban.setName("이재동");
		ban.setAssets(10000);
		ban.setDeposit(5000);
		ban.setWithdrow(8000);
		ban.setBalance(7000);
		ban.printBankInfo();
		System.out.println();
		System.out.println("---------------");
		System.out.println();


		_01_Bank ban2 = new _01_Bank("기업은행",
					    "01020061916",
					    "이재동",
					     10000,
					     5000,
					     8000,
					     7000);
		ban2.printBankInfo();
		System.out.println("---------------");

	}
}


