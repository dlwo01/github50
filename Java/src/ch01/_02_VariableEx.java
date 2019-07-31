package ch01;

public class _02_VariableEx {
	public static void main(String[] args) {
		/*메소드명, 번수명은 소문자로 시작한다.(cf. 글래스명은 대문자로 시작한다.)
		 * 변수 : 데이터를 담는 그릇이며, 데이터의 저장과 참조를 위해 메모리 공간을 할당받는다.
		 * 		반드시 먼저 선언 : 컴파일러는 변수의 자료형에 맞는 기억공간을 미리 확보
		 * 		선언 : 자료형이 먼저오고 가듬에 변수형이온다; ex) int a = 0;
		 * 		선언과 동시에 할당  : 자료형이오고 변수형이온다 = 초기화  ex) int a = 8;
		 * 
		 * 
		 * 1. 기본자료형(Primitive Type) : 실제갑이 저장
		 * 	 정수 : byte(1바이트) -> short(2바이트) -> int(4바이트) -> long(8바이트)
		 *	 실수형 : float(4바이트) -> double(8바이트)
		 *	 문자형 : char(2바이트)
		 *	 부울형 : boolean(true/false)
		 *
		 *
		 *
		 *2. 참조형(Reference Type) : 실제 객체를 가리키는 주소값 저장
		 *	 클래스,인터페이스,배열
		 *
		 *
		 * 문자열 : String 클래스
	
		
		*/
		int a = 8; // 변수선언, 초기화
		int b = 4;
		
		System.out.println("===int형 변수===");
		int addR = a + b;
		int subR = a - b;
		int mulR = a * b;
		int divR = a / b;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("a + b : " + addR);
		System.out.println("a - b : " + subR);
		System.out.println("a * b : " + mulR);
		System.out.println("a / b : " + divR);
		
		
		System.out.println("===char형 변수===");
		char c = 'K';
		//char d = ''; // 에러 ==> '' 빈칸줄것
		System.out.println("c : " + c);
		
		System.out.println("=== 문자열 출력===");
		String s = "java";
		System.out.println("s : " + s);
	    System.out.println("===실수형 출력===");
	    
	    double r = 99.9;
	    System.out.println("r : " + r);
	    
	    float f = 3.14f; // float형은 값뒤에 f를 붙여준다.
	    System.out.println("f : " + f);
	    
	    System.out.println("===부울형 출력===");
	    boolean t1 = true; // 참
	    boolean t2 = false; //거짓
	    System.out.println("t1 : " +t1);
	    System.out.println("t2 : " +t2);
	    
	    
	    
		
		
			
		
	}

}
