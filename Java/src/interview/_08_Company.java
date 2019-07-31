package interview;

public class _08_Company {
	private String companyName;
	private String address;
	private String faxNo;
	private String tleNo;
	
	/*
	 * 싱글톤 패턴(괜찮은회사 면접에 나온답니다) 
	 * - 인스턴스를 단 하나만 생성하는 디자인 패턴
	 * - static를 응용하여 프로그램 전반에서 사용하는 인스턴스를 하나만 구현하는 방식
	 * - 하나의 클래스내 여러 메소드가 있을때, 각각의 메소드에 접근할 때마다 객체를 생성할 필요없이
	 * 	  한번만 객체생성한 후, 이후부터는 getInstance()를 통해 주소값만 리턴받아 접근한다.
	 */
	
	// 2단계 : 클래스 내부에 static으로 유일한 인스턴트를 생성하기
				//static 메모리에 올려라
	// static이므로 프로그램이 실행되면서 데이터영역에 자동으로 올라간다.
	private static _08_Company company = new _08_Company();
	
	
	
	//디폴트 생성자
	//1단계 : 생성자를 private로 만들기
	// 객체생성을 한번만 하도록 하기 위함, 즉 static으로 객체생성을 할 때만 
	//디폴트 생성자를 호출하도록 하기 위해서 디폴트생성자를 private으로 함 
	private _08_Company() {
		System.out.println("디폴트 생성자 호출");
	}

	
	//3단계 : 외부에서 참조할 수 있는 public 메소드 만들기
	
	public static _08_Company getInstance(){
		System.out.println("getInstance() 호출");
		
		if(company == null) {
			company = new _08_Company();
		}
		return company;
		
	}
	
	/*public int add(int i, int j) {
		return i+j;
	*/	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
		
	}
	public String getFaxNo() {
		return faxNo;
		
	}
	public void setTelNo(String telNo) {
		this.tleNo = tleNo;
		
	}
	public String getTelNo() {
		return tleNo;
		
	}
}
