package ch04;

public class _01_StudentMainEx {
	public static void main(String[] args) {
		/*
		 * 객체 생성 : 클래스명(주소값의대상) => 참조변수명(주소값) = new 클래스명=(생성자)();
		 * 		접근 : 참조변수명,멤버변수;
		 * 			 참조변수명.멤버메소드;
		 * 
		 * 참조변수명에는 생성한 객체의 메모리공간 주소값이 들어있다.
		 * 앞에 클래스명은 데이터타입이고, 참조변수로 접근할 때 사용한다.
		 * 뒤의 클래스명은 메모리에 객체생성시 사용되는 생성자이다.
		 */
		// 객체 생성 : 클래스명 참조변수명 = new 클래스명();
		_01_Student st = new _01_Student();
		st.studentID = 1001;
		st.studentName = "이재동";
		st.grade = 2;
		st.address = "경기도 안산시 단원구 초지동";
		st.email = "dlwoehd01@naver.com";
		st.score = 100;
		st.showStudentInfo( );
		
		System.out.println();
		
		_01_Student st2 = new _01_Student();
		st2.studentID = 1004;
		st2.studentName = "KSY";
		st2.grade = 2;
		st2.address = "경기도 안산시 단원구 선부동";
		st2.score = 0;
		st2.email = "adfad";
		st2.showStudentInfo( );

		
	}
	
		 
	}


