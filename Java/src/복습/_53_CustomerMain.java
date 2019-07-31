package 복습;

public class _53_CustomerMain {
	public static void main(String[] args) {
		//일반 고객
		
		_53_Customer cus = new _53_Customer();
		cus.setCustomerID(1234);
		cus.setCustomerName("이경재");
		cus.setBonusPoint(1000);
		cus.calcPrice(10000);
		cus.showCustomerInfo();
		
		System.out.println();
		
		/*new_53_VipCustomer();에 의해
		 * Customer() 생성자호출
		 * VipCustomer() 생성자호출
		 * ==> 컴파일러가 자동으로 _53_VipCustomer()의 첫줄에 super()를 추가함.
		 * 		super()를 호출하면 상위클래스의 디폴트 생성자가 호출된다.
		 * 		p243
		 * ==> 상위 클래스를 상속받은 하위 클래스가 생성될 때는 반드시 상위클래스의 생성자가 먼저 호출된다.
		 * 		상위 클래스 생성자가 호출될 때 상위 클래스의 멤버변수가 메모리에 생성된다.
		 */
		_53_Vipcustomer vip = new _53_Vipcustomer();
		vip.setCustomerID(1234);
		vip.setCustomerName("이재동");
		vip.calcPrice(100000);
		vip.showCustomerInfo();
	}

}

/*
 Customer() 생성자 호출
고객아이디 :1234
고객 이름 :이경재
고객 등급 :Silver
보너스포인트 :1000
적립비율 :0.01
할인가격 :9900

Customer() 매개변수생성자 호출
VipCustomer() 생성자호출
고객아이디 :1234
고객 이름 :이재동
고객 등급 :VIP
직원 ID :10011
VIP할인율 :0.1
보너스 포인트 :0.05
할인가격 : 90000
*/
