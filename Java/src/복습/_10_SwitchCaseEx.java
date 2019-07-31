package 복습;

import java.util.Scanner;

public class _10_SwitchCaseEx {
	public static void main(String[] args) {
		
		
		
		
		  /* 1. 점수는 score 변수, 학점은 grade
				 * 2. 점수가 90점 이상이면 A
				 *    점수가 80점 이상이면 B
				 *    점수가 70점 이상이면 C
				 *    점수가 60점 이상이면 D
				 *    점수가 60점 미만이면 F
				 *    결과==> 점수는 :, 학점은 :
				 */
		int score = 0;
		char grade = ' ';
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수입력(0~100점 : ");
		score=input.nextInt();
		
		
		if((score > 100) || (score < 0)) {
			System.out.println("잘못된 점수입니다.");
		}else {
			switch(score/10) {
			case 10 :
			case 9 : 
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			case 6 : 
				grade = 'D';
				break;
			default	:
				grade = 'F';
			System.out.println("점수는" + score + ",학점은" + grade);
			}
		}
		
	}

}
