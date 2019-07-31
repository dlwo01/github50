package ch06;
// p234 부모클래스
public class _04_Customer {
	//멤버 변수 
	private int customerID; // 고객 아이디
	protected String customerName;// 고객 이름
	protected String customerGrade;// 고객 등급
	protected int bonusPoint;// 보너스 포인트
	protected double bonusRatio;// 적립 비율
	protected int price;
	/*
	 * super : - 하위클래스에서 상위클래스로 접근할 때 사용한다.
	 * 		   - 하위클래스는 상위클래스의 주소, 즉 참조값을 알고 있다.
	 * 		   - 상위클래서의 생성자를 호출 할 수 있다.
	 * this : 자기 자신의 참조값을 가지고 있다.
	 */
	
	//기본 생성자 출력 .. 초기화목적
	// 매개변수 생성자가 있으면 반드시 기본생성자를 추가해야 한다.
	// 자식 VipCustomer()에서 super()로 호출되기 때문이다.
	// 매개변수 생성자가 없으면 컴파일러가 자동으로 기본생성자를 추가해 준다.
	// super()는 묵시적으로 호출된다. (명시적이어도 상관은 없으나)
	// super()가 주석처리 되어있어도 기본생성자가 없고, 매개변수 생성자만 있으면 컴파일 에러..
	
	public _04_Customer() {
		this.customerGrade = "Sliver";
		this.bonusRatio = 0.01; //보너스포인트1%다
		System.out.println("Customer() 생성자 호출" );
		
	}
	
	public _04_Customer(String customerGrade, double bonusRatio) {
		this.customerGrade = customerGrade;
		this.bonusRatio = bonusRatio;
		System.out.println("Customer() 매개변수생성자 호출");
	}
	
	
	// int customerID = 10010; 대입이됌
	//매개변수 -> 멤버변수
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
		
	}
	//getter,setter
	// 고객아이디... 멤버변수를 돌려준다
	public int getCustomerID() {
		return customerID;
		
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		
	}
	public String getCustomerName() {
		return customerName;
		
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
		
	}
	public String getCustomerGrade() {
		return customerGrade;
		
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	public int getPrice() {
		return price;
		
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
		
	}
	public int getBonusPoint() {
		return bonusPoint;
		
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
		
	}
	public double getBonusRatio() {
		return bonusRatio;
		
	}
	public int calcPrice(int price) {
		this.price = price - (int)(price*bonusRatio);
			return this.price;
	}
	//출력문
	public void showCustomerInfo() {
		System.out.println("고객아이디 :" + customerID);
		System.out.println("고객 이름 :" + customerName);
		System.out.println("고객 등급 :" + customerGrade);
		System.out.println("보너스포인트 :" + bonusPoint);
		System.out.println("적립비율 :" + bonusRatio);
		System.out.println("할인가격 :" + price);
		
	}
	

	

}
	


