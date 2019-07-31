package test;

import java.util.Scanner;

public  class _02_testEx {

	public static void main(String[] args) {

//성적입력(0~100) 변수, score,reult, 유효값출력(잘못된입력)


	int score = 0;
	char result = ' ';

	Scanner input = new Scanner(System.in);
	System.out.println("점수입력 :");
	score = input.nextInt();

	if((score <= 100)||(score >= 0)) {
	System.out.println("잘못된 점수입니다");	
	}else { 
	
	switch(score/10) { // (score/10) 잘못씀
	case 10 :
	case 9:
	result = 'A';
	break;

	case 8 : 
	result = 'B';
	break;

	case 7 :
	result = 'C';
	break;

	case 6 :
	result = 'D';
	break;

	default :
	result = 'F';
}
	System.out.println("점수는" + score + "학점은"  + result); // 학점은,result 사이에 + 안붙임
}
}
}

// A,B,C,D,F 다 ; 안붙임





//구구단 3~5단출력
