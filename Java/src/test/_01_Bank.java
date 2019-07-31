package test;

public class _01_Bank {
	private String bankName;//은행명
	private String accountNumber;//계좌번호
	private String name;//이름
	private int assets;//자산
	private int deposit;//입금
	private int withdrow;//출금
	private int balance;//잔고

	public _01_Bank() {
		System.out.println("기본 생성자출력");
	}

	public _01_Bank(String bankName,
	        String accountNumber,
	        String name,
	        int assets,
	        int deposit,
 	        int withdrow,
	        int balance) {
		System.out.println("매개변수 생성자 출력");
		this.bankName = bankName; // 은행명
		this.accountNumber = accountNumber; // 계좌번호
		this.name = name; // 이름
		this.assets = assets; // 자산
		this.deposit = deposit; // 입금
		this.withdrow = withdrow; // 출금
		this.balance = balance; // 잔고
	}
	



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAssets(int assets) {
		this.assets = assets;
	}	
	public int getAssets() {
		return assets;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setWithdrow(int withdrow) {
		this.withdrow = withdrow;
	}
	public int getWithdrow() {
		return withdrow;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;

}
	public void printBankInfo(){
	System.out.println("bankName :" + getBankName());
	System.out.println("accountNumber :" + getAccountNumber());
	System.out.println("name :"  + getName());
	System.out.println("assets :"  + getAssets());
	System.out.println("deposit :"  + getDeposit());
	System.out.println("withdrow :"  + getWithdrow());
	System.out.println("balance :"  + getBalance());
	}
	
}	
//invalid check
//이자계산
//잔고계산



