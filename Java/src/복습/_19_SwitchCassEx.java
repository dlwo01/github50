package 복습;

import java.util.Scanner;

public class _19_SwitchCassEx {
	public static void main(String[] args) {
		/*
		 * switch(조건) {
		 * 	case 값1 : 수행문1;
		 * 		break;
		 * 	case 값2 : 수행문2;
		 * 		break;
		 * 	case 값3 : 수행문3;
		 * 		break;
		 * 	default : 수행문4;
		 * }
		 */
		/*case에 문자열 사용- 메달 출력
		 * Gold - 금메달입니다.
		 * Silver - 은메달입니다.
		 * Bronze - 동메달입니다.
		 * 메달이 없습니다.
		 */
		String medal = "";
		String jj = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("메달");
		medal = input.next();
		
		
		switch(medal) {
			case "GOLD" : jj = "금메달입니다";
				break;
			case "Silver" : jj = "은메달입니다";
				break;
			case "Bronze" : jj = "동메달입니다";
				break;
			default :
					jj = "없음";
		}
		System.out.println(jj);
		
		}
		
	}
/*메달
*GOLD
*금메달입니다
*/


