package 복습;

public class _53_Vipcustomer extends _53_Customer{
	// 멤버변수(부모6개 + 나2개) 총 8개의 멤버변수가 있음
	private int agentID; // 직원아이디
	private double saleRatio; // 할인율
	
	public _53_Vipcustomer() {//디폴트 생성자를 하면 초기화 됌 예)
								//엄마생성자에서 값을 매기면 값이 정해져있는데
								//디폴트생성자로 엄마 클래스에서 아들클래스로 넘어오면 값이
								//0으로 초기화가 됌 그래서 내가 다시 값을 매길수 있음
		
		// super(); // 컴파일러가 자동으로 _53_VipCustomer()의 첫줄에 super()를 추가함.
		// super()를 호출하면 상위클래스의 디폴트 생성자가 호출된다.
		
		//방법1. super.멤버변수호출 .. private이면 접근 불가
		//super.customerGrade = "VIP"; //엄마꺼여서 super.멤버변수 super를 써야함 엄마꺼 쓸라면
		//super.bonusRatio = 0.05; // 보너스 적립
		// 방법 2. super(매개변수1, 매개변수2) {} 엄마클래스에서 매개변수생성자를 만들어줘야함 이렇게 쓸라면 *알아두자 쌉재동*
		super("VIP",0.05);
		this.saleRatio = 0.1; //할인율
		this.agentID = 10011;
		
		System.out.println("VipCustomer() 생성자호출");
		//생성자는 new를 만나서 초기화해라(힘메모리에 저장)
		}
		public int calcPrice(int price) {
			super.price = price - (int)(price*saleRatio);
				return this.price;
			
		}
		@Override// 엄마클래스에서 가져온내용을 같이쓰고 아들 클래스에서 내용추가하기 위해 오버라이드를 사용한다.
		public void showCustomerInfo() {
			System.out.println("고객아이디 :" + customerID);
			System.out.println("고객 이름 :" + customerName);
			System.out.println("고객 등급 :" + customerGrade);
			System.out.println("직원 ID :" + agentID);
			System.out.println("VIP할인율 :" + saleRatio);
			System.out.println("보너스 포인트 :" + bonusRatio);
			System.out.println("할인가격 : " + price);
		
	}

}
