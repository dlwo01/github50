package test;
import java.util.Scanner;

public class _01_IfSungjukEx{

	public static void main(String[] args) {//public을 puvlic로 써서 틀렸습니다

	int jumsu = 0;
	char result = ' ';

	Scanner input = new Scanner(System.in);
	System.out.println("점수입력" );
	jumsu = input.nextInt();

	if(jumsu >= 90) {
		result = 'A';
	}else if(jumsu >= 80) {
		result = 'B';
	}else if(jumsu >= 70) {
		result = 'C';// :이렇게 써서 틀렸습니다
	}else if(jumsu >= 60) {
		result = 'D';
	}else {	
		result = 'F';
	}
	
	System.out.println("점수는" + jumsu + ",학점은" + result);
}
}
// 90점