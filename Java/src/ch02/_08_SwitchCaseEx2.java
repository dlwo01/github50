package ch02;

public class _08_SwitchCaseEx2 {
	public static void main(String[] args) {
		/*
		 * num이 1이면 "하나"
		 * 		2,3,4이면 "두서넛"
		 * 		5,6이면"대여섯"
		 * 		그 이상 "많음"
		 * 
		 */
		
		int num = 5;
		String str ="";
		
		switch(num) {
			case 1 : str = "하나";
					break;
			case 2 : 
			case 3 :
			case 4 : 
				str = "두서넛";
					break;
			case 5 : 
			case 6 : 
				str = "대여섯";
					break;
			default :	
					str = "많음";
				}
		System.out.println(str);
		}

}
