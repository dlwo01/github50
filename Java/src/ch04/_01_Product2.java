package ch04;
		//클래스는 설계도(디자인)이며 
		// 객체는 이 설계도를 바탕으로 만들어진 힙메모리(일부에) 공간
		// 참조변수: 주소값
		//참조변수안에 멤버변수,멤버메서드가 있다.
public class _01_Product2 {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인, 틀, 청사진
	 * 			-멤버변수(속성,필드)+멤버메소드(기능,동작)+생성자
	 * 클래스는 설계도(디자인)이며, 객체는 이 설계도를 바탕으로 만들어진 힙메모리(일부) 공간이다.
	 * 그 결과 주소값이 만들어지며, 참조변수에 할당된다.
	 */
	// 멤버변수 => 속성
	private String product;
	private String smartphone;
	private String iphone;
	private String price;
	private String apple;
	

	
	
	// 생성자 - 클래스명과 동일, 리턴타입이 없다.
	
	public _01_Product2() {
		System.out.println("기본생성자 출력");
	}
	
	//멤버메서드 => 기능
	public _01_Product2(String product,String smartphone,String iphone,String price,String apple) {
		System.out.println("매개생성자 출력");
		this.product = product;
		this.smartphone = smartphone;
		this.iphone = iphone;
		this.price = price;
		this.apple = apple;
		
		}
	
	public void setProduce(String product) {
		this.product = product;
		
	}
	public String getProduct() {
		return product;
		
	}
	public void setSmartphone(String smartphone) {
		this.smartphone = smartphone;
		
	}
	public String getSmartphone() {
		return smartphone;
	}
	public void setIphone(String iphone) {
		this.iphone = iphone;
		
	}
	public String getIphone() {
		return iphone;
		
	}
	public void setPrice(String price) {
		this.price = price;
		
	}
	public String getPrice() {
		return price;
		
	}
	public void setApple(String apple) {
		this.apple = apple;
		
	}
	public String getApple() {
		return apple;
		
	}
	
	public void printIfo() {
		System.out.println("product :" + getProduct());
		System.out.println("smartphone :" + getSmartphone());
		System.out.println("iphone :" + getIphone());
		System.out.println("price :" + getPrice());
		System.out.println("apple :" + getApple());
	}
	
}
