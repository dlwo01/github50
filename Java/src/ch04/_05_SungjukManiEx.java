package ch04;

import java.util.Scanner;

public class _05_SungjukManiEx {
	public static void main(String[] args) {
		
		
		
	Scanner sca = new Scanner(System.in);
	System.out.println("점수입력");
	
	_05_Sungjuk sun = new _05_Sungjuk();
	
	sun.setKor(sca.nextInt());
	sun.setEng(sca.nextInt());
	sun.setMath(sca.nextInt());
	
	
	sun.printInfo();
	
	
	System.out.println("매개변수생성자 점수");
	_05_Sungjuk sun2 = new _05_Sungjuk(sca.nextInt(), sca.nextInt(), sca.nextInt());
	
	sun2.printInfo();
	}
}
/*
 * 점수입력
21
21
32
국어점수는21입니다
영어점수는21입니다
수학점수는32입니다
총점은74입니다
평균은 24.67 입니다 

학점은F입니다
매개변수생성자 점수
12
12
31
국어점수는12입니다
영어점수는12입니다
수학점수는31입니다
총점은55입니다
평균은 18.33 입니다 

학점은F입니다
*/
