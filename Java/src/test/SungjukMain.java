package test;

import java.util.Scanner;

public class SungjukMain {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		Sungjuk sun = new Sungjuk();
		
		System.out.println("java점수");
		sun.setJava(sca.nextInt());
		System.out.println("jsp점수");
		sun.setJsp(sca.nextInt());
		System.out.println("spring점수");
		sun.setSpring(sca.nextInt());
	
		sun.printSungjukInfo();

		System.out.println();
		
		
		Sungjuk sun2 = new Sungjuk(sca.nextInt(),sca.nextInt(),sca.nextInt());


		sun2.printSungjukInfo();

		}
}

/*
java점수
12
jsp점수
53
spring점수
12
java : 12입니다.
jsp : 53입니다.
spring : 12입니다.
총점은 : 77입니다.
평균은 25.7입니다 
학점은 : F입니다.

java점수
jsp점수
spring점수
32
*/

