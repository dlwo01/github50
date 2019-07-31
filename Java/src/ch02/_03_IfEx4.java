package ch02;

import java.util.Scanner;

public class _03_IfEx4 {

public static void main(String[] args) {

        /*시험문제
         *  1. 점수는 score 변수, 학점은 grade
		 * 2. 점수가 90점 이상이면 A
		 *    점수가 80점 이상이면 B
		 *    점수가 70점 이상이면 C
		 *    점수가 60점 이상이면 D
		 *    점수가 60점 미만이면 F
		 *    결과==> 점수는 :, 학점은 :
		 */
	//시험문제 1.
	int score = 0;
	char grade = ' ';
	
	
	Scanner input = new Scanner(System.in);
	System.out.println("점수입력(0~100점) :");
	score=input.nextInt();
	
	
	
	if((score > 100) || (score < 0)) {
		System.out.println("잘못된 점수입니다.");
	}else {
		if (score>= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		}else if (score >= 60 ) {
			grade = 'D';
		}else {
			grade = 'F';
		}
			
		System.out.println("점수는" + score + ",학점은 " + grade);
	}
	}
}
		 
		

