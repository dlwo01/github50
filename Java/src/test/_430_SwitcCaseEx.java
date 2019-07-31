package test;

import java.util.Scanner;

public class _430_SwitcCaseEx {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		score = input.nextInt();
	
		switch(score/10){
		case 10 :

		case 9 : 
			grade = 'A';{
				break;
		}case 8 : 
			grade = 'B';{
				break;
		}case 7 : 
			grade = 'C';{
				break;
		}case 6 : 
			grade = 'D';{
				break;
		}default :
			grade = 'F';{
		}
		
		}
		System.out.println("점수는" + score + "학점은" + grade);
}
}
