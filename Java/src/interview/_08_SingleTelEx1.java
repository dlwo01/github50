package interview;

public class _08_SingleTelEx1 {
	public static void main(String[] args) {
		//_08_Company com = new _08_Company(); 이렇게하면 오류남
		_08_Company com = _08_Company.getInstance();
		
		com.setCompanyName("삼성");
		System.out.println("회사명은 :" + com.getCompanyName());
		
			
		
		
		
	}

}

/*디폴트 생성자 호출
getInstance() 호출
회사명은 :삼성
*/