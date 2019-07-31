package ch08;

public class _05_Main {
	public static void main(String[] args) {
		//다형성 적용
	
	_05_AppCDInfo app = new _05_AppCDInfo("CD001","태백산맥");
	
	app.checkOut("손흥민골", "20190410");// 대출
	System.out.println("===============");
	app.checkOut("손흥민골2", "20190410");
	System.out.println("===============");
	app.checkIn();
	System.out.println("===============");
	app.checkIn();
	}

}
