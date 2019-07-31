package ch04;

import interview._08_Company;

public class _08_SingleTonEx {
	public static void main(String[] args) {
		_08_Company company1 = _08_Company.getInstance();
		_08_Company company2 = _08_Company.getInstance();
		System.out.println(company1==company2);
		
		
	}

}
/*디폴트 생성자 호출.. static이므로 자동을 올라가 있음
getInstance() 호출
*/