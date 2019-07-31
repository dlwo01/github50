package test;

public class _CDInfo {
	private String registerNo; // 관리번호
	private String title; // 타이틀
	
	public _CDInfo() {}
	public _CDInfo(String registerNo, String title) {
		this.registerNo = registerNo;
		this.title = title;
		
	}
	
	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}
	public String getRegisterNo() {
		return registerNo;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	}


