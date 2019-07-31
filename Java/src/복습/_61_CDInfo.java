package 복습;

public class _61_CDInfo {
	//멤버 변수
	private String registerNO; // 관리번호
	private String title; 		// 타이틀
	
	//기본생성자
	public _61_CDInfo() {}
	
	//매개변수 생성자
	public _61_CDInfo(String registerNO,String title) {
		this.registerNO = registerNO;
		this.title = title;
	}
	
	public void setRegisterNO(String registerNO) {
		this.registerNO = registerNO;
		
	}
	public String getTitle() {
		return title;
		
	}
	public void setTitle(String title) {
		this.title = title;
		
	}
	public String title() {
		return title;
		
	}

}
