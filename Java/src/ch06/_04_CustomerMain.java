package ch06;

public class _04_CustomerMain {
	public static void main(String[] args) {
		//일반고객
		
		_04_Customer cus = new _04_Customer();
		cus.setCustomerID(4545);
		cus.setCustomerName("이경재");
		cus.bonusPoint = 1000;
		cus.calcPrice(10000);
		
		cus.showCustomerInfo();
		
		System.out.println();
		
		//Vip고객
		/*new_04_VipCustomer();에 의해
		 * Customer() 생성자호출
		 * VipCustomer() 생성자호출
		 * ==> 컴파일러가 자동으로 _04_VipCustomer()의 첫줄에 super()를 추가함.
		 * 		super()를 호출하면 상위클래스의 디폴트 생성자가 호출한다.
		 * 		P243
		 * ==> 상위 클래스를 상속받은 하위 클래스가 생성될 때는 반드시 상위클래스의 생성자가 먼저 호출된다.
		 * 	      상위 클래스 생성자가 호풀될 때 상위 클래스의 멤버변수가 메모리에 생성된다.
		 */
		System.out.println();
		
		_04_Vipcustomer vip = new _04_Vipcustomer();
		vip.setCustomerID(65456);
		vip.setCustomerName("이경재2");
		vip.calcPrice(20000);
		vip.showCustomerInfo();
		
		
		
	
	
	}
}
/*
Customer() 생성자 호출
VipCustomer() 생성자 호출
고객아이디 :65456
고객 이름 :이경재2
고객 등급 :VIP
직원 ID :10011
VIP할인율 :0.1
보너스 포인트 :0.05
할인가격 : 18000
*/