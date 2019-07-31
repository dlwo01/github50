package ch02;

public class _06_SwitchCaseEx {
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
		// ranking에 따른 메달 색깔 출력
		int ranking = 1;
		char medalColor = ' ';
		
		switch(ranking) {
			case 1 : medalColor = 'G';
					break;
			case 2 :medalColor = 'S';
					break;
			case 3 :medalColor = 'B';
					break;
			default :	
					medalColor = 'S';
				}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
		}

}
