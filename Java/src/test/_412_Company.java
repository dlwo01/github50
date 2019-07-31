package test;

public class _412_Company {
	private int companyId;
	private String companyName;
	
	public _412_Company () {}
	public _412_Company (int companyId , String companyName) {
		this.companyId = companyId;
		this.companyName = companyName;

	}

	public void setCompanyId(int companyId){
		this.companyId = companyId;
	}
	public  int getCompanyId() {
		return companyId;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return companyName;
	}

	public String toString() {
		return companyName+ "의 아이디는 " + companyId + "입니다.";
	}
}
