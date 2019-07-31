package ch02;

public class _02_IfEx {
	public static void main(String[] args) {
		
		/* 1. 점수는 score 변수, 학점은 grade
		 * 2. 점수가 90점 이상이면 A
		 *    점수가 80점 이상이면 B
		 *    점수가 70점 이상이면 C
		 *    점수가 60점 이상이면 D
		 *    점수가 60점 미만이면 F
		 *    결과==> 점수는 :, 학점은 :
		 */
		int score = 50;
		char grade = ' ';
		
		if(score >= 90) {
			grade = 'A';
		}else if (score >= 80 ) {
			grade = 'B';
		}else if (score >= 70 ) {
			grade = 'C';
		}else if (score >= 60 ) {
			grade =  'D';
		}else {
			grade = 'F';
				score = 50;
				System.out.println("grade");
		}
		System.out.println(" 점수는  "+ score + ", 학점은 "+ grade);
          }
		
		
	}


