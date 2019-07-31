package phonebook;

public class PhoneInfo {
	
	private String telNo;
	private String name;
	private String birth;
	
	public PhoneInfo(String name,String telNo,String birth) {
		this.telNo = telNo;
		this.name = name;
		this.birth = birth;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public void showphoneInfo() {
		System.out.println("이름 :" + name + "전화번호 :" + telNo + "생일 :" + birth);
	}
}
