package ch04;

import interview._08_Company;

public class _08_SingleTelEx3 {
	public static void main(String[] args) {
		
		_08_Company com = _08_Company.getInstance();
		com.setAddress("경기도 안산시");
		System.out.println("주소는 :" + com.getAddress());
		
	}

}
/*디폴트 생성자 호출
getInstance() 호출
주소는 :경기도 안산시
*/