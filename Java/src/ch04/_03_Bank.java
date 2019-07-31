package ch04;

public class _03_Bank {
	// 멤버변수
	private String bankName; // 은행명
	private String accountNumber; // 계좌번호
	private int deposit; // 입금
	private int withdraw; // 출굼
	// 생성자=> 멤버변수 초기화 용도
	//디폴트(기본)생성자는 컴파일러가 자동 생성해주므로 생략해도 된다.
	// 단 프로그래머가 생성자를 직접 추가하면 디폴트(기본) 생성자는 만들어지지 않는다. 따라서 프로그래머가 직접 추가해야 한다.
	public  _03_Bank() {
		System.out.println("디폴트 생성자 호출");
		
		bankName = "우리은행";// 같은 클래스 안에서 이렇게 값을 주입 할 수 있음.
		accountNumber = "2132";
		deposit = 1000;
		withdraw = 200;
	}
	
	
	//매개변수 생성자
	public _03_Bank(String bankName,
					String accountNumber,
					int deposit,
					int withdraw) {
		System.out.println("매개 변수 생성자 호출");
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	
	//멤버메소드
	//매개변수 -> 멤버변수로 전환
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
	
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getDeposit() {
		return deposit;
	}
	
	public void setWihtdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	public int getWithdraw() {
		return withdraw;
	}
	
	//출력정보
	
	public void printInfo() {
		System.out.println("은행명 :" + getBankName());
		System.out.println("계좌번호 :" +getAccountNumber());
		System.out.println("입금액 :" + getDeposit());
		System.out.println("출금액  :" + getWithdraw());
		
	}
	
}
