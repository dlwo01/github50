package test;

public class _Maindd {
	public static void main(String[] arsg) {
		_AppCdInfo app = new _AppCdInfo("112","개미");
	
		System.out.println();	app.checkOut("이재동", "12");
		System.out.println();
		app.checkOut("이재동", "123");
		app.checkIn();
		
	}

}
