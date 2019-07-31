package test;

public class _415_Bank {
	int bankNO; //은행번호
	String bankName; //은행명
	int accountNO; //계좌번호
//기본생성자
	public _415_Bank() {}
//매개변수생성자
	public _415_Bank(int bankNO,String bankName,	 int accountNO) {
		this.bankNO = bankNO;
		this.bankName = bankName;
		this.accountNO = accountNO;
	}
	
//set,get
	public void setBankNO(int bankNO) {
		this.bankNO = bankNO;
	}
	public int getBankNO() {
		return bankNO;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setAccountNO(int accountNO){
		this.accountNO = accountNO;
	}
	public int getAccountNO() {
		return accountNO;
	}
// toString

	public String toString() {
		return "은행명" + bankName + "은행변호" + bankNO + "계좌번호:" + accountNO;
	
	}
}