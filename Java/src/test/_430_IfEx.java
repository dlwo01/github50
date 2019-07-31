package test;

import java.util.Scanner;

public class _430_IfEx {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		score = input.nextInt();
		
		if(score>=90){
			grade = 'A';
		}else if(score>=80){
			grade = 'B';
		}else if(score >=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		
		}
		System.out.println("점수는" + score + "학점은" + grade);
		}
}
