package 복습2;

public class _01_TwoArray {
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
		
		System.out.println("*******************성적표*****************************");
		System.out.println("====================================================");
		System.out.println("점수\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("====================================================");
		
		int korTot = 0;
		int engTot = 0;
		int mathTot =0;
		for(int i = 0; i<scores.length; i++) {
			korTot += scores[i][0];
			engTot += scores[i][1];
			mathTot += scores[i][2];
			System.out.println();
			System.out.print(i+1+"\t");
			int tot = 0; 
			double avg = 0;
			char grade = ' ';
			for(int j = 0; j<scores[i].length; j++) {
				tot += scores[i][j];
				
				avg = (double)tot/3;
				
				switch((int)avg/10) {
				case 10 : 
				case 9 : grade = 'A';
					break;
				case 8 : grade = 'B';
					break;
				case 7 : grade = 'C';
					break;
				case 6 : grade = 'D';
					break;
				default : grade = 'F';
					
				}
				
			System.out.print(scores[i][j]+"\t");
				
			}
			System.out.printf(tot+"\t"+"%.2f\t"+grade,avg);
			
			
		}
		System.out.println();
		System.out.println("과목별 총점"+korTot+"\t"+engTot+"\t"+mathTot+"\t");
		System.out.println("과목별 평균"+korTot/scores.length+"\t"+engTot/scores.length+"\t"+mathTot/scores.length);
		
		}
		
		
		
		}
	
/*
 *******************성적표*****************************
====================================================
점수	국어	영어	수학	총점	평균	학점
====================================================

1	100	100	100	300	100.00	A
2	90	70	50	210	70.00	C
3	80	40	70	190	63.33	D
4	70	70	60	200	66.67	D
5	60	80	40	180	60.00	D
과목별 총점400	360	320	
과목별 평균80	72	64

 */
// 오타랑 줄넘기 틀렸습니다.


