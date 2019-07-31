package 복습;

import java.util.Scanner;

public class ㅇㄹ {
	public static void main(String[] args) {
		
		int score =0;
		char grade = ' ';
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하시오: ");
		score=input.nextInt();
		
		if((score>100)||(score<0)) {
			System.out.println("병신같은너");
		}else {
		switch(score/10) {
		case 10 : 
		case 9 : grade=('수');
				break;
		case 8 :
		case 7 : grade=('우');
				break;
		case 6 : grade=('미');
				break;
		default : grade=('가');
		}
		System.out.println(grade);
		
	}
	}
}