package ch05;

public class _10_TwoArray {
	public static void main(String[] args) {
		/*
		 * ***성적표***
		 * 
		 * ============================
		 * 번호 국어     영어   수학     총점    평균
		 * ============================
		 * 1   100  100  100  300  100
		 * 2   90   70   50   270  90
		 * 3   80   40   70   240  80
		 * 4   70   70   60   270  70
		 * 5   60   80   40   180  60
		 * ============================
		 * 과목합계 400  400  400
		 * 평균 : 소수점 이하 둘째자리
		 * scores 2차원 배열 : 국, 영, 수
		 * 총점, 평균, 과목합계는 직접계산
		 */
		int[][] scores = {
							{100,100,100}
							,{90,70,50}
							,{80,40,70}
							,{70,70,60}
							,{60,80,40}
						};
		//타이틀 출력
		System.out.println("*************************성적표***********************");
		System.out.println("====================================================");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("====================================================");
		//행 : 학생수 5명 .. 배열의 길이..
		int korTot = 0;
		int engTot = 0;
		int mathTot = 0;
		double tavg = 0;
		
		for(int i = 0; i<scores.length; i++) {
			korTot += scores[i][0];
			engTot += scores[i][1];
			mathTot += scores[i][2];
			
			//korTot 누적 : 국어 total
			//engTot 누적 : 영어 total
			//mathTot 누적 : 수학 total
			
			
			System.out.println();
			System.out.print(i+1+"\t");
			//열:과목점수 출력..행의 길이 ..3개
			int total = 0; //학생별 과목 총점
			double avg = 0;
			
			for(int j = 0; j < scores[i].length; j++) {
				//총점계산
				//과목출력
				total += scores[i][j]; //총점계산
						
				
				System.out.print(scores[i][j]+ "\t");
				
			
			
			}
			//평균계산 및 출력 ,총점 출력
			avg=(double)total/scores[1].length; //평균 과목수로 나누셈
			char grade = ' ';
			switch((int)avg/10) {
			case  10 :
			case  9 : grade = 'A';
				break;
			case 8 : grade = 'B';
				break;
			case 7 : grade = 'C';
				break;
			case 6 : grade = 'D';
				break;
			default : grade ='F';
			
			
			
			}
			System.out.printf(total +"\t" + "%.2f\t" + grade,avg);
			
		
				
		}
		int Tot = korTot+engTot+mathTot;
		tavg = (double)Tot/3.0;
		
		//과목별 최종합격 출력
		System.out.println();
		System.out.println("====================================================");
		System.out.printf("과목별 합계" + "\t" + korTot + "\t" + engTot + "\t" + mathTot + "\t" + Tot + "\t%.2f",tavg);
		System.out.println();
		System.out.print("과목별 평균" +korTot/scores.length +"\t"+ engTot/scores.length +"\t"+ mathTot/scores.length);
		System.out.println();
		System.out.println("====================================================");
		System.out.println("행길이 :" + scores.length);
		System.out.println("열길이 :" + scores[0].length);
		
	}
							
}
/*
*************************성적표***********************
====================================================
번호	국어	영어	수학	총점	평균	학점
====================================================

1	100	100	100	300	100.00	A
2	90	70	50	210	70.00	C
3	80	40	70	190	63.33	D
4	70	70	60	200	66.67	D
5	60	80	40	180	60.00	D
====================================================
과목별 합계	400	360	320	1080	360.00
과목별 평균80	72	64
====================================================
행길이 :5
열길이 :3
*/
 
 
		

