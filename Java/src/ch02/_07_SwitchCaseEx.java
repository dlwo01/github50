package ch02;

public class _07_SwitchCaseEx {
	public static void main(String[] args) {
		/* num이 1이면 "하나"
		 * 		2이면 "둘"
		 * 		3이면 "셋"
		 * 			"많음"
		 */
		int num = 0;
		String jj = "";
		
		switch(num) {
			case 1 : jj ="하나";
				break;
			case 2 : jj ="둘";
				break;
			case 3 : jj ="셋";
				break;
			default :
					jj ="많음";
			}
		System.out.println(num +"이면" + jj + "이다" );
		
	}
}	 
