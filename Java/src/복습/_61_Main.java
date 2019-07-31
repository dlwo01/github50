package 복습;

public class _61_Main {
	public static void main(String[] args) {
		// 다형성
		_61_AppCDInfo app = new _61_AppCDInfo("CD001","태백산맥");
		
		app.checkOut("손흥민골", "20190410");
		System.out.println("=============");
		app.checkOut("손흥민", "20190410");
		System.out.println("=============");
		app.checkIn();
		System.out.println("=============");
		app.checkIn();
		
	}

}
/*
대출상태 : 대출중
책 제목 :태백산맥
대출인 :손흥민골
대출일 :20190410
=============
이미 대출중입니다.
=============
대출상태 : 반납중
책 제목 :태백산맥
=============
반납 할 수 없습니다.
*/