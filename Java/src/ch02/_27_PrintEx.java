package ch02;

public class _27_PrintEx {
	public static void main(String[] args) {
		/*
		 * printf(형식지정자, 값 또는 변수)
		 * - 형식지정자
		 * 
		 * %d : 정수를 출력. 예) System.out.printf("%D", 10);
		 * %f : 실수를 출력. 예) System.out.printf("%f", 3.14);
		 * %c : 한문자를 출력 예) System.out.printf("%c", 'k');
		 * %s : 문자열을 출력 예) System.out.printf("%s", "Hello");
		 */
		double value = 1.0 / 3.0;
		System.out.println("value :" + value);//value :0.3333333333333333
		System.out.printf("%f", value);//기본 6자리로 출력=0.333333
		System.out.println();//줄 바꿈
		System.out.printf("%6.2f", value);
		// (%전체자리수,나머지자리수f)=>6자리중 2자리만 표시해라 =0.33=>자릿수 부족시 공백으로 채운다.
		System.out.println();
		System.out.printf("%s","940305");//940305
	
	}
}
